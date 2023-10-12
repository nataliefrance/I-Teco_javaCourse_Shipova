package Ex_7;

public abstract class Animal {

    private int quantityOfLegs;
    int age;
    protected int weight;
    public boolean hasFur;

    public Animal(){
    }

    public Animal(int quantityOfLegs, int age, int weight, boolean hasFur) {
        this.quantityOfLegs = quantityOfLegs;
        this.age = age;
        this.weight = weight;
        this.hasFur = hasFur;
    }

    public void eat() {
        System.out.println("Животное поело.");
    }

    protected void pee() {
        System.out.println("Животное сходило в кусты.");
    }

    protected void sleep() {
        System.out.println("Животное уснуло.");
    }

    public int getQuantityOfLegs() {
        return quantityOfLegs;
    }

    public void setQuantityOfLegs(int quantityOfLegs) {
        this.quantityOfLegs = quantityOfLegs;
    }
}