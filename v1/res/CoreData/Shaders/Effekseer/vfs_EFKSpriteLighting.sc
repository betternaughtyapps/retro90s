QQQQ    �Hɦ�M���ͤw7��uߴyŅJo3�d2��Q]�K�i���ڨ�VU�8D�n��Y6o�Ul�/~���d�kk8s��0\���c�u������#�q���Hj��)��)��
Fd50�E�r�P͹���u~r�@A���Td�~�T �
�AR�}�6�c.�6��sl٫(���.Ey��O����ц��1�&�._H�`��PٻSqM\�Ъ��=��T��܍�Vk���v��,�1�]�1��\���}�U��K�(K�(���)%�#R�����,+�2E>������"�]��й�T��8&�/���	�\`F���C�� ��f�
���ҝ����D�/��b3�@����L<�D'��R>'���;��<��������� �ഽ&53�̷�C�X�<·��}�;��	q��Pt�r$��3`������Dg���_��x1s����b¤����d7���Z��5ȝ�zW���n���*���L�v]��4rb����&B���g|�c3 worldPos = a_position.xyz;
    // uv
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUV�nversed.x + mUVInversed.y * v_texcoord0.y;
    v_texcoord1 = vec4(a_texcoord1.x,a_texcoord1.y,0.0,0.0);
    v_texcoord1.y = m�VInversed.x + mUVInversed.y * v_texcoord1.y;

    // NBT
    vec3 worldNormal = (a_normal - vec3(0.5, 0.5, 0.5)) * 2.0;
   vec3 worldTangent = (a_tangent - vec3(0.5, 0.5, 0.5)) * 2.0;
    vec3 worldBinormal = cross(worldNormal, worldTangent);

   �v_WorldN = worldNormal;
    v_WorldB = worldBinormal;
    v_WorldT = worldTangent;
    vec3 pixelNormalDir = vec3(0.5, 0.5, �.0);

   vec4 cameraPos = uMatCamera * vec4(worldPos, 1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	gl_Position = uM�tProjection * cameraPos;

    v_WorldP = worldPos;
    v_color0 = a_color0;

    v_ScreenUV.xy = gl_Position.xy / gl_Posit�on.w;
    v_ScreenUV.xy = vec2(v_ScreenUV.x + 1.0, v_ScreenUV.y + 1.0) * 0.5;
}

#endif


#ifdef FS
$input v_color0
$i>put v_texcoord0
$input v_texcoord1
$input v_WorldP
$input v_WorldN
$input v_WorldT
$input v_WorldB
$input v_ScreenUV

/�/ ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(ColorTexture,0);
SAMPLER2D(NormalTexture,1);

uniform vec� LightDirection;
uniform vec4 LightColor;
uniform vec4 LightAmbient;

// Materials
uniform vec4 u_time;
// end materials>/// ----------  END UNIFORM


void main()
{

    vec3 texNormal = (texture2D(NormalTexture, v_texcoord0.xy).xyz - 0.5) * �.0;
    mat3 normalMatrix = mat3(v_WorldT.xyz, v_WorldB.xyz, v_WorldN.xyz );
    vec3 localNormal = normalize( normalMatrix *DtexNormal );
    float diffuse = max(0.0, dot(localNormal, LightDirection.xyz));

    gl_FragColor = v_color0 * texture2D(Co�orTexture, v_texcoord0.xy);
    gl_FragColor.xyz = gl_FragColor.xyz * (LightColor.xyz * diffuse + LightAmbient.xyz);

    ifDgl_FragColor.w <= 0.0) discard;

}

#endif
