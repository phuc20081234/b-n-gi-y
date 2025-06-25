/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class NguoiDung {
     private String email, matKhau, hoTen, vaiTro;

    public NguoiDung(String email, String matKhau, String hoTen, String vaiTro) {
        this.email = email;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getEmail() { return email; }
    public String getMatKhau() { return matKhau; }
    public String getHoTen() { return hoTen; }
    public String getVaiTro() { return vaiTro; }
}
