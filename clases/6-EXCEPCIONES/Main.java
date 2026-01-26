

public class Main{
    public static void main(String[] args) {
        
        //- TRY CATCH (PERMITEN MANEJAR EXCEPSIONES)
        // try {
        //     FileReader file = new FileReader("nonexistent.txt"); 

        // } catch (Exception e) {
        //     System.out.println("File not found.");
        // }
        
        //- NO SIEMPRE USAR TRY CATCH
        // String file = null;

        // if(file != null) {
        //     System.out.println(file.charAt(0));
        // }

        //- THROW
        // throw new RuntimeException("MALO");

        //- THROWS

        //- TRY WITH RESOURCES

        //- PRACTICA
        UserService u = new UserService();

        u.registerUser(121);


    }
}