QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�w_%_�/L3��-�QE-VX��N ���16s� \������"�^�ދT{��&��/��`e7!�f���]!���Ź?:=�AE��n�}$�m�J��W�N�-I�=U�%��KAf��(���$@t��,�ȉ����+�3�t
�[)��\��Ga^�柰�#�?�����xշ���M�P�x���A���#�l��H�5� ���.C<�N���͔�dX ���բc�Q��䝘qϡv	'�=���*�~&Y���W��/��D���؜����� �I��nu�~���W�t�Y:Şp,:���QX��9⒟��S�y���v�쭎8/=؍�ϪY�4�H����a���D}��:�Sk��!'���
-���
��,'�ե��i������^i���[��j���m�ӽW�_y��gz���({�8����0},���y8gߣ�7�
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, �ransforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColo� = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + enviLonmentColor) * u_matDiffColor.rgb,1.0);
}

#endif
