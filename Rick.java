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
        double chislo=1;
        int znam=2;
        double N=-x*x/(znam*(znam-1));

        while(Math.abs(N)>e) {
            N=-x*x/(znam*(znam-1));
            chislo*=N;
            sum+=+chislo;
            znam+=2;
        }

        System.out.print("cos: ");
        System.out.println(sum);
        System.out.print("Math cos: ");
        System.out.print(Math.cos(x));
    }
}
