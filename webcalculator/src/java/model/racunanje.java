/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Sale
 */
public class racunanje {
   @NotNull
   @Digits(integer = 10000,fraction = 5)
  private Double prvibroj;
   @NotNull
   @Digits(integer = 10000,fraction = 5)
  private Double drugibroj;
  Double res;
  
  private String poruka;
 
     public String getPoruka() {
      return poruka;
   }
   public void setPoruka(String poruka) {
      this.poruka = poruka;
   }
   
    public Double getPrvibroj() {
        return prvibroj;
    }
   public void setPrvibroj(Double prvibroj) {
        this.prvibroj = prvibroj;
    }
    public Double getDrugibroj() {
        return drugibroj;
    }
    public void setDrugibroj(Double drugibroj) {
        this.drugibroj = drugibroj;
    }
   public Double izracunaj(){
    
       
      switch(poruka){
          case "sabiranje":
             res= prvibroj+drugibroj;
             break;
            case "oduzimanje":
                 res = prvibroj-drugibroj;
                 break;
                 case "mnozenje":
                      res=prvibroj*drugibroj;
                      break;
                      case "deljenje":
                           res=prvibroj/drugibroj;
                            break;
                        
      }
        return res;
      
   }
       public String log(){
           String opis = "UNESITE BROJEVE";
       return opis;
       }   
    
   } 

    
     


