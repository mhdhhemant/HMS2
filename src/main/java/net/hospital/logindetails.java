/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class logindetails implements UserDetails {
    
    private User user;

    public logindetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return user.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return user.getLoginId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonExpired() {
       return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getFullName(){
        return user.getFirstName() + " " + user.getLastName();
    }
    
}
