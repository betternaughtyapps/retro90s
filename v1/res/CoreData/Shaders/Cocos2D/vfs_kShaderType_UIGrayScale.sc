QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^70�a'�?�V�v-t�NRl�E+u��+�[T%)I��by���nxN�'u������*����YɆY��)��M!�!��
�_AȨ���SE�YA��
�)�j�V�q�C
��o�x�J/��3l/ŀ ���5H1��a�ﮒˀ���j�se�Z��Kަ[?4v�ᔤ�#ց�?�̉��|R̨�H��%�2��?��E���V���I�)�a���}f�:R�����G{�.Iü����.�U�����~ύD0!�a���QN�^B������� �1���������(�W��}0������A�m
�Nn��j1:���7G��a춰����K��m����w37�����{��ӥ�r�{��Zy��9�P+��:S�����Xc���KʤSs:����z�������Pΰ;Ӟ�%r>����rS��2	ʩ�5tz� ����}nSè��$`xA���.r�, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$in�ut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM�trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Normalsatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_T�xture0,0);




void main()
{
    vec4 c = texture2D(CC_Texture0, v_texCoord);
    c = v_fragmentColor * c;
    gl_Frag�olor.xyz = vec3(0.2126*c.r + 0.7152*c.g + 0.0722*c.b);
    gl_FragColor.w = c.w;
}




#endif
