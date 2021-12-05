package com.bilgeadam.ogrencibilgisistemi.dao;

import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;
import com.bilgeadam.ogrencibilgisistemi.vt.VTbaglanti;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class OgrenciDAO {
    // DAO = Data Access Object

    public static boolean ekle(Ogrenci ogr) throws SQLException, ClassNotFoundException {
        Connection conn = VTbaglanti.baglantiGetir();

        //Statement st = conn.createStatement();
        // PreparedStatement daha performanslı çalışır artık bunu kullanıcaz.

        String sorgu = "insert into ogrenci(ad,soyad,kredi) values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sorgu);

        ps.setString(1, ogr.getAd());
        ps.setString(2, ogr.getSoyad());
        ps.setDouble(3, ogr.getKredi());

        int sonuc = ps.executeUpdate();

        VTbaglanti.baglantiKapat(conn);

        if (sonuc > 0)
            return true;
        else
            return false;
    }

}