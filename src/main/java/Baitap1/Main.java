/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author NGUYENPC
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        
        Cong cong = new Cong();
        context.setTinhtoan(cong);
        System.out.println("75 + 12 = " + context.tinh(75,12));
        
        Tru tru = new Tru();
        context.setTinhtoan(tru);
        System.out.println("54 - 78 = " + context.tinh(54,78));
        
    }
}
