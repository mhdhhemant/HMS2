/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author prana
 */
public interface patientrepo extends JpaRepository<patient, Long>{
    
}
