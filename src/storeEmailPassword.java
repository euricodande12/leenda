import java.io.FileWriter;
import java.io.IOException;

public class storeEmailPassword {
 
    public void writeToEmailPasswordFile(String userInfo){
        try {
            try (FileWriter writer = new FileWriter("src\\emails-passwords.txt", true)) {
                writer.append(userInfo+ "\n");
                writer.close();
                System.out.println("User inserted succesfully");
            }
    
    
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
