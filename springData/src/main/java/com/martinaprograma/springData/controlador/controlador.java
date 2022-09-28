package com.martinaprograma.springData.controlador;

import com.martinaprograma.springData.model.PersonaTabla;
import com.martinaprograma.springData.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controlador {
    @Autowired
    private IPersonaRepo repo;

    @GetMapping("/agregar")
    public String controladorUrl(@RequestParam(name="name",defaultValue = "Default")String name, Model modelo){

        PersonaTabla pt=new PersonaTabla();
        pt.setNombre(name);
        repo.save(pt);
        modelo.addAttribute("name",name);
        return ("paginahtml");
    }
    @GetMapping("/listar")
    public String listar(Model modelo){
        modelo.addAttribute("personas",repo.findAll());
        return ("paginahtml");
    }

}
