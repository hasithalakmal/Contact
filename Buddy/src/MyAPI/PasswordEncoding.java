/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAPI;

import java.security.MessageDigest;

/**
 *
 * @author Massa
 */
public class PasswordEncoding {
  
 

    public  String Encode(String pass)throws Exception
    {
    	String password = pass;
 
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
 
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
 
        String newpass = (sb.toString());
        return newpass;
       
    }
}