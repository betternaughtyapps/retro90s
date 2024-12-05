QQQQ    �f��������Z{Ά|�a��5x!�l:6��F�1�y������|�~�C�v�Cxt�@yl����!�]%y��y_X���
%�Y������#��ٌl޼q��2��I_T31�+��
�Oѥ���96�S\��C�;8�~�A&�P�>G�r�K5�Y$�Fp��)|E��n���(Di������ޗ���Bv�u �}>����.�锬�q���.�����F?ϡ���t�Q�{�f��ͯ�(�g��I�\�y��9�'@s�^�����Rz�"b'��Ɔ��q������+��H2�z���VS�^���O����,�
�������Ƃ4�(��o0�[��̋Z�P�#��+w���cb��0�����Q�S�S��#�֪�1sT��ɠ�^�<�T���]9���k]Ɯ;�v��4V�����'�����,V���ߍU�<����EAҟ���j���hR�ѫ�2��$���SP�C}՗��u+"����y!E���$9�RGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3�14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, �0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, mCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESS�+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)�
}