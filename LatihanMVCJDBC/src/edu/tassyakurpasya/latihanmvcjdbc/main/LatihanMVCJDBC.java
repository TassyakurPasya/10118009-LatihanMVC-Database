/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvcjdbc.main;

import edu.tassyakurpasya.latihanmvcjdbc.database.KingBarberShopDatabase;
import edu.tassyakurpasya.latihanmvcjdbc.entity.Pelanggan;
import edu.tassyakurpasya.latihanmvcjdbc.error.PelangganException;
import edu.tassyakurpasya.latihanmvcjdbc.service.PelangganDao;
import edu.tassyakurpasya.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Achapasya2109
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {       
               try{
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
               }catch(SQLException e){
               }
             catch (PelangganException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
       }
        
       });    
        
        
       }  
    
} 
