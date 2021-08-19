package maven;

public class CodeupCrypt {

//    The class should have a double static property called version that is not initialized, but it could set any floating number to simulate we have a version number.
    public static double version;

//    It should have a method called hashPassword that takes in a string parameter and hashes it into a new string and return it.
   public static String hashPassword(String string) {
       String hashed = "";
       for (char character : string.toCharArray()) {
           switch (character) {
               case 'a':
               case 'A':
                   hashed += 4;
                   break;
               case 'e':
               case 'E':
                   hashed += 3;
                   break;
               case 'i':
               case 'I':
                   hashed += 1;
                   break;
               case 'o':
               case 'O':
                   hashed += 0;
                   break;
               case 'u':
               case 'U':
                   hashed += 9;
                   break;
               default:
                   hashed += character;
           }
       }
       return hashed;
   }

//    It should have a method called checkPassword that compares two string parameters to make sure they match with a valid hash.

    public static boolean checkPassword(String password, String hashed) {
       return hashed.equals(hashPassword(password));
    }

//    The hashing procedure should be pretty simple, just replace the original String's vowels with numbers, these are the rules:


}
