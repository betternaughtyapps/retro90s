QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������"�^�ދT{��&��/��`e7!�f���]!���Ź?:=�AE��n�}$�m�J��W�N�-I�=U�%��KAf��(���$@t��,�ȉ����+�3�t
�[)��\��Ga^�柰�#�?�����xշ���M�P�x���A���#�l��H�5� ���.C<�N���͔�dX ���բc�Q��䝘qϡv	'�=���*�~&Y���W��/��D���؜����� �I��nu�~���W�t�Y:Şp,:���QX��9⒟��S�y���v�쭎8/=؍�ϪY�4�H����a���D}��:�Sk��!'���
-���
��,'�ե��i������^i���[��j���m�ӽW�_y��gT���bx{�iT�ͺ�vrjѤ��2A!E���h*�nput
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,sample�s, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = te�ture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLight}olor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
}

#endif
