/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

/**
 *
 * @author 11627
 */
public class Docent extends Cursist{
    private String vak;

    public Docent(String vak, int id, String naam, String email, String gsmNummer, String adres) {
        super(id, naam, email, gsmNummer, adres);
        this.vak = vak;
    }
    
    public Docent(){
        
    }
    

    public String getVak() {
        return vak;
    }

    public void setVak(String vak) {
        this.vak = vak;
    }
    
    
            
}
