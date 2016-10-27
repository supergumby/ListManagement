package com.gcleris.android.listmanagement;

/**
 * Created by gcler on 2016-09-08.
 */
public class  Item {

    // id = Identificateur unique de l'item fourni automatiquement par la base de données SQL.
    // position = Position dans l'épicerie de 1 à 5 (1 = au début, 3 = au milieu, 5 = à la fin).
    // qty = La quantité d'items à acheter
    // itemNom = Nom descriptif de l'item.
    // nivInventaire = Niveau de l'inventaire dans le garde manger (si coché sera veut dire niveau bas et sera à mettre sur la liste d'achat)
    // itemToBuy = Enregistre les items qui ont été achetés lors de l'épicerie (si coché veut dire que l'article a été acheté et que l'inventaire est maintenant revenu à haut)
    // essentiel = Article essentiel à avoir dans la cuisine en tout temps, à vérifier à chaque épicerie.

    public int id, position, qty;
    public String itemNom;
    public Boolean nivInventaire, itemToBuy, essentiel;


    public Item(int id, int position, int qty, String itemNom, Boolean nivInventaire, Boolean itemToBuy, Boolean essentiel) {
        this.id = id;
        this.position = position;
        this.qty = qty;
        this.itemNom = itemNom;
        this.nivInventaire = nivInventaire;
        this.essentiel = essentiel;
        this.itemToBuy = itemToBuy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getQty() { return qty; }

    public void setQty(int qty) { this.qty = qty; }

    public String getItemNom() {
        return itemNom;
    }

    public void setItemNom(String itemNom) {
        this.itemNom = itemNom;
    }

    public Boolean getNivInventaire() {
        return nivInventaire;
    }

    public void setItemToBuy(Boolean itemToBuy) {
        this.itemToBuy = itemToBuy;
    }

    public Boolean getItemToBuy() {
        return itemToBuy;
    }

    public void setNivInventaire(Boolean nivInventaire) {
        this.nivInventaire = nivInventaire;
    }

    public Boolean getEssentiel() {
        return essentiel;
    }

    public void setEssentiel(Boolean essentiel) {
        this.essentiel = essentiel;
    }
}