package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by christerhansen on 19.09.2016.
 */
@Controller
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String addPerson(ModelMap map){
        map.addAttribute("person", new Person());
        return "add";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ModelAndView save(Person person){
        person = personRepository.save(person);
        return new ModelAndView("vis", "person", person);
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String visAlle(ModelMap map){
        map.addAttribute("liste", personRepository.findAll());
        return "list";
    }
}


