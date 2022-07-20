public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(String name, int magic, int distTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstPower){
        super(name,magic,distTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    @Override
    public String toString() {
        return String.format("%s; Cunning: %d; Determination: %d; Ambition: %d; Resourcefulness: %d; Thirst power: %d;",
                super.toString(),cunning,determination,ambition,resourcefulness,thirstPower);
    }
}
