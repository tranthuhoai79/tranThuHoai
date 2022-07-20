/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.KhachHang;

/**
 *
 * @author acer
 */
public class KhachHangDAO {
    public static KhachHang findById(int id){
        List<KhachHang> list = IOFile.doc("src/controller/khachhang.txt");
        for(KhachHang kh : list){
            if(kh.getMa() == id) return kh;
        }
        return null;
    }
    
}
