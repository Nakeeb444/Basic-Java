import java.util.*;

class Palindrome1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int oddCount = 0;

        for(int i = 0; i < s.length(); i++){

            int count = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if(count % 2 != 0){
                oddCount++;
            }
        }

        if(oddCount <= 1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}