QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^70�a'�?�V�v-t�NR{�a)���d�k
d8{��ny���nxN�'u������*����YɆY��)��M!�!��
�_AȨ���SE�YA��
�)�j�V�q�C
��o�x�J/��3l/ŀ ���5H1��a�ﮒˀ���j�se�Z��Kަ[?4v�ᔤ�#ց�?�̉��|R̨�H��%�2��?��E���V���I�)�a���}f�:R�����G{�.Iü����.�U�����~ύD0!�a���QN�^B������� �1���������(�W��}0������A�m
�Nn��j1:���7G��a춰����K��m����w37�����{��ӥ�r�{��Zy��9�P+��:S�����Xc���KʤSs:����z�������Pΰ;Ӟ�%r>����rS��2	ʩ�5tz� ����}vy�韭{r\���
k�rix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    v_texCoord = a_texcoord0;
    v_fragmentColor = a_color0;
}


#endif
�#ifdef FS
$input v_texCoord, v_fragmentColor

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4�CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniformmat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

�AMPLER2D (CC_Texture0,0);




void main()
{
     gl_FragColor = vec4( v_fragmentColor.rgb,v_fragmentColor.a) * texture2D�CC_Texture0, v_texCoord).a ;
}



#endif
