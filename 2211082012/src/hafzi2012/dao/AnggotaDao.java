/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hafzi2012.dao;
import hafzi2012.model.Anggota;
import java.sql.*;
import java.util.List;
/**
 *
 * @author FX507ZC
 */
public interface AnggotaDao {
    void insert(Anggota anggota) throws SQLException;
    void update(Anggota anggota) throws SQLException;
    void delete(String nobp) throws SQLException;
    Anggota getAnggota(String nobp) throws SQLException;
    public List<Anggota> getAll() throws SQLException;
}
