QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cq��X�I���Ʋ�- �#K�v�M�E7l�J b�/Le��+�YEd+"��Ye(���;�'u������*����YɆD��)�� L|�<�� �Kq�����y|=�X���~�T�r8�^�wI��h�e�b��sxLŜ���U;��P����͔���?�uy�G��KřJaN1�߰��#���j�ä��Mv߫�L��!�L����^�ÊF�v��_�qL�b���}S6�@𪤷�Kj�J;;�����a�]�����ߧu0!�a���QN�^B�������&�1���������(�W��}0������O�]�d��RYѲ�{D��u���֏��T۶����754�­��S�X�<�ϩ�u�9�Hh���V �� o��������
���a%>��㶶Oڡ����~~븶9�5Ӕ�a]���6�)~ƘMy���Mz�iF�ىh;a��+d~N?���-G�trix, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#inc�ude "../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;�uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
unifoLm vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{

    gl_FragColor = v_fragmentCol�r;
}


#endif
