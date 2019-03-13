package com.hfad.cheeza;

public class Pizza {
    private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("supreme", R.drawable.pizza13),
            new Pizza("moonlight", R.drawable.pizza14),
            new Pizza("chicken", R.drawable.pizza15),
            new Pizza("supreme", R.drawable.pizza16),
            new Pizza("moonlight", R.drawable.pizza17),
            new Pizza("chicken", R.drawable.pizza18),
    };
    private Pizza(String name, int imageResourceId) {
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
