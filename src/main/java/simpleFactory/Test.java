package simpleFactory;

import java.util.Scanner;

//简单工厂模式
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A:");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("请选择运算符号（+、-、*、/）：");
        String strOperate = sc.nextLine();
        System.out.println("请输入数字C:");
        double numberC = Double.parseDouble(sc.nextLine());
        Operation operation = OperationFactory.createOperation(strOperate);
        double result = operation.getResult(numberA, numberC);
        System.out.println("结果是："+result);
    }
}
