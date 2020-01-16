/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvcjdbc.controller;

import edu.tassyakurpasya.latihanmvcjdbc.model.PelangganModel;
import edu.tassyakurpasya.latihanmvcjdbc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Achapasya2109
 */
public class PelangganControler {

private PelangganModel model;
    public void setModel(PelangganModel model) {
        this.model = model;
    }
    public void resetPelanggan(PelangganView view){
        model.resetPelanggan();
    }
    public void InsertPelanggan(PelangganView view){
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Tidak Boleh Kosong");
        }else  if(nama.length()>255){
            JOptionPane.showMessageDialog(view,"Nama Tidak Boleh Lebih dari 255 karakter");
        }else if(telepon.length()>12){
            JOptionPane.showMessageDialog(view,"Nomor Telepon Tidak Boleh Lebih dari 12 digit");
        }else if(!email.contains("@") || !email.contains(".")){
            JOptionPane.showMessageDialog(view,"Email Tidak Valid");
        }else{
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try{
                model.insertPelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Ditambahkan");
                model.resetPelanggan();
            }catch(Throwable throwabel){
                JOptionPane.showMessageDialog(view, new Object[]{(" Terjadi Error di database dengan pesan"), throwabel.getMessage()});
            }
        }
    }
        
        
    public void updatePelanggan(PelangganView view){
        if (view.getTablePelanggan().getSelectedRowCount()==0) {
            JOptionPane.showMessageDialog(view, "Silakan seleksi baris data yang akan diubah ");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtId().getText());
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Tidak Boleh Kosong");
        }else  if(nama.length()>255){
            JOptionPane.showMessageDialog(view,"Nama Tidak Boleh Lebih dari 255 karakter");
        }else if(telepon.length()>12){
            JOptionPane.showMessageDialog(view,"Nomor Telepon Tidak Boleh Lebih dari 12 digit");
        }else if(!email.contains("@") || !email.contains(".")){
            JOptionPane.showMessageDialog(view,"Email Tidak Valid");
        }else{
            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try{
                model.UpdatePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                model.resetPelanggan();
            }catch(Throwable throwabel){
                JOptionPane.showMessageDialog(view, new Object[]{(" Terjadi Error di database dengan pesan"), throwabel.getMessage()});
            }
        }
        
    }
    public void deletePelanggan(PelangganView view){
         if(view.getTablePelanggan().getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi data yang akan dihapus");
            return;
        }
         
        if(JOptionPane.showConfirmDialog(view, "Anda yakin akan Menghapus?")==JOptionPane.OK_OPTION){
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);
            
            try{
                model.DeletePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                model.resetPelanggan();
            }catch(Throwable throwabel){
                JOptionPane.showMessageDialog(view,new Object[]{
                    (" Terjadi Error di database dengan pesan"), throwabel.getMessage()});
            }
        
    }

    }


} 

