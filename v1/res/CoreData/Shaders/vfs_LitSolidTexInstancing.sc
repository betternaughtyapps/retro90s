QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���ySĊ]����.$d=�+���_嵖��bc}�PG���00��C�F�;��L)��7��o�$��3h��"�Β�����#�<S�bT_�8d��j��mCf5��������ê�ɟ)<ݡ�H��`�,����c���X�C��p�3	�H�a��;L=�Th࠵��oA�e�Ы����2��댍+�;F�(���q�UF��L�V��c��D�F������ܥ�d��B�?�����m�T�Eu»q65���7��'������ ���v����=4:�ا���<�C�Ⱦ�P�9��{��v�5H��=a����̏��i�_��,%p�ٴ��t��W����k~���U��5���@�Р}�<��
5ֶ�L5� ����6wyѤ��8{uY)���
k�ro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 �   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USI�G_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"�
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v�normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.�gb,1.0);
}

#endif
