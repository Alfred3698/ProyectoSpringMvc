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

    @RequestMapping(value = "holamundo.htm", method = RequestMethod.POST)
    public String holaMundo(Locale locale, Model model, ClienteForm clienteForm) {

        System.out.println("nombre:" + clienteForm.getNombre());
        System.out.println("apellido:" + clienteForm.getApellido());
        System.out.println("Hola mundo");
        model.addAttribute("formulario", clienteForm);
        return "holaMundo";
    }

}
