QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^70�a'�?�V�v-t�NRl�E+u��+�[T%)I��by���nxN�_������*����eEڔh��4��d#~)=�'��X�X�����]o>�\c���!�y�\.�w�;��i�*�6��D3ˉ ���(D���稆�����P�}l�k��V��.L�钰�q���j����Vsͭ�H��/�6�,��w����w��A�+�a��J�z�P҅���Tf�|<D�����,�N��ϢӚr	-E�P��YH�Y��V�y�������������<�÷ha�q���̍z�T�&_��v9<��H�rR����������\����:95�ɦ���z�X�Ȧ�jZ�5����	;�6��_{�����Xc���KʤSs:����z����>9���[��zב�bWε�6�rS�
5���2ta�o\���� w$ش��MaB-���(`�atrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end�f

#ifdef FS

$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
unifo�m mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
Kniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random�1;

SAMPLER2D (CC_Texture0,0);


void main()
{
    gl_FragColor = v_fragmentColor *  texture2D(CC_Texture0, v_texCoord);�
}



#endif
