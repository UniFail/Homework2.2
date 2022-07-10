public class PrintStudents {

    public void printSeparator(){
        System.out.println("======================================");
    }
    public void print(Gryffindor[] gryffindors) {
        printSeparator();
        System.out.println("There are " + gryffindors.length + " students studying at the Gryffindor Faculty");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Student's name: " + gryffindor.getName() + "\n"
                    + "The Power of magic " + gryffindor.getMagic() + "; "
                    + "The distance of the transgression " + gryffindor.getDistTransgression() + "; "
                    + "Nobility " + gryffindor.getNobility() + "; "
                    + "Honor " + gryffindor.getHonor() + "; "
                    + "Bravery " + gryffindor.getBravery() + ".\n");
        }
        printSeparator();
    }
        public void print(Hufflepuff[] hufflepuffs){
            System.out.println("There are " + hufflepuffs.length + " students studying at the Hufflepuff Faculty");
            for (int i = 0; i < hufflepuffs.length; i++) {
                Hufflepuff hufflepuff = hufflepuffs[i];
                System.out.println("Student's name: " + hufflepuff.getName() + "\n"
                        + "The Power of magic " + hufflepuff.getMagic() + "; "
                        + "The distance of the transgression " + hufflepuff.getDistTransgression() + "; "
                        + "Diligence " + hufflepuff.getDiligence() + "; "
                        + "Loyalty " + hufflepuff.getLoyalty() + "; "
                        + "Honesty " + hufflepuff.getHonesty() + ".\n");
            }
            printSeparator();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("There are " + ravenclaws.length + " students studying at the Ravenclaw Faculty");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Student's name: " + ravenclaw.getName() + "\n"
                    + "The Power of magic " + ravenclaw.getMagic() + "; "
                    + "The distance of the transgression " + ravenclaw.getDistTransgression() + "; "
                    + "Mind " + ravenclaw.getMind() + "; "
                    + "Wisdom " + ravenclaw.getWisdom() + "; "
                    + "Wit " + ravenclaw.getWit() + "; "
                    + "Creativity " + ravenclaw.getCreativity() + ".\n");
        }
        printSeparator();
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("There are " + slytherins.length + " students studying at the Slytherin Faculty");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Student's name: " + slytherin.getName() + "\n"
                    + "The Power of magic " + slytherin.getMagic() + "; "
                    + "The distance of the transgression " + slytherin.getDistTransgression() + "; "
                    + "Cunning " + slytherin.getCunning() + "; "
                    + "Determination " + slytherin.getDetermination() + "; "
                    + "Ambition " + slytherin.getAmbition() + "; "
                    + "Resourcefulness " + slytherin.getResourcefulness() + "; "
                    + "Lust for power " + slytherin.getThirstPower() + ".\n");
        }
        printSeparator();
    }
}
