/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package edu.tassyakurpasya.latihanmvcjdbc.service;

import edu.tassyakurpasya.latihanmvcjdbc.entity.Pelanggan;
import edu.tassyakurpasya.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Achapasya2109
 */
public interface PelangganDao {
     public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectALLPelanggan() throws PelangganException;
}
