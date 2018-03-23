package pe.tuna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/saludo")
    public String sayHello(Model model){
        model.addAttribute("saludo", "Hola miguel desde STS");
        model.addAttribute("mensaje", "Este es el cuerpo del mensaje");
        model.addAttribute("url", "http://www.tuna.pe");

        return "hello/hola";
    }
}
