package com.company;

public class Vector {

    int x;
    int y;

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void Set (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v){
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public boolean equals(Vector v){
        return this.x == v.x && this.y == v.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector))
            return false;
        if (obj == this)
            return true;

        return this.x == ((Vector)obj).x && this.y == ((Vector)obj).y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.x;
        hash = 47 * hash + this.y;
        return hash;
    }
}