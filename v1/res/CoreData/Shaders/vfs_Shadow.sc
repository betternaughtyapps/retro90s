QQQQ    �Hɦ�M���ͤw7��4��-��ejMm�i8���h�S���#;��<Q|�?I�n�F�$i�Jlg�t#b����D+8z��87r���%�D꜏����2��yJŊ@��ۑc
b)7�=��X�3Eˮ���?L3�L\��M�23�)�.x��1�~�i�I"�+��u!��m���/G&�����ڄۖ�M�=�4T_�sF��MͽZ+z�⒬�6���|����Lv��@��h�r�,�T��ā�e�n��B�^
�n�
��D0�ㆈ��O`�X ������-�5�����q��t-^�5���T�OJ��B���.��i�EĲ�������'�Lڼ%-�������Q�n��?s���c��h�ݔ��!� �R��8����tkw����	�e�<�u�5��],��D!�\$��3`�¦���E|��T�D��,%s�۸��0��U����im��P��ӕ�|F���f�_y�M?ɵ�5=a� ����4hoԥ��"{r\8���8�;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *�2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
�#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floaJ depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_�plat(0);
}

#endif
