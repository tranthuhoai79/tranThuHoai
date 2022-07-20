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
public class Truyen implements Serializable{
    private int ma;
    private String ten;
    private String tacgia;
    private int tien;
    private static int sma =1000;

    public Truyen() {
    }

    public Truyen(int ma, String ten, String tacgia, int tien) {
        this.ma = ma;
        this.ten = ten;
        this.tacgia = tacgia;
        this.tien = tien;
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

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }
    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Truyen.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
        ma,ten,tacgia,tien   
        };
    }  
    
}
