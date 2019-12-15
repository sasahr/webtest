/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.validation.Valid;
import model.racunanje;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sale
 */
@Controller
public class controler {
           @RequestMapping(value = "/calculator", method = RequestMethod.GET)
     public String createforma(ModelMap model) throws ClassNotFoundException{
     model.addAttribute("racunanje", new racunanje());
        return "calculator";
  
          }  
        @RequestMapping(params ="izracunaj", value = "/calculator",method = RequestMethod.POST )       
        public String izracunaj(@ModelAttribute("racunanje") @Valid racunanje racunanje,BindingResult result, ModelMap model) throws ClassNotFoundException {
        if (result.hasErrors()) {
           
             model.addAttribute("greska", racunanje.log());
             return "calculator";
             
          } else {
             model.addAttribute("res", racunanje.izracunaj());
          
               createforma(model);
               return "calculator";
        }
          
        }     
}
