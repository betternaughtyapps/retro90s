QQQQ    �f��N����/b�R�D�� %�-:��%a�P�s���6Ů�X41�#E�O�[�o,h�Q`,�Q'}���6�pEZs��tS�ѝ"�
	�������P�ۆGn��`��t��$gt�h���޵���0'r�@j���78�j�A�O�/l�i�n�I*�.��sl�*���|@	<��
��������C�j����EhV��������+�͜�?̛�@�)�/�;�*��w���q���-�\f�j���+s�T[߆���Oa�oE'��ʌ��$�_����q��~/�a����@@��B�ˈa��i�EȼȜ�����)�Q��u����̟Z�LC�#��k:+��,�8��1�����|�S���3ֱ�5.8�����^�!�C����|�!��LdԷ9�I ��z)ƥ恒�݌D�_��o1s�֣��0������xi���[��/��t>Z���M�1A��A/���q4.�
?�痉um����2*`׮�3k�.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) � maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1�0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(tiSe - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    flo�t width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 �  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float p�rPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPix�l;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCountk


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data1�y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    ret�rn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithT]me(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1�vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    	odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
