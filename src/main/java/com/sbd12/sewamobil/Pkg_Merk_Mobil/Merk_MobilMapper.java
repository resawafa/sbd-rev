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
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class Merk_MobilMapper implements RowMapper<Merk_Mobil> {
   @Override
   public Merk_Mobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      Merk_Mobil merkMobil = new Merk_Mobil();
      merkMobil.setIdMerk(rs.getString("id_Merk_mobil"));
      merkMobil.setIdProd(rs.getString("id_produsen_mobil"));
      merkMobil.setIdJenis(rs.getString("id_jenis_mobil"));
      merkMobil.setNama(rs.getString("nama_mobil"));
      merkMobil.setNamaProd(rs.getString("nama_produsen"));
      merkMobil.setNamaJenis(rs.getString("nama_jenis"));
      
      
      
      return merkMobil;
   }
}