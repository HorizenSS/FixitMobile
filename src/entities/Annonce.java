/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;



/**
 *
 * @author INES
 */
public class Annonce {
    private int id ;
    public user user;
    public String nom ;
    private Date startdate;
      private Date enddate;
    public String description;
    public String image ;
   
    private  Float prix;
    private int type ;
    private int id_local ;

    public Annonce(int id, user user, String nom, Date startdate, Date enddate, String description, String image, Float prix, int type, int id_local) {
        this.id = id;
        this.user = user;
        this.nom = nom;
        this.startdate = startdate;
        this.enddate = enddate;
        this.description = description;
        this.image = image;
        
        this.prix = prix;
        this.type = type;
       
    }
   public Annonce(String nom, Date startdate, Date enddate, String description, String image, Float prix, int type) {
     
        this.nom = nom;
        this.startdate = startdate;
        this.enddate = enddate;
        this.description = description;
        this.image = image;
        
        this.prix = prix;
       
    }
    public int getId() {
        return id;
    }

    public user getUser() {
        return user;
    }

    public String getNom() {
        return nom;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    

    public Float getPrix() {
        return prix;
    }

    public int getType() {
        return type;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

   

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }

    @Override
    public String toString() {
        return "Annonce{" + "id=" + id + ", user=" + user + ", nom=" + nom + ", startdate=" + startdate + ", enddate=" + enddate + ", description=" + description + ", image=" + image +  ", prix=" + prix + ", type=" + type + ", id_local=" + id_local + '}';
    }

   
    
    
}
