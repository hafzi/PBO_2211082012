/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author PC2
 */
public interface PesananDao {
    void save(Pesanan Pesanan);
    void update(int idx, Pesanan Pesanan);
    void delete(int idx);
    Pesanan getPesanan(int idx);
    List<Pesanan> getAllPesanan();
}
