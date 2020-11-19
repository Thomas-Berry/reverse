import java.util.Scanner;
public class Main {
    public static String[] reversed( String[] content){
        String[] reverse = new String[content.length];
        for (int i = content.length + 1; i > 0; i--) {
            reverse[content.length - 1] = content[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        while(exit == false){
            System.out.println("enter ");
            if(input.nextLine() == "exit"){

            }
        }
    }
}
