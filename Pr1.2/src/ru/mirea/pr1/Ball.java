package ru.mirea.pr1;

public class Ball {
    private String brand;
    private int size;
    private double weigth;
    public Ball(String b,int s, double w){
        brand=b;
        size=s;
        weigth=w;
    }
    public Ball(int s,double w){
        brand="Kipsa";
        size=s;
        weigth=w;
    }
    public Ball(double w){
        brand="Nike";
        size=5;
        weigth=w;
    }
    public Ball(){
        brand="Nike";
        size=5;
        weigth=360.5;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }
    public String toString(){
        return this.brand+" |Size:"+this.size+" |Weigth:"+this.weigth;
    }
}
