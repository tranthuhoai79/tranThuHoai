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
public class KhachHang implements Serializable{
    private int ma;
    private String ten;
    private String sdt;
    private String dchi;
    private static int sma=1000;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String sdt, String dchi) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.dchi = dchi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }
    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
        ma,ten,sdt,dchi    
        };
    }  

    
}
