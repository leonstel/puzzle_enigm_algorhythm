package com.company;

public class Vector {

    int x;
    int y;

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v){
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public boolean equals(Vector v){
        return this.x == v.x && this.y == v.y;
    }
}