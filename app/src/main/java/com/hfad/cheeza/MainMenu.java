package com.hfad.cheeza;

public class MainMenu {
    private String name;
    private int imageResourceId;
    public static final MainMenu[] contents = {
            new MainMenu("pizza", R.drawable.pizzahm),
            new MainMenu("pasta", R.drawable.pastahm),
            new MainMenu("salads", R.drawable.saladhm),
            new MainMenu("dessert", R.drawable.desserthm),
            new MainMenu("beverages", R.drawable.beveragehm)
    };
    private MainMenu(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
