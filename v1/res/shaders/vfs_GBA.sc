QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��4;���'7�,������h��ňTc��l��8��Y~3z�$��Z�u!���Ŷo&�@AŠ@�;&�e� �c�Yn�_�6R�=O�)��C|a��$���4Di��E�¨������#6�%UH�~F��MͽZ+o��������2�����0��N��/�_�"�7��^���'�v��I�)�a�K�D�}^�WT݊���C/�ia�����5���䋄,��W*�(���PJ�B����4��/�����ǿ��8�@y:����ʆ�3n�&_��v;s���?ӛ.�����Q��v��?�쬃tgy�د��d�<�F�Ȩ�^�&��	0��7�$��=l���Ì�St��J�V��sҗ���dȶ����:,���k��"ٟ�~�Ƿ �X��N<˾�'�
���3;J����~=8h���2~�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


#include �overlay/Default.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor.rgb = texCoRor.rgb;
    gl_FragColor.a = 1.0;
}

#endif
