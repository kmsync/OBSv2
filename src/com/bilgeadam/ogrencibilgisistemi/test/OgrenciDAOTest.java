package com.bilgeadam.ogrencibilgisistemi.test;

import com.bilgeadam.ogrencibilgisistemi.dao.OgrenciDAO;
import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;

import java.sql.SQLException;

public class OgrenciDAOTest {

    public static void main(String[] args) {

        try {
            Ogrenci ogr = new Ogrenci();
            ogr.setAd("Oktay");
            ogr.setSoyad("Sinanoğlu");
            ogr.setKredi(7852);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            // sonuc == true demek uzun şekilde yazmaya gerek yok.
            if (sonuc)
                System.out.println("Başarıyla eklendi.");
            else
                System.out.println("Ekleme başarısız oldu.");
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}