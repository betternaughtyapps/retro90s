QQQQ    �f���KJ�����*RώoƮc͂yp4G�a8��]�S�1���Iۦ�C2'�?N�c�U�ek �g}m�V/�ѷN�9oX%6��yX���COc�O����ϊ|�v���n�'��`��]#11�|��'�_�����>b+��J�~5�f�P�R�]�e�]�~�:��c)��m�޺zm+i��K����Ҧ�
�v�$S�0U��LŻJkWR��������~��Ę�Qv���M�4�$�6�,��e�ƃs�(���\w�%�f�J�}'������I{�1T-������2�L�����'��*JxW�z�Ш^S�T���N��,��;�����˫���n���"n�8�����C��u��/d^��H�7C�� ���ٷ�S���3�ᔈ==1ɖΉ�6�X�G���t���Gr�4;�V1��<Ys������Za�����z`0Ɨ�ɴuĩ����i8���]��3ٕ�%r>����rS��m���*t{�eVȨ��!rc����wt`���n1�
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x);
    _skinnedPosition += skinPosition(blendWeigh�, matrixIndex,a_position);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y);
    _skinnedPosition += skinPos�tion(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.z;
//    matrixIndex = int(a_indices.z);
//    _skinPedPosition += skinPosition(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.w;
//    matrixIndex = int(a_in�ices.w);
//    _skinnedPosition += skinPosition(blendWeight, matrixIndex,a_position);
    return _skinnedPosition;
}

vec3�skinTangentSpaceVector(vec3 norm, float blendWeight, int matrixIndex)
{
    vec3 tmp = vec3(1.0);
    tmp.x = dot(norm, u_ma�rixPalette[matrixIndex].xyz);
    tmp.y = dot(norm, u_matrixPalette[matrixIndex + 1].xyz);
    tmp.z = dot(norm, u_matrixPale�te[matrixIndex + 2].xyz);
    return tmp * blendWeight;
}

vec3 getTangentSpaceVector(vec3 norm,vec4 a_weight,vec4 a_indice#)
{
    vec3 _skinnedNormal = vec3(0.0);
    // Transform normal to view space using matrix palette with four matrices used �o transform a vertex.
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x) * 3;
    _skinnedNormal +=�skinTangentSpaceVector(norm, blendWeight, matrixIndex);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y) * 3;9
    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight = a_weight.z;
//    matrixIn�ex = int(a_indices.z) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight Y a_weight.w;
//    matrixIndex = int(a_indices.w) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matr�xIndex);
    return _skinnedNormal;
}

vec3 getSkinnedNormal(vec3 a_normal,vec4 a_weight,vec4 a_indices)
{
    return get8angentSpaceVector(a_normal,a_weight,a_indices);
}

#if defined(BUMPED)

vec3 getTangent()
{
    return getTangentSpaceVector(a_tangent);
}

vec3 getBinormal()
{
    return getTangentSpaceVector(a_bitangent);
}
#endif

