/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hospital;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class AppController {
    
    @Autowired
    private patientrepo repo1;
    
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/home")
    public String viewUserPage() {
        return "login";
    }
    
    @GetMapping("/list_users")
    public String viewUsersList(Model model) {
        List<patient> listUsers = repo1.findAll();
        model.addAttribute("listUsers", listUsers);
        return "patients";
    }
    
    
}
