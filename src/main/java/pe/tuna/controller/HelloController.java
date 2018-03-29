package pe.tuna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import pe.tuna.models.Persona;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/saludo")
    public String sayHello(Model model){
        model.addAttribute("frmPersona", new Persona());
        model.addAttribute("saludo", "Hola miguel desde STS");
        model.addAttribute("mensaje", "Este es el cuerpo del mensaje");
        model.addAttribute("url", "http://www.tuna.pe");

        return "hello/hola";
    }

    @GetMapping("/addEmpleado")
    public String showForm(Model model) {
        model.addAttribute("frmPersona", new Persona());
        return "hello/form";
    }

    @PostMapping("/addEmpleado")
    public String submit(@Valid @ModelAttribute("frmPersona") Persona persona, BindingResult result, SessionStatus status, Model model) {
        String view = "";
        if(result.hasErrors()) {
            view = "hello/form";
        }else {
            // Si todos los datos fueron correctamente ingresados
            model.addAttribute("nombres", persona.getNombres());
            model.addAttribute("correo",persona.getCorreo());
            model.addAttribute("edad",persona.getEdad());
            view = "hello/data";
        }
        return view;
    }

    @ModelAttribute("lstPaises")
    public Map<String, String> paises(){
        Map<String, String> lstPaises = new LinkedHashMap<String, String>();
        lstPaises.put("1","Perú");
        lstPaises.put("2","Brasil");
        lstPaises.put("3","Argentina");

        return lstPaises;
    }

    @ModelAttribute("lstPersonas")
    public List<Persona> getPersonas(){
        List<Persona> lstPersonas = new ArrayList<Persona>();
        Persona persona;
        for (int i=0; i<5; i++){
            persona = new Persona();
            persona.setId(i+1);
            persona.setNombres("Persona " + i);
            persona.setCorreo("correo" + i + "@gmail.com");
            persona.setEdad(18 + i);

            lstPersonas.add(persona);
        }

        return lstPersonas;
    }
}
