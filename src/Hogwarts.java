public class Hogwarts {
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

    private int ability() {
        return magic + distTransgression;
    }
}
