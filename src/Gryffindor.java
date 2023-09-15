public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;


    public Gryffindor(String name, String surName, int transgress, int powerOfMagic, int nobleness, int honor, int bravery) {
        super(name, surName, transgress, powerOfMagic);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
        this.facultyName = "Гриффиндор";
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return  super.toString() + ", благородство = " + nobleness +
                ", честь = " + honor +
                ", храбрость = " + bravery + ".";
    }

    public int getSumPersonalProperties() {
        return getNobleness() + getHonor() + getBravery();
    }
}
