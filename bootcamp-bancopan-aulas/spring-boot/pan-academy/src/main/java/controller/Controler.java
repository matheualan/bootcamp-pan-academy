package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produt")
public class Controler {

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String metodo() {
        return "hello";
    }
}
