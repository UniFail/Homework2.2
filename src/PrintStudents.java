public class PrintStudents {

    public void printSeparator(){
        System.out.println("======================================");
    }
    public void print(Gryffindor[] gryffindors) {
        printSeparator();
        System.out.println("There are " + gryffindors.length + " students studying at the Gryffindor Faculty");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            gryffindor.print();
        }
        printSeparator();
    }
        public void print(Hufflepuff[] hufflepuffs){
            System.out.println("There are " + hufflepuffs.length + " students studying at the Hufflepuff Faculty");
            for (int i = 0; i < hufflepuffs.length; i++) {
                Hufflepuff hufflepuff = hufflepuffs[i];
                hufflepuff.print();
            }
            printSeparator();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("There are " + ravenclaws.length + " students studying at the Ravenclaw Faculty");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            ravenclaw.print();
        }
        printSeparator();
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("There are " + slytherins.length + " students studying at the Slytherin Faculty");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            slytherin.print();
        }
        printSeparator();
    }
}
