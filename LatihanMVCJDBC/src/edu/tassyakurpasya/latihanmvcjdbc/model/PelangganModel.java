/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvcjdbc.model;

import edu.tassyakurpasya.latihanmvcjdbc.database.KingBarberShopDatabase;
import edu.tassyakurpasya.latihanmvcjdbc.entity.Pelanggan;
import edu.tassyakurpasya.latihanmvcjdbc.error.PelangganException;
import edu.tassyakurpasya.latihanmvcjdbc.event.PelangganListener;
import edu.tassyakurpasya.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;



/**
 *
 * @author Achapasya2109
 */
public class PelangganModel {
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    private PelangganListener listener;
    
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    
    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public PelangganListener getListener() {
        return listener;
    }
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this); 
        }
        
    }
    protected void fireOnInsert(Pelanggan pelanggan){
        if (listener!=null) {
            listener.onInsert(pelanggan);   
        }
    }
    protected void fireOnUpdate(Pelanggan pelanggan){
        if (listener!=null) {
            listener.onUpdate(pelanggan);   
        }    
    }
    protected void fireOnDelete(){
        if (listener!=null) {
            listener.onDelete();
        }
        
        
    }
    public void insertPelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KingBarberShopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        
        dao.insertPelanggan(pelanggan);
        fireOnInsert(pelanggan); 
        
    }
    public void UpdatePelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KingBarberShopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        pelanggan.setId(id);
        
        dao.insertPelanggan(pelanggan);
        fireOnUpdate(pelanggan); 
        
    }
    public void DeletePelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KingBarberShopDatabase.getPelangganDao();
        dao.deletePelanggan(id);
        fireOnDelete();
       
    }
    public void resetPelanggan(){
        setId(0);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
        
    }
    
     
    
    
    
}
