QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p �� �R`C��T}'���73�c1�����$�	���V�{��$��[",�&���@ڰ��}����+4��@�C�{�B�-A� D�?��B/ɐ糞KCH'����������	q� BC�?m߹Sߣ	3q�����8�Ē«���`V���+��o�<�:�1���̏m�p���\2�m���0Vs�Z����Oa�+D*������3�J��ƀ�3�5$�x���5Q�H���¸K��C�Eٲ؟�����*���b7�S����M�VL�D&��v0=���{��&�����Q�S���5��tx�ϱ�B��R����v�;��M,Ӱ
5�"��>S��§��Dj��i�r��ec7���А��鉽�cb��9��>ߖ�b��u�:��8���^Z�Rv�ʽ�<uoٴ��T0[B*���>%�arying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.gls�"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)�
}

#endif
