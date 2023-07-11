/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hafzi240523.dao;
import hafzi240523.model.*;
import java.sql.*;
import java.util.List;
/**
 *
 * @author FX507ZC
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodebuku, String tglPinjam) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
