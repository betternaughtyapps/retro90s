QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���yNρJ��ѭd#(.:�$���]`�����i5�GA��*�.5�%�H��<�>�L&�~�6��$(	�#ƣ�)o��%�ԓ����/�}T�%U\�?oыl�d[p2�ک�����޼��� {ܢ�O���6����y���C�F��d�3��H��4K6�!n�����h@�n�í���L���惔:��9(!�;���iF�
EA���I��L��C�Jֲ�������f�Kܴd'�A���׌O�J�Y8��1q}��e�4U��<��Ӿ�$� �o������w37������S�۵�<6�9��G2�8�2O˽$lԴ����'ڦ�u��,%s�޹��eɫU����xm�y��(���c]�֡U�;��C>ɩ�c� ���;x`����V^~I:���hG�cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
�
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR�
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECEwVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u�diffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_nor�al);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
