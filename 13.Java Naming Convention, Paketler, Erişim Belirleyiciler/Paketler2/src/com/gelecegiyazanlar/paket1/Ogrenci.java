
package com.gelecegiyazanlar.paket1;

import com.gelecegiyazanlar.paket2.AdayOgrenci;


public class Ogrenci implements AdayOgrenci {

    @Override
    public void ders_calis() {
        System.out.println("Ders çalışıyorum...");
    }
    
}
