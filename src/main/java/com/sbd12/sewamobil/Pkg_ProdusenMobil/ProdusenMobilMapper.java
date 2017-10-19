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
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProdusenMobilMapper implements RowMapper<Produsen_Mobil> {
   public Produsen_Mobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      Produsen_Mobil produsen = new Produsen_Mobil();
      produsen.setId(rs.getString("id_produsen_mobil"));
      produsen.setNama(rs.getString("nama_produsen"));
      return produsen;
   }
}