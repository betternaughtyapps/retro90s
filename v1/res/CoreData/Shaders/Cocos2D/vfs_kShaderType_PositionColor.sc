QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��[�T�-���	·�E{)�7X�|�F�ro�We�(ey��1�QEZ+q9��xH���!0�������4�^���,o�o��0��]?g����E�����~s4�GX���j`�H�i �^�HX�f�.g�c�1v��
F�+���a@=��(�ފ�����KS�4^S�>x��Rͻ$z?�«��0���&�����Jyֶ���4�_����X��n�O��j�4�t�_�Q�WP=�R��ێ�R<�r������L�����T��r'�z���0s{���7��/��&���߇��ִ�K�f0�?���ʘA�TC�N6��\���~\��Xƀ�����P��b�ƀ�;7�®�� �_�;�Ԯ�|�t��](��;"�Z2��=H���ڜ'ڦ���ad:�����k��U憲�fSү�]��5�Љ,A���N�z��<Ҋ�.wX�t@��DA㌋�{oh��"i�(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#include "../L�brary/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform m�t4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CCaSinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}


�endif
