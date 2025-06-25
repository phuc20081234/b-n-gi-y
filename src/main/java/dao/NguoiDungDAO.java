/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NguoiDung;

/**
 *
 * @author nguye
 */
public class NguoiDungDAO {
   public NguoiDung dangNhap(String email, String matKhau) {
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM NguoiDung WHERE Email=? AND MatKhau=?")) {
            ps.setString(1, email);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new NguoiDung(
                    rs.getString("Email"),
                    rs.getString("MatKhau"),
                    rs.getString("HoTen"),
                    rs.getString("VaiTro")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean kiemTraMatKhauCu(String email, String matKhauCu) {
    String sql = "SELECT * FROM NguoiDung WHERE Email = ? AND MatKhau = ?";
    try (Connection conn = DatabaseHelper.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, email);
        ps.setString(2, matKhauCu);
        ResultSet rs = ps.executeQuery();
        return rs.next(); // nếu tìm thấy => đúng mật khẩu
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }

}
    public boolean doiMatKhau(String email, String matKhauMoi) {
    String sql = "UPDATE NguoiDung SET MatKhau = ? WHERE Email = ?";
    try (Connection conn = DatabaseHelper.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, matKhauMoi);
        ps.setString(2, email);
        return ps.executeUpdate() > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
}
