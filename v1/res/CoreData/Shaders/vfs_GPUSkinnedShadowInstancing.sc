QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p!�� �R`C��T}'���73�c1�����$�	���V�{��$��[",�&���@ڰ��3s<�Y@��C�)�y�V�|�lH��Ma�f�gH��(cC��"���/@	<���󪇄޻��-�.BW�q$����)']�擧����Ǳ��mX���E�)�����b��L���I�3�i�I��/D!�[~܄���h�4]l̈���(�����w��`iB^�z���QD�HJ��.�X��3�����������!�cܼj9�U����$�C�u��i:s��H�a��4�����Q��I��v����|=5����O�:����"[�}��	.��_Y�e��>dĴ����i��4���ej=�����!��\扲�$<�͇��<֟�x_@�����8���tp�p]�� ����~xJ<߾�g7�u_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * �;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr�g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
