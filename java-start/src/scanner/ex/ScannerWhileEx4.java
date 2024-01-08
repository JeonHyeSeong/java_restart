package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while (true){
            System.out.println(" 1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int menu = scanner.nextInt();

            if(menu == 1){
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String str = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();
                System.out.println("구매 수량을 입력하세요 : ");
                int count = scanner.nextInt();

                totalPrice += price * count;
                System.out.println("상품명 : "+str+", 가격 : "+price+", 수량 : "+count+", 합계 : "+price*count);
            } else if (menu == 2) {
                System.out.println("총 금액 : "+totalPrice);
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
