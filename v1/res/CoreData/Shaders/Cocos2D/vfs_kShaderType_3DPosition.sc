QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��[�T�-���	·�E{)�2E�t�.�Ru�Qkl�+q�̚�k55d+d��!7r���1�
������	�Àps�Y��)��r?o�B���^�����$:�jx���,)�0�. �C�qC�1�r�II�5��J-��5���4H/���즀����1�2�(fS�&G��rͻQmA'�����$���1�����W,���~أ2���*��T߯�~�k��U�\0�o�K�)�	L>�O0�����I}�gG+�������V����S��u.�7���\�0op���S��z��<����ѓ����n�f�j;�]�����$�3@�E6��{:s��F�[X��4��ܻ��\�I��9۫��vWS�����]�'��۳�3 �#��Exظ&�G~˽'l������Kz��	��{U!�ݚ��bĶNˬ��|c뤭Y��4�ٹ9ɟ��5��*̮�.s5� _���� w$����eGY'���g�worldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../�ibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma�4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_minTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void�main()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
