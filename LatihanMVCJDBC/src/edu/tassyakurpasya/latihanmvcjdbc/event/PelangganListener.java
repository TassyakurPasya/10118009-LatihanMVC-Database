/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvcjdbc.event;

import edu.tassyakurpasya.latihanmvcjdbc.entity.Pelanggan;
import edu.tassyakurpasya.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Achapasya2109
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

    

    
}
