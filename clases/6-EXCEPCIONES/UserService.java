public class UserService {
    public void registerUser(int age) {
        if(age < 18 || age > 120) {
            throw new InvalidAgeException("Invalid age (Range is 18 - 120).");
        }
    }
}
