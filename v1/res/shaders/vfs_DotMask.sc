QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��4;���'7�,������h��ňTc��l��8��Y~3z�$��Z�u!���Ŷo&�@AŠ@�;&�e� �c�Yn�_�6R�=O�)��C|a��$���4Di��E�¨������#6�%UH�~F��MͽZ+o��������2�����0��N��/�_�"�7��^���'�v��I�)�a�K�D�}^�WT݊���C/�ia�����5���䋄,��W*�(���PJ�B����4��/�����ǿ��8�@y:����ʆ�3n�&_��v;s���?ӛ.�����Q��v��?�쬃tgy�د��d�<�F�Ȩ�^�&��	0��7�$��=l���Ì�St��J�V��sҗ���dȶ����:,���k��"ٟ�~�Ƿ �X��N<˾�'�
���3;J����~=8h���2~�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"

#include "o�erlay/DotMask.glsl"

void main()
{
   vec3 res = pow(texture2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask= 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and magenta
   ve�3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
                            �floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= �ask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/�.2)), 1.0);
}

#endif
