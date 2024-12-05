QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��44��� :�|������7��ЅUv����r��IF~3$�<�[�J�����CS�j|��6��S�k:�n�;�x� j�o�Hl��K%��?ڬ� X ��E��������d�_q�_W�>d��J¦EkK����#���8�Ċ�1���,��)��"�;��ʍ�b�p��^�?)�a���.Iq�~0�����b�._f��ݽ�a�ճ⃾�r!�z���ZD�[Mp���N��/ے0�Iȼȕ�����n�Í0�Q�������_0��p0!��F�n
ӛ(��М���,��u�㧈2z�Ɏ��z�X�ʲ��0��@r��1�q��>P�˛���eA��T�uɸbf?�Ӳ��>��9����xu���F��4���`X��6�}\�.6ȷ�/==�n[����&7Ԭ��`dh���)y�orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
�   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin� samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, vatexcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  �        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(�_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texco�rd0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * �.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += t5xture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec�(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
