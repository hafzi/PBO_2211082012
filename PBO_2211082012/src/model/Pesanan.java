/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC2
 */
public class Pesanan {
    private KodePesanan kodePesanan;
    private NamaPemesan namaPemesan;
    private String tglpesan;
    private String harga;
    private OngkosKirim ongkosKirim;
    private Diskon diskon;
    private TglPesan tglPesan;
    
    public Pesanan(){
    }
    
    public Pesanan(KodePesanan kodePesanan,NamaPemesan namaPemesan, String tglpesan,
            String Harga, OngkosKirim ongkosKirim, Diskon diskon){
    this.Tgl
    private NamaPemesan namaPemesan;
    private String tglpesan;
    private String harga;
    private OngkosKirim ongkosKirim;
    private Diskon diskon;
    private TglPesan tglPesan;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    public Buku getBuku(){
        return buku;
    }
    public String getTglpinjam(){
        return tglpinjam;
    }
    public String getTglkembali(){
        return tglkembali;
    }
    
}
