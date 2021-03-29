/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    
    public static void main(String[] args){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String rawPassword = "radhika2020";
            String encodedPassword = encoder.encode(rawPassword);
    
            System.out.println(encodedPassword);
    }
}
