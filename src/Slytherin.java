public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, String surName, int transgress, int powerOfMagic, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(name, surName, transgress, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
        this.facultyName = "Слизерин";
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public int getSumPersonalProperties() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getDesireForPower();
    }

    public String toString() {
        return super.toString() + " Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + desireForPower + ".";
    }
}
