import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String [] vowels = {"a","e","i","o","u"};
        int []count = {0,0,0,0,0};

        System.out.println("Welcome to the vowel counter and sorter!\nEnter a phrase!");
        String phrase = key.nextLine();
        String copyPhrase = phrase.toLowerCase();

        for(int i=0; i<phrase.length(); i++)
        {
            char ch = copyPhrase.charAt(i);
            if(ch == 'a')
            {
                count[0]++;
            }
            else if(ch == 'e')
            {
                count[1]++;
            }
            else if(ch == 'i')
            {
                count[2]++;
            }
            else if(ch=='o')
            {
                count[3]++;
            }
            else if(ch=='u')
            {
                count[4]++;
            }
        }
        for(int i=0; i<count.length; i++)
        {
            int min=i;
            for(int j=i+1; j<count.length; j++)
            {
                if(count[j]<count[min])
                {
                    int temp = count[j];
                    count[j]=count[min];
                    count[min]=temp;

                    String temp1=vowels[j];
                    vowels[j]=vowels[min];
                    vowels[min]=temp1;
                }
            }
            System.out.println(vowels[i]+" "+count[i]);
        }
    }
}
