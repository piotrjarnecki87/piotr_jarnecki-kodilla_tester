package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double size;

    private String clear;

    public Stamp( String name, double size, String clear){
        this.name = name;
        this.size = size;
        this.clear = clear;
    }
    public String getName(){
        return name;
    }
    public double getSize(){
        return size;
    }
    public String getClear(){
        return clear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.size, size) == 0 && Objects.equals(name, stamp.name) && Objects.equals(clear, stamp.clear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, clear);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", clear='" + clear + '\'' +
                '}';
    }
}
