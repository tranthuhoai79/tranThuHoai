/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ihado
 */
public class PhieuMuon implements Serializable{
    private KhachHang khachhang;
    private Truyen truyen;

    public PhieuMuon() {
    }

    public PhieuMuon(KhachHang khachhang, Truyen truyen) {
        this.khachhang = khachhang;
        this.truyen = truyen;
    }
    
    
    public PhieuMuon(String hoten, String tuoi) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            this.hoten=hoten;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public Truyen getTruyen() {
        return truyen;
    }

    public void setTruyen(Truyen truyen) {
        this.truyen = truyen;
    }
    public Object[] toObject(){
        return new Object[]{
          khachhang.getTen(),truyen.getTen()
        };
    }
}
