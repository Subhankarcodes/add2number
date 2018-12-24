/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import addnumber.ExNumberFormatException;
import addnumber.IReceiver;
import addnumber.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tri duong
 */
public class MyBigNumberTest implements IReceiver{
    
    public MyBigNumberTest() {
    }
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum_N1() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("223", "444");
            assertEquals("667", result);
    }
    
    @Test
    public void testSum_N2() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("15", "867");
            assertEquals("882", result);       
    }
    
    @Test
    public void testSum_N3() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1115", "82");
            assertEquals("1197", result);       
    }
    
    @Test
    public void testSum_N4() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("","0");
            assertEquals("0", result);      
    }
    
    @Test
    public void testSum_N5() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("15-", "875");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N6() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-15", "875");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N7() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("abc", "678");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N8() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("abc+1", "678");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N9() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("+*&**)(^&*", "*&*()&&*&");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N10() {
        MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("0", "0");
         assertEquals("0", result);
        
    }
    
     @Test
    public void testSum_N11() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("453453", "");
         assertEquals("453453", result);      
    }
    
     @Test
    public void testSum_N12() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("", "");
         assertEquals("", result);       
    }
    
     @Test
    public void testSum_N13() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123.456", "123");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N14() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("^%", "%%%&&3");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N15() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123.456-", "--123");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N16() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-123.456", "123");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N17() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123.^^@!", "-123");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N18() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-4s4hhh31", "123");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    
     @Test
    public void testSum_N19() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("6dttew3", "95jt7");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N20() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("17$$6", "38$$9");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N21() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1a2", "1");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N22() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1", "1a2");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
     @Test
    public void testSum_N23() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("","1");
            assertEquals("1", result);      
    }
    
     @Test
    public void testSum_N24() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1","");
            assertEquals("1", result);      
    }
    
    
    
    
    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
    
}
