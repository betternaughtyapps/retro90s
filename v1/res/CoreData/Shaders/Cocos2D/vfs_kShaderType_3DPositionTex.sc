QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^)2�='�?�V�v-t�NR{�a)���N�>l9y��:W��� 1�g����ĮM��цTw��h��}��6d~+ ����2Mݮ���$Gi�?@���,-�f�PA�i�A|�\�t�1�`7��a#�� ���a#b��;�ೆ͊��d�7�.BW�<k���|IL�櫫�&����ې�x+���+�)��:�3����T�m��F�1'�~��g�(K:�O�ɍ��/�n���4�Q�����(�/D=�	��VJ�H!%���U��a��*�E�ѧ������+�(��e<�]��՛M� �t��{0>��S�<Բ<������Q���?����-u�ަ��T�8�_�ɯ��^��@z��	t�Z&�'.v�����Gg�����Oj?�Ō��+�� ����xa���W��/��k@�ּ^�&��VT���({z�m�ԝunS٨�� QxG'���M�
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.�));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end�f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVieIPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Nor�alMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C�_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)�
}


#endif
