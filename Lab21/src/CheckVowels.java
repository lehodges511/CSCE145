import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class CheckVowels {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a file name and I will say how many times AEIOU appears in order");
        String file = keyboard.next();
        Scanner sc = new Scanner(new File(file));
        StringBuilder s = new StringBuilder();
        while (sc.hasNextLine()) {
            s.append(sc.nextLine());
        }
        int count = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                temp += ch;
                if (!isSubstringVowel(temp)) {
                    temp = "";
                    continue;
                }
                if (temp.toLowerCase().equals("aeiou")) {
                    count++;
                    temp = "";
                }
            }
        }
        sc.close();
        keyboard.close();
        System.out.println("the file " + file + " has \"AEIOU\" in order " + count + " times");
    }

    public static boolean isSubstringVowel(String s) {
        String vowel = "aeiou";
        return vowel.contains(s.toLowerCase());
    }
}