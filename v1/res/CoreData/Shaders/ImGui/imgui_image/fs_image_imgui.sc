QQQQ    �Oɮ�]
�����^ӈi�� ��<.�x9��[��2���ľ�s:,�~I�v�L�(+h�5e�(3~��6�qk6��Ej5���

x� 
������g�׃�eYՔ|��4��^[
5�:��#�"�ց��vu �X��W��F�i�X�f
��o�x�J/��3l/ŀ ��� S ��f������N�*�asy���V��Fst*���8��������Jyֶ���4�_����A�Ϋj�p���v3�e���+@0�T~𶯊�C4�MD ���ݢ7�[��Ƭ��O%�W���VA�A�������:���ñ�����!�H��n6�����@�V�n��U&���e\��0��ӌ���C��2�뢏8?=��Ɏ�h��}����;� ��js��x�l��X|�����O.�����@j7җ���e�����ehǮ�V��>���\P�٧U�r�� 8¿�/|w�eV����8zkЍ��1|vI$���>�
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled�
	gl_FragColor = vec4(color, alpha);
}

