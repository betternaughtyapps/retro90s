QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cqU��Q�X�r���kc���E+*�q\�o�[�i7r�5e�(3~��6�qk6��Ej5���

x� 
������g�׃�eYՔ|��4��^[
5�:��#�"�ց��vu �X��W��F�i�X�f
��o�x�J/��3l/ŀ ��� S ��f������N�*�asy���V��Fst*���8��������Jyֶ���4�_����A�Ϋj�p���v3�e���+@0�T~𶯊�C4�MD ���ݢ7�[��Ƭ��O%�W���VA�A�������:���ñ�����!�H��n6�����@�V�n��Up���bU��w��ܵ���_��7���;74�����_�_�ܨ�~U�5��	iʯ1�o7��q������\a��D���$,^��ڜ�0������ye���Z��zׅ�$A���d�;��6ϗ�5o|�,qۘ��zxǨ��T>7]-���&U�osition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/c�mmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri�;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unifQrm vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

SAMPLER2D (CC_Texture0,0);






void main()�{
    gl_FragColor = texture2D(CC_Texture0, v_texCoord) * u_color;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.�);
}



#endif
