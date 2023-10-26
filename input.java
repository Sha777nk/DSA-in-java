import java.util.*;

public class input {
    public static void main(String[] args)
     {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome "+name);
        sc.close();
    }

}
