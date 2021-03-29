/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

/**
 *
 * @author prana
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;



@Entity
@SecondaryTable(name="patients")
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long Id;
    @Column(nullable = false, unique = true, length = 10)
     private String patientId;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 20)
    private String phoneno;
    @Column(nullable = false,length = 30)
    private String email;
    @Column(nullable = false, length = 50)
    private String address;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
