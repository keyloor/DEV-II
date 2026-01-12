public class Main {
    public static void main(String[] args) {
        // int[] numbers = {10, 20, 30, 40, 50};
        // String[] fruits = new String[3];

        // System.out.println(numbers[2] + " | " + fruits[2]);

        Person person = new Person("Charlie", 23, 5);

        IOManager.printMessage("\nPets: ");

        //Sin iterador
        // System.out.println("Sin iterador: ");
        // System.out.println(person.getPets()[0].getPetName());
        // System.out.println(person.getPets()[1].getPetName());
        // System.out.println(person.getPets()[2].getPetName());
        // System.out.println(person.getPets()[3].getPetName());
        // System.out.println(person.getPets()[4].getPetName());

        //Con iterador
        IOManager.printMessage("\nCon iterador: ");
        for (Pet pet : person.getPetManager().getPets()) {
            IOManager.printMessage(pet.getPetName());
        }

        
        



        
        



    }
}