QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�sD&P�l���*�X`4��xH���51�O������ �ϕ�,9�j��9�Keb%&�:��.�U�����|i>�8?ŠL�q`�d�I�
�k_�w�k�I&�0��t*��>���o@D���箚����'�>�=0�8d��JȪ&u�����~���3㖇��Ps���,��/��:�7��騝�"���(�`��J�L1�O�ƶ��T`�^=������(�Y��⃒2��Dh^�u��IB�C��B�J��$��i�E����ǫ��n�Bٍ[:�[�����V�C�e��0a��S���3������N���	�간 36Ӄ����{���=E�Y��	<�5�1��oQp������Nk�����~q����0������*x����9ۃ�mQ��^�"��6h���K=5�f^��É!),�៭sdH)���c�wport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x�= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl�l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
