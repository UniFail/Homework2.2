public abstract class Hogwarts {
    private String name;
    private int magic;
    private int distTransgression;

    public Hogwarts(String name, int magic, int distTransgression) {
        this.name = name;
        this.magic = magic;
        this.distTransgression = distTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDistTransgression() {
        return distTransgression;
    }

    public void setDistTransgression(int distTransgression) {
        this.distTransgression = distTransgression;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return magic + distTransgression;
    }

    public void compareHogwatrs(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2)
            System.out.printf("Student %s better, than student %s: %d VS %d%n", getName(), hogwarts.getName(), ability1, ability2);
        else if (ability2 > ability1)
            System.out.printf("Student %s better, than student %s: %d VS %d%n", getName(), hogwarts.getName(), ability2, ability1);
        else if (ability2 == ability1)
            System.out.printf("Student %s like, than student %s: %d VS %d%n", getName(), hogwarts.getName(), ability1, ability2);
    }

    @Override
    public String toString() {
        return String.format("Student's name: %s; The Power of magic: %d; \nThe distance of the transgression: %d", name, magic, distTransgression);
    }
}
