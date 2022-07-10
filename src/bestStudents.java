
public class bestStudents {
    public void printSeparator(){
        System.out.println("======================================");
    }
    public void best(Gryffindor[] gryffindors, String firstStudent,String secondStudent){
        int totalFirst = 0;
        int totalSecond = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            if (gryffindor.getName().equals(firstStudent))
                totalFirst = gryffindor.getNobility()
                            + gryffindor.getHonor()
                            + gryffindor.getBravery();

            if (gryffindor.getName().equals(secondStudent))
                    totalSecond = gryffindor.getNobility()
                            + gryffindor.getHonor()
                            + gryffindor.getBravery();

        }
            if (totalFirst > totalSecond)
                System.out.println(firstStudent + " has "
                        + totalFirst + " total points"
                        + "it's more than " + secondStudent + " has " + totalSecond + " points" );
            else
                System.out.println(secondStudent + " has "
                    + totalSecond + " total points"
                    + " it's more than " + firstStudent + " has " + totalFirst + " points" );
        printSeparator();
    }

    public void best(Hufflepuff[] hufflepuffs,String firstStudent,String secondStudent) {
        int totalFirst = 0;
        int totalSecond = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            if (hufflepuff.getName().equals(firstStudent))
            totalFirst = hufflepuff.getDiligence()
                    + hufflepuff.getLoyalty()
                    + hufflepuff.getHonesty();
            if (hufflepuff.getName().equals(secondStudent))
              totalSecond = hufflepuff.getDiligence()
                        + hufflepuff.getLoyalty()
                        + hufflepuff.getHonesty();
            }

        if (totalFirst > totalSecond)
            System.out.println(firstStudent + " has "
                    + totalFirst + " total points"
                    + "it's more than " + secondStudent + " has " + totalSecond + " points" );
        else
            System.out.println(secondStudent + " has "
                    + totalSecond + " total points"
                    + " it's more than " + firstStudent + " has " + totalFirst + " points" );
        printSeparator();
    }
    public void best(Ravenclaw[] ravenclaws,String firstStudent,String secondStudent) {
        int totalFirst = 0;
        int totalSecond = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (ravenclaw.getName().equals(firstStudent))
                totalFirst = ravenclaw.getMind()
                        + ravenclaw.getWit()
                        + ravenclaw.getCreativity()
                        + ravenclaw.getWisdom();
            if (ravenclaw.getName().equals(secondStudent))
                totalSecond = ravenclaw.getMind()
                        + ravenclaw.getWit()
                        + ravenclaw.getCreativity()
                        + ravenclaw.getWisdom();

        }
        if (totalFirst > totalSecond)
            System.out.println(firstStudent + " has "
                    + totalFirst + " total points"
                    + "it's more than " + secondStudent + " has " + totalSecond + " points" );
        else
            System.out.println(secondStudent + " has "
                    + totalSecond + " total points"
                    + " it's more than " + firstStudent + " has " + totalFirst + " points" );

        printSeparator();
    }
    public void best(Slytherin[] slytherins, String firstStudent,String secondStudent ) {
        int totalFirst = 0;
        int totalSecond = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            if (slytherin.getName().equals(firstStudent))
                totalFirst = slytherin.getThirstPower()
                        + slytherin.getResourcefulness()
                        + slytherin.getAmbition()
                        + slytherin.getDetermination()
                        + slytherin.getCunning();

            if (slytherin.getName().equals(secondStudent))
                totalSecond = slytherin.getThirstPower()
                        + slytherin.getResourcefulness()
                        + slytherin.getAmbition()
                        + slytherin.getDetermination()
                        + slytherin.getCunning();
            }
        if (totalFirst > totalSecond)
            System.out.println(firstStudent + " has "
                    + totalFirst + " total points"
                    + "it's more than " + secondStudent + " has " + totalSecond + " points" );
        else
            System.out.println(secondStudent + " has "
                    + totalSecond + " total points"
                    + " it's more than " + firstStudent + " has " + totalFirst + " points" );

        printSeparator();
    }

    public void generalSkills(Slytherin[] slytherins,Ravenclaw[] ravenclaws, Hufflepuff[] hufflepuffs,Gryffindor[] gryffindors, String firstStudent,String secondStudent){
        int magic1 = 0;
        int magic2 = 0;
        int transgression1 = 0;
        int transgression2 = 0;
        int i = 0;

        for (i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            if (slytherin.getName().equals(firstStudent)) {
                magic1 = slytherin.getMagic();
                transgression1 = slytherin.getDistTransgression();
            }
            if (slytherin.getName().equals(secondStudent)) {
                magic2 = slytherin.getMagic();
                transgression2 = slytherin.getDistTransgression();
            }
        }

            for (i = 0; i < ravenclaws.length; i++) {
                Ravenclaw ravenclaw = ravenclaws[i];
                if (ravenclaw.getName().equals(firstStudent)) {
                    magic1 = ravenclaw.getMagic();
                    transgression1 = ravenclaw.getDistTransgression();
                }
                if (ravenclaw.getName().equals(secondStudent)) {
                    magic2 = ravenclaw.getMagic();
                    transgression2 = ravenclaw.getDistTransgression();
                }
            }
                for (i = 0; i < hufflepuffs.length; i++) {
                    Hufflepuff hufflepuff = hufflepuffs[i];
                    if (hufflepuff.getName().equals(firstStudent)) {
                        magic1 = hufflepuff.getMagic();
                        transgression1 = hufflepuff.getDistTransgression();
                    }
                    if (hufflepuff.getName().equals(secondStudent)) {
                        magic2 = hufflepuff.getMagic();
                        transgression2 = hufflepuff.getDistTransgression();
                    }
                }

                    for (i = 0; i < gryffindors.length; i++) {
                        Gryffindor gryffindor = gryffindors[i];
                        if (gryffindor.getName().equals(firstStudent)) {
                            magic1 = gryffindor.getMagic();
                            transgression1 = gryffindor.getDistTransgression();
                        }
                        if (gryffindor.getName().equals(secondStudent)) {
                            magic2 = gryffindor.getMagic();
                            transgression2 = gryffindor.getDistTransgression();
                        }

                    }
        if (magic1 > magic2)
            System.out.println(firstStudent + " has "
                    + magic1 + " "
                    + "it's more than " + secondStudent + " has " + magic2);
        else
            System.out.println(secondStudent + " has "
                    + magic2 + " "
                    + "it's more than " + firstStudent + " has " + magic1);
        if (transgression1 > transgression2)
            System.out.println(firstStudent + " has "
                    + transgression1 + " "
                    + "it's more than " + secondStudent + " has " + transgression2);
        else
            System.out.println(secondStudent + " has "
                    + transgression2 + " "
                    + "it's more than " + firstStudent + " has " + transgression1);
    }
}
