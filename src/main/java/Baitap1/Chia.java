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
public class Chia implements Tinh{
    @Override
    public float tinh(float a,float b)
    {
    if(b == 0) return Float.NaN;
    else return a / b;
    }
}
