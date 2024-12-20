QQQQ    �Hɦ�M���ͤw7��uߴyŅJo3�d2��Q]�K�i���ڨ�VU�8D�n��Y,e�[bl�K���4�@EZ=��t]���iV*�Z
�齛��)����,��&��8��Log;�<���uƩ���d:$�VZ���SJ�d�P�^�hn�t� i�n�gHǵr8�m��� 0N:��O����ц��1��2b7�ue��Oٻrf
�ߒ��\���}�ʕ�Gz�����)��%�q��_���d�o��	�d��a��;J!�TPҝ���yx�5]*�����z�2��쉎,��v<J�/���ZP�CE���S��L��'���������;�D��j8�@𹆩�@�_�Fu��kks��	�GC��0�����J�y�H��9���19m���ՊU�0�B����x�"��M<��:�H��_{���Om����Nl=�ź��0���Ŧ�*mݰ�G��3՞�t_�ޑY�&��7���m=t�p]���:u"����MuB<���"d�.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,�a_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan�ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinorSal = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + nor�alize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMa�Projection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 �ameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjecti�n * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_va osU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInvers�d.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inp�t v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uBackTexture0,0);

uniforY	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


void main()
{
	vec4 color�= v_color0;
	color.xyz = vec3(1.0,1.0,1.0);

   vec2 pos = v_vaPos.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;i
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos + (posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.� + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;
   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.Y;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInversedBack.x + mUVInversedBack.y * uv.y;

   	color.xyz = texture2D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
