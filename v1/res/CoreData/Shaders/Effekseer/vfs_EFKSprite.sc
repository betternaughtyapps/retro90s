QQQQ    �Hɦ�M���ͤw7��uߴyŅJo3�d2��Q]�K�i���ڨ�VU�8D�n��Y,e�[bl�K��k�P l1s��uO���nxg�_�����$����+��|��(�v",�'���r&�����enr�jC���SJ�d�P�^�hn�p�u�d �7��r8L��;���25,C��H�落і��L�^q�(RH�#sޜ^ߪgV����9���S��ǐ�Lm��@��`� �8�2��M�Џs���I�)�a���}P�XĹ���kn�5X6������'�J��莕j��V<=�7���*�BF�����5��<�������!���~;�T��惈K�C�~��i:!���;ӛ#���ٮ����-����t,<ޙ��V�'�a���3 �5��Hq�t�3��fYd�����Ca�����"5zɺݶ�0������Zc����7߂�\G��X�?��=6���z�
���9D\ڲ��}yu߿�&~�rojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 c�meraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection � cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +�mUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaP�sR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unif�rm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    vec4 _baseColor =  texture2D(uTexture0,�v_texcoord0.xy);

    gl_FragColor = v_color0 * _baseColor;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
