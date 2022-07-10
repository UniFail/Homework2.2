public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                    new Gryffindor("Harry Potter",75,40,60,55,70),
                    new Gryffindor("Hermione Granger", 80,75,80,60,90),
                    new Gryffindor("Ron Weasley", 70,70,79,50,60)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith",70,10,65,54,71),
                new Hufflepuff("Cedric Diggory", 60,20,85,66,90),
                new Hufflepuff("Justin Finch-Fletchley", 75,90,40,50,65)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang",90,60,60,50,75,64),
                new Ravenclaw("Padma Patil", 70,25,81,60,66,37),
                new Ravenclaw("Marcus Belby", 75,60,30,55,24,68)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy",90,60,60,50,75,64,56),
                new Slytherin("Graham Montague", 70,25,81,60,66,37,15),
                new Slytherin("Gregory Goyle", 75,60,30,55,24,68,48)
        };
        PrintStudents printStudents = new PrintStudents();
        printStudents.print(gryffindors);
        printStudents.print(hufflepuffs);
        printStudents.print(ravenclaws);
        printStudents.print(slytherins);

        bestStudents bestStudents = new bestStudents();
        bestStudents.best(gryffindors,"Harry Potter","Hermione Granger");
        bestStudents.best(hufflepuffs, "Zachariah Smith", "Cedric Diggory");
        bestStudents.best(ravenclaws, "Zhou Chang", "Marcus Belby");
        bestStudents.best(slytherins,"Draco Malfoy","Gregory Goyle");
        bestStudents.generalSkills(slytherins,ravenclaws,hufflepuffs,gryffindors,"Harry Potter","Draco Malfoy");

    }
}