/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author prana
 */
public class logindetailsservice implements UserDetailsService{
    
    @Autowired
    private loginrepo repo;
    
    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        User user = repo.findByLoginId(loginId);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new logindetails(user) ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
