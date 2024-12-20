QQQQ    �Hɦ�L�Ā��2i�B��^��5?V`D�h;��Up�i�^���(6���y�\ �;��b=f�VhHM�mO����Tu6��9^���R�c1�������N���:��m��4��IeB ���(�,!�����y|_�8?���;&�Y�g0�|�Zn�Y�'I�d �,��r(	�����..�����������zS�7UY�qf��O��Fg
\�����b�Þ8��ȍ�W6�Έ,��`�_�2�+�����+�"���Rv�x�K�J�f(Y�y7Ō�Дe`�7D:�ʏ���1�]��棈9�3-�z��RF�%IL���7��L��i�E��������� �fھd'�������f�N;��z2:�� �eX��:�����,�C�
��%�ୈ?4�޳�I�6�^�յ�#(�e��\C�:�w ��!m�����Fa��T�$،%>^�����fȭF����Ic����,ߓ�$
k�ܫU���)Ϳ�(~V�l]꜆�+Q����wyN ���4z�ericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericC�lor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    float�minEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjustedzot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

 �  //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equa�or color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equa�orColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    float�smoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) { lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate(�quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColor�* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
   return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.x�z;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenghtD= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 �      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTye = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(normal);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


