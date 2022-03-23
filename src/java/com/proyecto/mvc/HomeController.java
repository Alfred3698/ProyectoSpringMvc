/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.mvc;

import com.proyecto.mvc.DTO.ClienteForm;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jajimenez
 */
@Controller
public class HomeController {

    @RequestMapping(value = "holaMundo.jsp", method = RequestMethod.POST)
    public void holaMundo(Locale locale, Model model, ClienteForm clienteForm) 
    {

        System.out.println("Nombre:" + clienteForm.getNombre());
        System.out.println("Apellido:" + clienteForm.getApellido());
        System.out.println("Tu saludo para el mundo es: ");
        model.addAttribute("formulario", clienteForm);
    }

}
