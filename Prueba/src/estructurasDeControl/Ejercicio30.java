package estructurasDeControl;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Ejercicio30 {

    public static void main(String[] args) {
        String[] symbols = {"0","1","2","3","4","5","6","7","8","9","#","(",")","!","?","¿","-","*","%","$","n","o","p","q","r","s","t","u","v","w","x","y","z"
        		,"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        int length =13;
        Random random;
        try {
            random = SecureRandom.getInstanceStrong();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                 int indexRandom = random.nextInt ( symbols.length );
                 sb.append( symbols[indexRandom] );
            }
            String password = sb.toString();
            System.out.println(password);
          } catch (NoSuchAlgorithmException e){
              System.out.println(e.toString());
          }
     }
}