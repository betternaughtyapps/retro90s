QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���yNρJ��ѭd#(.:�$���]`�����i5�GA��*�.5�%�H��<�>�L&�~�6��$(	�#ƣ�)o��%�ԓ����/�}T�%U\�?oыl�d[p2�ک�����޼��� {ܢ�O���6����y���C�F��d�3��H��1P7�T�����Tv�P<�����-�Tמ���q��;''�5��JI�C]��B��� ��/���ؒ�����D�Aдb;������e�w-�e��<6=���r��<�����^��K��x�鰁vWS����_�8�X����^��	<��:�S0��rSI������C���P��l'�عЪ~̢[����(����yӞ�`
P���w�0��v軆3r:�o@����<um�~5&B���g*�include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///�input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl�l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

voidmain()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
