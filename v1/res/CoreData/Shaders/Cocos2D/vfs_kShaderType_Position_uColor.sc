QQQQ    �Hɦ�M���ͤ^Tҗn��l��zl4�cP�� Z�]�o�����r�0^�r��-n�^bs�O'd����yq6@��mj5���

�wD�é���(��ڈR.��J����[b?o�B���^�����$:�jx��.�*2�s�)�D�x^�|�g�]*�)��k8ж(���-@=��嵚ϩ����,�a][�b*��`�QiX��)���+�ϖ�N?ϡ����+�:�e��Y�ˀd�o��B�Hf�O�8��4H6�y7Ƈ���Tb�1T-������.�l�����T��r'�z���0s}���Wۄz��D�F���������`�
��i'�@��K�Z�F:��l7q��e�b_��:��Ӕ��S�y��3�ձ�>8�ߪ��6�X�G�ӣ�~�:��$��nt�e��!j������
3���W��`-&����@ߡ����ct���k��ۄ�e��M�1G��2)ʩ�5tz�.JὛ�d5<����~o!E��)n�f

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifo�m mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform�vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void m_in()
{
    gl_FragColor = u_color;
}


#endif
