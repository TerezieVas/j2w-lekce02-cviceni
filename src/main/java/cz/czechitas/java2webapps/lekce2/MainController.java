package cz.czechitas.java2webapps.lekce2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalTime;

@Controller
public class MainController {

    @GetMapping(value = "/datum")
    public ModelAndView datum() {
        ModelAndView modelAndView = new ModelAndView("datum");//přidávám jako parametr šablonu, kterou chci zobrazovat
       modelAndView.addObject("datum", LocalTime.now());
       return modelAndView;
            }

    @GetMapping(value = "/cas")
    public ModelAndView cas() {
        ModelAndView modelAndView = new ModelAndView("cas");
        modelAndView.addObject("cas", LocalTime.now());
        return modelAndView;
    }
}
