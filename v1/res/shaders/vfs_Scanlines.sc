QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��4;���'7�,������h��ňTc��l��8��Y~3z�$��Z�u!���Ŷo&�@AŠ@�;&�e� �c�Yn�_�6R�=O�)��C|a��)���/��%�ގ����:�(�b~�\ ҷQϣV`\\ޡ���>���?�����B{ܶ�ڥ"��.���U�́%�n���vK�#�D�)�0H<�TƇ���Tb�gn������.�U�����~��G!�6���]l���[��n��(� ���������7�fڿf:������#�L�M:��?22��H�HG��"�������^��\�ᦋ=4<�ݪ���a���'x�w��Ou��D �G1��7"l������&�T�O��>1}ڜ�tȨ�ò�d|���]��z̕�>W����fK��]p���%xs�nW����%nx樐�TdrHz���w$�,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.x�;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FS�
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"4
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Sh�ders/Library/Lighting.glsl"

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO�P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIG�TNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z� 1.0);
}

#endif
