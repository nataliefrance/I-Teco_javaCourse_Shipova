package Ex_7;

public class Cat extends Animal{

    private String mood;
    int hungry;
    protected int energy;

    public Cat(int quantityOfLegs, int age, int weight, boolean hasFur, String mood, int hungry, int energy) {
        super(quantityOfLegs, age, weight, hasFur);
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public void eat() {
        System.out.println("Кот съел мышь.");;
    }

    public void meow() {
        System.out.println("Мяу");
    }


}