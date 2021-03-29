/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author prana
 */
public interface loginrepo extends JpaRepository<User, Long>{
    
    @Query("SELECT u FROM User u WHERE u.loginId = ?1")
    User findByLoginId(String loginId);
}
