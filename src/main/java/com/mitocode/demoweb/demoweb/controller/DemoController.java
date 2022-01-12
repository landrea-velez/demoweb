package com.mitocode.demoweb.demoweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mitocode.demoweb.demoweb.model.Persona;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepository repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {

        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre("coder");
        repo.save(p);

        model.addAttribute("name", name);
        return "greeting";
    }

}