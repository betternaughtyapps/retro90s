QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���JIט�^70�a'�?�V�v-t�NRl�E+u��+�[T%)I��by���nxN�_������*����eEڔh��4��d#~)=�'��X�X�����]o>�\c���!�y�\.�w�;��i�*�6��D3ˉ ���(D���稆�����P�}l�k��V��.L�钰�q���j����Vsͭ�H��/�6�,��w����w��A�+�a��J�z�P҅���Tf�|<D�����,�N��ϢӚr	-E�P��YH�Y��V�y�������������<�÷ha�q���̍z�T�&_��v9<��H�rR����������\����=<6�����X�u�n�ַ�rN�^��
u��!�Ze�|^I������L�����aj=�Ŀ���� ����xa���@��/��id�Фv�&��VT���7r|� _��ف|����T27L$���4c�ion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a�* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_�exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 C�_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


void�main()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * �tep(0.0, 1.0 - length(v_texCoord));
}


#endif
