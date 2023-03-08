import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen to can in:");
        int num = scanner.nextInt();


        if (num < 2) {
            System.out.println("so nguyen to dau tien la " + num);
        } else {
            int i = 2;
            boolean status = true;
            while (i <= Math.sqrt(num)) {

                if (num % i == 0) {
                    status = false;
                    break;
                }
                i++;
            }
            if (status) {
                System.out.println(num + " la so nguyen to");
            } else {
                System.out.println(num + " khong la so nguyen to");
            }
        }

    }

}