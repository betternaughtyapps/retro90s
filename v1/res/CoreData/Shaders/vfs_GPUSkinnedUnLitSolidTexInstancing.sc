QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���yNρJ��ѭd#(#1�!��X�,e盫��CN�v|��n�})�h�Q�
�RX�c��?o�'��i<��*���cm+D��D����Ђ��c�S:�'YT�q_��q�jJv)�Щ���������� vק�T�`�3�5�?���Ôr�lɘ@�*��f�E�r�P܇���Hf�(C#��Ɔ�� �K�����~��5Das�y��VI�Sk��1�s����D�F������ܥ�d��B�?���͝B�]�	��m>!��+�z\��{�����|�~�P��2�袄:rp������u��ө� �1��eu��&��� *������E`��
�Ķ`v?кݶ�0��V����h��x��(ۂ�#2U�͡�7��+��(st�.U��ۋXq��ɗv~ME���dc�def FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif�useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
