import java.util.Scanner;

public class UcKenarUzunlugundanAlanHesaplama {
    public static void main(String[] args) {
        System.out.println("Kenar uzunluklarını sırasıyla yazınız.");
        Scanner input =new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double u=(a+b+c)/2;
        double alan=Math.sqrt(u* (u-a)*(u-b)*(u-c));
        System.out.println("Alan:"+alan);
    }
}
