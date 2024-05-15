import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть першу стрічку");
        String str1 = scanner.nextLine();
        System.out.println("Ddlsnm lheue cnhsxre");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)){
            System.out.println("Стрічеи рівні");
        }
    }
}