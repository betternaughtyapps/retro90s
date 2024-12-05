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
SAMPLER2D(u_paletteTex,1);

#include "overlay/Scanlines.glsl"

void _main_()
{
    vec4 texC�lor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float c = floor((a * 256.0) / 127.5);
    float x =�a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = texture2D(u_paletteTex, curPt).rgb;
    gl_FragCol�r.a = 1.0;
}

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floatpc = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

   vec2 sine_comp = vec2(SC�NLINE_SINE_COMP_A, SCANLINE_SINE_COMP_B);
   vec3 res = texture2D(u_paletteTex, curPt).rgb;
   vec3 scanline = res * (SCANLIN�_BASE_BRIGHTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y,scanline.z, 1.0);
}

#endif
