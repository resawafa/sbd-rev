package com.sbd12.sewamobil.Pkg_Merk_Mobil;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArieDZ_2
 */
public class Merk_Mobil {
   private String id_merk_mobil;
   private String nama_Merk_Mobil;
   private String id_produsen_mobil;
   private String nama_produsen_mobil;
   private String id_jenis;
   private String nama_jenis;

   public void setIdMerk(String id) {
      this.id_merk_mobil = id;
   }
   public String getIdMerk() {
      return id_merk_mobil;
   }
   public void setNama(String nama) {
      this.nama_Merk_Mobil = nama;
   }
   public String getNama() {
      return nama_Merk_Mobil;
   }
   
   public void setIdProd(String id_produsen_mobil) {
      this.id_produsen_mobil = id_produsen_mobil;
   }
   public String getIdProd() {
      return id_produsen_mobil;
   }
   
   public void setNamaProd(String nama_produsen_mobil) {
      this.nama_produsen_mobil = nama_produsen_mobil;
   }
   public String getNamaProd() {
      return nama_produsen_mobil;
   }
   
   public void setIdJenis(String id_jenis) {
      this.id_jenis = id_jenis;
   }
   public String getIdJenis() {
      return id_jenis;
   }
   
   public void setNamaJenis(String nama_jenis) {
      this.nama_jenis = nama_jenis;
   }
   public String getNamaJenis() {
      return nama_jenis;
   }
}
