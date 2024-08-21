package com.test_07_24.exp1;

public enum Color {
    RED(255,0,0,"红色");
    private final int r;
    private final int g;
    private final int b;
    private final String description;
    Color(int r, int g, int b, String description) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name() + "(" + r + "," + g + "," + b + ")->" + description;
    }
}
