package strategy;

import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {

        double price = 0d;
        int num = 0;
        double totalPrice = 0d;
        double total = 0d;
        int discount = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请输入商品销售模式 1.原价 2.八折 3.七折：");
            discount = Integer.parseInt(sc.nextLine());
            System.out.println("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();
            if(price >0 && num>0){
                totalPrice = price * num;
                total = totalPrice + total;
                System.out.println();
                System.out.println("单价："+price + "元 数量："+num+" 合计："+totalPrice+"元");
                System.out.println();
                System.out.println("总价："+total+"元");
                System.out.println();
            }
        }while (price >0 && num >0);

    }
}
