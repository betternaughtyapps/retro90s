QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���yI��G��ґc
b)7�=��X�3Eˮ���?L7�AP���+4�l�W�'�;�>�Ci�z�O��c)
�(���.f��$�՘����"�z}�$VS�4*��v�|Mw3�ۢ��	����Ȥ�Gz߭�D���1����x��J�M��h�.����3@s�'t�����iZ�w�ź��K�Q��隅;��W*�(���^U�BHϊ�VɸK��f�J�ї�����;�Lӽy8����џ@�_�F&��1qs��b�sT��;�ՠ��?�:�a��u�렁!><����I�'��ժ�|�3��E>��i^�P,��?l޼栨�'��D�_ɸbf?�Ӳ��\Ĭ���Gm����)ӄ�cr�ѯW�5��OT���a=5�i\����0;.����`n���(%�ormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     �include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INO�T_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifoLms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

v�id main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif�
