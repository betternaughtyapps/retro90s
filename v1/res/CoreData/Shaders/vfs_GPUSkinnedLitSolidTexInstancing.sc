QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������g�/���yNρJ��ѭd#(#1�!��X�,e盫��CN�v|��n�})�h�Q�
�RX�c��?o�'��i<��*���cm+D��D����Ђ��c�S:�'YT�q_��q�jJv)�г�����T��̟�Mz���h؋�1����t���Y�2��� �b�K�9�b�:r潤��gK�r�Ю���%�^���ϴŀ\;0��Ѓmf�#c|��A�T��4��i�)������Ê<�L۵%2�A�����$�L�h:��p1sڮ�q^��&��Ӎ�� �I��%����tsT����R�0�v���X<���n�� 1�V+��?V�Ձ���mݏ���h`s�����q߷Z����eb���G��W���z]���Z�<[�g"���a=5�#[����1~,����seRg���5e�PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i�clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en�if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defiPe USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_S�ADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu�eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);�
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
