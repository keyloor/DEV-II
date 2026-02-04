public class Main {
    public static void main(String[] args) {
        // int[] numbers = {10, 20, 30, 40, 50};
        // String[] fruits = new String[3];

        // System.out.println(numbers[2] + " | " + fruits[2]);

        Person person = new Person("Charlie", 23, 2);

        //Sin iterador
        // System.out.println(person.getPets()[0].getPetName());
        // System.out.println(person.getPets()[1].getPetName());
        
        //Con iterador
        IOManager.printMessage("\nPets: ");
        
        for (Pet pet : person.getPetManager().getPets()) {
            if(pet != null) {
                IOManager.printMessage(pet.getPetName());
            }
        }
        

        

        
        



        
        



    }
}