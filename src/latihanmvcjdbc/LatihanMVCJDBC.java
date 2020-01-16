/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc;
import java.sql.SQLException;
import database.KingsBarbershpDatabase;
import entity.Pelanggan;
import error.PelangganException;
import service.PelangganDao;
import view.MainView;
import java.util.List;
import javax.swing.SwingUtilities;
import java.util.logging.Logger;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class LatihanMVCJDBC {
    

    /**
     * @param args the command line arguments
     * 
     */
     public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainView pelanggan = new MainView();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });


    }
    
}
