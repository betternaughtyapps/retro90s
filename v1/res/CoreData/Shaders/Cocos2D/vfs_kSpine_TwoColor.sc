QQQQ    �Hɦ�M���ͤw7��uߴyŅJo3�d2��k�T�r���F��]4-�}
�D�F�e7o�\=e�M3d���d�k}y��~X���
+�_������J�q���Hy�m����Feb%&�:��:�I�����t|�]Šn�+.�m�V�G�j�R�<V�~�:��9�"��,U}Ӎ(�̲�Л��� �5BS�
>��2��Mm_��ݯ�%���ӵ���Wmм�,��.��%�~��XЂ�H�O��j�4�t�f��4C<�ވ�הeL�
D"������h���&��F_Et�4��MJ�M[��!�e��3��%����Ĉ����'�Jǿ+#�Q����z�T�&_��v9<��H�rR������%����#�쥂&7y�Ƞ��x�
�^���vN�^��@z��	t�Z&�2Z������?�n�u��ec<�����d�� ����}\��y��(ӈ�uB�֪�3��DT���K=5� U����&rxܮ��I2z^$ק�+"�_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0�

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CC�PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVieIMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
unifor� vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa� alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + tex�olor.rgb * v_light.rgb;

}

#endif
