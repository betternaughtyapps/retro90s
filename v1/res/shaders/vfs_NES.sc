QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��4;���'7�,������h��ňTc��l��8��Y~3z�$��Z�u!���Ŷo&�@AŠ@�;&�e� �c�Yn�_�6R�=O�)��C|a��$���4Di��E�¨������#6�%UH�~F��MͽZ+o��������2�����0��N��/�_�"�7��^���'�v��I�)�a�K�D�}^�WT݊���C/�ia�����5���䋄,��W*�(���PJ�B����4��/�����ǿ��8�@y:����ʆ�3n�&_��v;s���?ӛ.�����Q��v��?�쬃tgy�د��d�<�F�Ȩ�^�&��	0��7�$��=l���Ì�St��J�V��sҗ���dȶ����:,���k��"ٟ�~�Ƿ �X��N<˾�'�
���3;J����~=8h���2~�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p�letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float ] = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textu�e2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
