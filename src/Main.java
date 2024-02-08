import java.util.Scanner;

class CustomException extends Exception{
     public CustomException(String str){
         super(str);
     }
}

public class Main {
    public static void main (String[] args) throws CustomException {
        Scanner sc=new Scanner(System.in);
        String para=sc.nextLine();
        String word=sc.next();

        String[] arr=para.split(" ");
        int count=0;
        for(String i: arr) {
            if (i.equalsIgnoreCase(word)){
                count++;
            }
        }
        if(count==0){
            throw new CustomException("Word not found.");
        }
        else System.out.println(count);
    }
}