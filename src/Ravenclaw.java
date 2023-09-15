public class Ravenclaw extends Hogwarts {
    private int intelligent;
    private int wise;
    private int witty;
    private int fullOfCreativity;


    public Ravenclaw(String name, String surName, int transgress, int powerOfMagic, int intelligent, int wise, int witty, int fullOfCreativity) {
        super(name, surName, transgress, powerOfMagic);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
        this.facultyName = "Когтевран";
    }

    public int getIntelligent() {
        return intelligent;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public int getSumPersonalProperties() {
        return getIntelligent() + getWise() + getWitty() + getFullOfCreativity();
    }

    @Override
    public String toString() {
        return super.toString() + " Ум = " + intelligent +
                ", Мудрость = " + wise +
                ", Остроумие = " + witty +
                ", Творчество = " + fullOfCreativity + ".";
    }

}
