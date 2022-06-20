package com.pruebag1.hector.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebag1.hector.models.Mueble;
import com.pruebag1.hector.services.MuebleService;

@Controller
@RequestMapping("/mueble") //Página por defecto
public class MuebleController {
    @Autowired //Permita instanciar otra clase, en este caso, del service
    MuebleService muebleservice; //Instanciamos la clase para utilizar sus métodos
    

    //Hacer la instancia del jsp
    @RequestMapping("")
    //Creamos la funcion en la primera instancia
    public String mueble(@ModelAttribute("mueble") Mueble mueble){
        return "mueble.jsp";
    }

    //Creamos la instancia para capturar datos
    @PostMapping("/solicitar")
    public String nuevoMueble(@Valid @ModelAttribute("mueble") Mueble mueble, //@Valid Verifica que los datos sean correctos para la base de datos.
    BindingResult resultado, //Creamos un objeto llamado resultado para validar que llegaron los datos si o no
    Model model){ //Model es la instrucción que permite enviar los datos al jsp
        if(resultado.hasErrors()){
            model.addAttribute("mensajeError", "Los datos ingresados no son válidos");
            return "mueble.jsp";
        }else{
            System.out.println("Nombre mueble" + mueble.getNombre()+ "Material"+ mueble.getMaterial()+ muebleService.saveMueble(mueble)); {//Capturamos el objeto en el sout y lo guardamos en el savemueble
            return "mostrarMuebles.jsp";   
            } 

        }
        
        
        
    }




}
