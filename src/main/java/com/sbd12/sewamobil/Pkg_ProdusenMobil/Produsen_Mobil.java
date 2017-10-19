package com.sbd12.sewamobil.Pkg_ProdusenMobil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArieDZ_2
 */
public class Produsen_Mobil {
   private String id_produsen;
   private String nama_produsen;

   public void setId(String id) {
      this.id_produsen = id;
   }
   public String getId() {
      return id_produsen;
   }
   public void setNama(String nama) {
      this.nama_produsen = nama;
   }
   public String getNama() {
      return nama_produsen;
   }
}
