QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^70�a'�?�V�v-t�NRl�E+u��+�[uR��tY���CPm�3������h����Eu�f��.��d#M!�!��
�_AȨ���SE�TA���SJ�e�B�G�sP�%� E�$�+��b;<˾9���T|r���衛֟���D~�ow�k��V��.L�钰�q���j����uO���S��{�u�9�8��A�χ�"��x�	*�e���u� Oڑ����2_'��ː� ���ư�1��z�(���2-�EI���L��uթ
�1���������(�W��}0������G�m
�Nn��j1:���7G��a춰���'�KǢ[��25+Ѝ����n�۩�|�e��#��
=�P7��$f������Zf��i�r�bl5�ź��q��U����o{Ҳ�^��.ș�7r>ε�T�6S��7���Kf� ����
Kcƨ��|7h���og�l(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(a�color0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#include�"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniXorm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform v�c4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}�


#endif
