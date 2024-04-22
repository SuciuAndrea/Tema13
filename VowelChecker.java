import java.util.Scanner;

public class VowelChecker {

    public static boolean containsAllVowels(String str) {
        str = str.toLowerCase();
        
        boolean[] vowelsFound = new boolean[5]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            switch (ch) {
                case 'a':
                    vowelsFound[0] = true;
                    break;
                case 'e':
                    vowelsFound[1] = true;
                    break;
                case 'i':
                    vowelsFound[2] = true;
                    break;
                case 'o':
                    vowelsFound[3] = true;
                    break;
                case 'u':
                    vowelsFound[4] = true;
                    break;
                default:
                    continue;
            }
            
            if (vowelsFound[0] && vowelsFound[1] && vowelsFound[2] && vowelsFound[3] && vowelsFound[4]) {
                return true; 
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter:");
        String input = scanner.nextLine(); 
        
        boolean result = containsAllVowels(input);
        
        System.out.println("Does it contain all the vowels? " + result);
        
        scanner.close();
    }
}

