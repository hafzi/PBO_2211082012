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
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian) throws SQLException;
    void delete(Pengembalian pengembalian) throws SQLException;
    Pengembalian getPengembalian(String nobp, String kodebuku, String tglPinjam) throws SQLException;
    public List<Pengembalian> getAll() throws SQLException;
}
