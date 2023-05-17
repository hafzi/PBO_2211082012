/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC2
 */
public class PesananController {
    private KodePesanan kodePesanan;
    private NamaPemesan namaPemesan;
    private FormPesanan formPesanan;
    
    private Harga harga;
    private OngkosKirim ongkosKirim;
    private Diskon diskon;
    private TglPesan tglPesan;
    
    public PesananController(FormPesanan formPesanan){
        this.formPesanan = formPesanan;
        PesananDao = new PesananDaoImpl();
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formPesanan.getTxtTglpinjam().setText("");
        formPesanan.getTxtTglkembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        formPesanan.getCboAnggota().removeAllItems();
        formPesanan.getCboBuku().removeAllItems();
        //isi anggota
        for (Anggota anggota : listAnggota) {
            formPesanan.getCboAnggota().addItem(anggota.getNobp());
        }
        
        for (Buku buku : listBuku) {
            formPesanan.getCboBuku().addItem(buku.getKode());
        }
    }
    public void savePesanan(){
        Pesanan = new Pesanan();
        Pesanan.setAnggota(
   anggotaDao.getAnggota(formPesanan.getCboAnggota().getSelectedIndex()));
        Pesanan.setBuku(
            bukuDao.getBuku(formPesanan.getCboBuku().getSelectedIndex()));
        Pesanan.setTglpinjam(formPesanan.getTxtTglpinjam().getText());
        Pesanan.setTglkembali(formPesanan.getTxtTglkembali().getText());
        PesananDao.save(Pesanan);
        javax.swing.JOptionPane.showMessageDialog(formPesanan, "Entri Ok");
    }
    public void getPesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        Pesanan = PesananDao.getPesanan(index);
        if(Pesanan != null){
            formPesanan.getCboAnggota()
                    .setSelectedItem(Pesanan.getAnggota().getNobp());
            formPesanan.getCboBuku()
                    .setSelectedItem(Pesanan.getBuku().getKode());
            formPesanan.getTxtTglpinjam()
                    .setText(Pesanan.getTglpinjam());
            formPesanan.getTxtTglkembali()
                    .setText(Pesanan.getTglkembali());
        }
    }
    
    public void updatePesanan(){
        int idx = formPesanan.getTblPesanan().getSelectedRow();
        Pesanan.setAnggota(
   anggotaDao.getAnggota(formPesanan.getCboAnggota().getSelectedIndex()));
        Pesanan.setBuku(
            bukuDao.getBuku(formPesanan.getCboBuku().getSelectedIndex()));
        Pesanan.setTglpinjam(formPesanan.getTxtTglpinjam().getText());
        Pesanan.setTglkembali(formPesanan.getTxtTglkembali().getText());
        PesananDao.update(idx,Pesanan);
        javax.swing.JOptionPane.showMessageDialog(formPesanan, "Update Ok");
    }
    
    public void deletePesanan(){
        int idx = formPesanan.getTblPesanan().getSelectedRow();
        PesananDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(formPesanan, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pesanan> list = PesananDao.getAllPesanan();
        for(Pesanan Pesanan : list){
            Object[] data = {
                Pesanan.getAnggota().getNobp(),
                Pesanan.getBuku().getKode(),
                Pesanan.getTglpinjam(),
                Pesanan.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
