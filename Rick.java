import java.util.Scanner;
public class Rick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int degree;
        double x;

        double e=1;

        System.out.print("Enter degree: ");
        degree=in.nextInt();
        System.out.print("Enter x: ");
        x=in.nextDouble();

        for(int i=0; i<degree; i++)
            e/=10;

        double sum=1;
        double num=1;
        int denum=2;
        double N=-x*x/(denum*(denum-1));

        while(Math.abs(N)>e) {
            N=-x*x/(denum*(denum-1));
            num*=N;
            sum+=+num;
            denum+=2;
        }

        System.out.print("cos: ");
        System.out.println(sum);
        System.out.print("Math cos: ");
        System.out.print(Math.cos(x));
    }
}
