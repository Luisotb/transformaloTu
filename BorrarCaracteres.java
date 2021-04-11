import java.util.Scanner;

public class BorrarCaracteres{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    String DeleteChar;
    String result;

    System.out.println("Enter phrase: ");
    message = sc.nextLine();

    System.out.println("¿Character to delete?: ");
    DeleteChar = sc.nextLine();

    result = message.replace(DeleteChar, " ");

    System.out.println(result);
}

}