package com.example.lab4_1;

public class Food {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] foods = {
            new Food("Tosty", "Tost – kromka pieczywa pszennego, podpieczona w tosterze; rodzaj grzanki. Gotowy tost powinien być lekko przyrumieniony i chrupiący.",
                    R.drawable.tosty),
            new Food("Jajecznica", "Jajecznica – potrawa z rozmąconych, usmażonych na patelni jajek. Jest domeną prostej kuchni, ponieważ nie wymaga umiejętności kulinarnych ani techniki.",
                    R.drawable.jajecznica),
            new Food("Musli", "Musli - Mieszanka płatków zbożowych, bakalii, orzechów i suszonych owoców; jest spożywana przede wszystkim z mlekiem lub jogurtem",
                    R.drawable.musli)
    };

    public Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    public String toString() {
        return this.name;
    }
}
