QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���ySĊ]����.$d=�+���_嵖��bc}�PG���00��C�F�;��L)��7��o�$��3h��"�Β�����#�<S�bT_�8d��j��mCf5��������ê�ɟ)<Ъ�M�%�]�>�,��U��y�k��	�5�.�a�`�9@5�X�����gA�	̈ŉ���U�����+�}:�z���MF� J@���śa��C������'�WԠrz�]�����I�J�&_��i0:���~_��XƎ���Q�S���5��tx�ϱ�B��R����|� ��GZ��8�X)��p|���C`�����@l1�֥��]̭����xa��]��6���ε��rS��:ɯ�$=7�iP���zVmֳ�� woH'���wL�nal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Librar�/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g�sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCoRor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texC�lor.rgb,1.0);
}

#endif
