import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int x;
        System.out.println("Nhap so thang can tinh ngay");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        switch (x) {
            case 2:
                System.out.println("tháng " + x + " có 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("Thang " + x + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + x + " có 30 ngày");
                break;
            default:
                System.out.println("Tháng bạn nhập không có");
        }
    }
}
