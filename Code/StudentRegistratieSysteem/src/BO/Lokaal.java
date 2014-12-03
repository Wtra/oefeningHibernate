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
public class Lokaal {
    private int id;
    private String lokaalNummer;
    private int zitplaatsen;
    private boolean beschikbaar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLokaalNummer() {
        return lokaalNummer;
    }

    public void setLokaalNummer(String lokaalNummer) {
        this.lokaalNummer = lokaalNummer;
    }

    public int getZitplaatsen() {
        return zitplaatsen;
    }

    public void setZitplaatsen(int zitplaatsen) {
        this.zitplaatsen = zitplaatsen;
    }

    public boolean isBeschikbaar() {
        return beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        this.beschikbaar = beschikbaar;
    }
    
    
}
