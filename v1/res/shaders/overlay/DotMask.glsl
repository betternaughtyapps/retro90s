QQQQ    �f��������ZNԆ��@��~?EnW�~��Z��R���5"��c�b�+��{d�^d{�O'c��6�UV0R��\���0�f����΍r�v���B�g����Jng!�,���I����3~7�\[���;8�d�V�\�jT�r�t�Y$�O��c)
�(���9T;���������]�@p�m�:��5��FbP�����!���7�����@-�����l�G�y�w���ǀb�g��H�%�_��J�8Fg� X˝���uf�"n�چ���@�����7��2DgQ�3��M�T[���S��a��i���������m�@ӻe0�]���ʄK�O�}��k/&���r��{���ٌ��R��,Ь��YPz�ȥ�^�8�U�ܦ�g�t��Ldֶ&�=�r"j�����Pk��D�_��xv:�����?������Ye���L��u���dP���V�!�g/���aPt�k�ԛukc����h߼�$9�mask = vec3(maskDark, maskDark, maskDark);

   // Very compressed TV style shadow mask.
   if (shadowMask == 1.0)
   {
   �  float line = maskLight;
      float odd  = 0.0;

      if (fract(pos.x/6.0) < 0.5)
         odd = 1.0;
      if (fract((�os.y + odd)/2.0) < 0.5)
         line = maskDark;

      pos.x = fract(pos.x/3.0);

      if      (pos.x < 0.333) mask.r =maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskLight;
      mask*=l�ne;
   }

   // Aperture-grille.
   else if (shadowMask == 2.0)
   {
      pos.x = fract(pos.x/3.0);

      if      (po�.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = mask�ight;
   }

   // Stretched VGA style shadow mask (same as prior shaders).
   else if (shadowMask == 3.0)
   {
      pos.� += pos.y*3.0;
      pos.x  = fract(pos.x/6.0);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0~666) mask.g = maskLight;
      else                    mask.b = maskLight;
   }

   // VGA style shadow mask.
   else if (�hadowMask == 4.0)
   {
      pos.xy = floor(pos.xy*vec2(1.0, 0.5));
      pos.x += pos.y*3.0;
      pos.x  = fract(pos.x/6.�);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                   mask.b = maskLight;
   }

   return mask;
}

//void main()
//{
//    vec4 texColor = texture2D(u_diffuseTex,v�texcoord0);
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

void main_()
{
   vec3 res = pow(texure2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:�   //Output pixels are alternately tinted green and magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
              L              vec3(mask, 1.0, mask),
                             floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   �

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/2.2)), 1.0);
}