QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������"�^�ދT{��&��/��`e7!�f���]!���Ź?:=�AE��n�}$�m�J��W�N�-I�=U�%��KAf��(���$@t��,�ȉ����+�3�t
�[)��YšF$l/��������߰��t\���e��c��>�;¸��T�L��s�:�K�$�g�~L=�H׌���Om�&C7�ԋ���/������S��KgQ���PI�[YA���W��m՞;����������`���(<�Q������P�J'��\0>���p]��w������K��8����/WS�����;�]�ޢ�19�6��[e��7�Pj��!q������Kb�����%sҗ���~΢ �ò�Fe��F��ۓ�cPz�ͣZ���w¶�-?� �痊<uoٴ��T0[B*���>%�acro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     //#include "Library/Macro/FragPosFinal.gls�"

     v_FragPos = position.xyz;
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCO�RD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS

#include "Library/Varying.glsl"

/// Common (uniforms,saSplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main�)
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0.xy);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
�   vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
�

#endif
