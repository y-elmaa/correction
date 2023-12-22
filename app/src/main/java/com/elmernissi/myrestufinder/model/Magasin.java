package com.elmernissi.myrestufinder.model;

public class Magasin {
    String nameRestaurant, adressRestaurant,nbrTelephone;


    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public String getAdressRestaurant() {
        return adressRestaurant;
    }

    public String getNbrTelephone() {
        return nbrTelephone;
    }

    public Magasin(String nameRestaurant, String adressRestaurant, String nbrTelephone) {
        this.nameRestaurant = nameRestaurant;
        this.adressRestaurant = adressRestaurant;
        this.nbrTelephone = nbrTelephone;
    }
}
