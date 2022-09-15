package com.company;

import sun.security.x509.FreshestCRLExtension;

public class Fraction {
    private int nom;
    private int denom;

    //метод set - записать значение в св-во (поле) класса
    public void setNom(int fNom) {
        nom = fNom;
    }

    public void setDenom(int fDenom) {
        if (fDenom <= 0) {
            denom = 1;
        } else {
            denom = fDenom;

        }
    }

    public Fraction() {
        nom = 0;
        denom = 1;
    }

    public Fraction(int fNom, int fDenom) {
        nom = fNom;
        denom = fDenom;

    }

    public void print() {
        System.out.println(nom + "/" + denom);
    }

    public Fraction mul(Fraction f2) {
        Fraction res = new Fraction();
        res.nom = this.nom * f2.nom;
        res.denom = this.denom * f2.denom;
        return res;

    }

    public Fraction div(Fraction f2) {
        Fraction res = new Fraction();
        res.nom = this.nom * f2.denom;
        res.denom = this.denom * f2.nom;
        return res;
    }
    private Fraction reverse(){
        Fraction res = new Fraction();
        res.nom = this.denom;
        res.denom = this.nom;
        return res;

    }
    public Fraction div2(Fraction f2){
        Fraction res = this.mul(f2.reverse());
        return res;


    }
    public Fraction add(Fraction f2){
        Fraction res = new Fraction();
        res.denom = this.denom * f2.denom;
        res.nom = this.nom * f2.denom + f2.nom * this.denom;
        return res;


    }
}