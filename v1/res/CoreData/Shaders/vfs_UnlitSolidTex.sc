QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��sX
���L$&�^������i����+��&��}��Y~3Y�k���I�����WE�z`��7��D�`E� �w_�}�c�KF�0��~c:�4���oM:��f���ۋݻ��1�aO�8l��R��$M�Ꭴ�#�Ғp�։П)<Ъ�M�%�]�>�,��U��f�m��@�*��f��4As�T����]�gn�����-�\�����<��ig3�9���oH�XF��$�T��o��:�G��؜����� �I��nu�~���W�t�Y:Śz'0���'w��4�۔���~�[��u�맄2WS����_�3�w��͚Z�{�Gl�i^�[ ��<%�ǆ���c@��0�+��OJ����3Ġ����*.Ω�F��#���~]���\�!�gT���n=V�m_���� ueӮ��>dJ%���5y� transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = text�re2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
