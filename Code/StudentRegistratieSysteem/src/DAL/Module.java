package DAL;
// Generated 3-dec-2014 15:53:26 by Hibernate Tools 3.6.0



/**
 * Module generated by hbm2java
 */
public class Module  implements java.io.Serializable {


     private Integer id;
     private String moduleNaam;
     private String docent;
     private String cursist;
     private int maxInschrijvingen;
     private String startdag;
     private String einddag;
     private String lokaal;

    public Module() {
    }

    public Module(String moduleNaam, String docent, String cursist, int maxInschrijvingen, String startdag, String einddag, String lokaal) {
       this.moduleNaam = moduleNaam;
       this.docent = docent;
       this.cursist = cursist;
       this.maxInschrijvingen = maxInschrijvingen;
       this.startdag = startdag;
       this.einddag = einddag;
       this.lokaal = lokaal;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getModuleNaam() {
        return this.moduleNaam;
    }
    
    public void setModuleNaam(String moduleNaam) {
        this.moduleNaam = moduleNaam;
    }
    public String getDocent() {
        return this.docent;
    }
    
    public void setDocent(String docent) {
        this.docent = docent;
    }
    public String getCursist() {
        return this.cursist;
    }
    
    public void setCursist(String cursist) {
        this.cursist = cursist;
    }
    public int getMaxInschrijvingen() {
        return this.maxInschrijvingen;
    }
    
    public void setMaxInschrijvingen(int maxInschrijvingen) {
        this.maxInschrijvingen = maxInschrijvingen;
    }
    public String getStartdag() {
        return this.startdag;
    }
    
    public void setStartdag(String startdag) {
        this.startdag = startdag;
    }
    public String getEinddag() {
        return this.einddag;
    }
    
    public void setEinddag(String einddag) {
        this.einddag = einddag;
    }
    public String getLokaal() {
        return this.lokaal;
    }
    
    public void setLokaal(String lokaal) {
        this.lokaal = lokaal;
    }




}


