QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p!��-�W	a:6��sX
���L$&�^������i����+��g��(��IG.6�)��W�^е���wv!�8§i�qo�H�I�D�6D�x�t�*�J6��i?
� У�oN`��H�䡝ʗ��>�/�~t�M��š@hL��ߎ�3���'��Ɣ�Lq���R��M�r�!�7��A�ˈ#���*�\f�,��	�(A6�Vqڋ���_ �&R<������5�W��쁀2��w$\�P����CY�����a��(� ��؜�����:�P��+}�^���ЗZ�V�Su��.qc��G�%�X���٥��Թk����
6�ķ�U�,���:U�t��'��Dt�Y)��&Qq�����Io�����e`$�إ� ��x̆��l`�����z���SU�ܯ_�6%��)ʨ�,H�8���9tm���T/7^���$k�edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Posit�on.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm�n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
