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
public class Cursist {
    private int id;
    private String naam;
    private String email;
    private String gsmNummer;
    private String adres;

    public Cursist(){
        
    }

    public Cursist(int id, String naam, String email, String gsmNummer, String adres) {
        this.id = id;
        this.naam = naam;
        this.email = email;
        this.gsmNummer = gsmNummer;
        this.adres = adres;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsmNummer() {
        return gsmNummer;
    }

    public void setGsmNummer(String gsmNummer) {
        this.gsmNummer = gsmNummer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
}
