QQQQ    �Hɦ�M���ͤw7��4��c��a|c�k4�� g�u�B���2,�ʠ?:�8D�;�p�H_�}U+Q�p ��-�W	a:6��sX
���L$&�^������i����+��&��}��Y~3Y�k���I�����WE�z`��7��D�`E� �w_�}�c�KF�0��~c:�4���oM:��f���ۋݻ��1�aO�8l��R��$M�Ꭴ�#�Ғp�։П)<Ъ�M�%�]�>�,��U��f�m��@�*��f��4C<�Ō�הSP�.]"�����$�L����S��t,^�;���*�!%��B�ĕ.��,����ݫ���/�LԼX�������M�Xo��h($ܼ�|B��{�����A�G���y�쯁658�ɪ���0�E����{�1��Np�KY�2O�rQh������Nk�����,h2����}ª����}%�͇��z�ߔJF���X�>��CT���a=x�dW����"@<�گT/7f���J �   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]�1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    �odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vertWces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPo�.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, �ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FS�

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )�
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex| v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
