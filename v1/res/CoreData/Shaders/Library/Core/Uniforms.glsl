QQQQ    �D��F�����Nك;Ư-��5~$G�~}��Q�6����II��E>'�"B��Q�s6i�W�/Le��+�YEd+"��EM���.7�C��ֱ��!�Η�Gn��|��2��b"#�)���D!�����h?�XT��C�7�y�@#�O�NC�{� r�d�6��wa��G���'S$ӣ
ʵ������;�3QT�!e��hýO`o�����#�ىS��ǐ�Lm��@��`� �9�;��I�Їe�r��B�4�h�
��%^�y7Ƈ���Tb�*P:������$�h��*�u))
�3���5R�J@��B�[��a��9�
�������؊:�L��_�8���ő\��Haʻ@+:��S�D��3���ٵ�G�S��7�ౌ5*�٪� �_�;���|�<��Du�1�V&�rj״����X��
���a%%��㶶Ọ����Yx��w��5�˹
Z�١I�r��YyЅ�,|�nFݩ��:wc����y4B.���!*�AX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unif�rm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 u�lightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in on[ texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction light�cascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

�
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60�
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifo�m vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveCol?r;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalli�;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
