QQQQ    �Hɦ�M�����=b��T��R��GR7j�-}U��R�^�=���lI��4*�!_�;�|�i*m�T b>�f3��-�9oX%6��|^�ѽ0I�
_������3�
�نTw���}��JLe#=�E���E����3s4�PS��0��B�k �u�Q}�C�n�I*�I+��b*LЌ@���a@&����������S�a�ro��V��)$\ܬ���4݁���ٲ;Ъ�T��6��%�?��&Ă�+�g��N�qL�i���W(Y�[׌���uF� n�Ϳ����{��׫�S��;Dh]�<��q�~&��B�U��1��i�:���������C���+v�\������C�B3��y��b�7��<�������^��9����^zy����_�3�;�ߩ�z�^��
u�2�j��.L�ۚ���oV��+�;��%sҗ���tȨU����*,��[��*τ�z @�ǭT� ��gy���bx{�iT�͗�u;/ܧ��2QxE���g*�input v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifd�f FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   �#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positiQn
#endif
#ifdef FS
$input v_position
#endif
#endif
