import java.util.Scanner;
public class TP8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez les coefficients de l'équation");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int delta=(b*b)-4*(a*c);
        if(delta>0){
            double solution1=(-b-Math.sqrt(delta))/2*a;
            double solution2=(-b+Math.sqrt(delta))/2*a;
            System.out.printf("L'équation posséde 2 solution : solution 1= %f et solution 2= %f",solution1,solution2);
        }
        else {
            double part1=-b/2*a;
            double part2=delta/2*a;

           System.out.printf("Les solution sont complexes : solution1  =%f+i*%f     solution2 =%f" +
                   "i*%f",part1,part2,part1,part2);
        }
        if(delta==0){
            double solution=-b/(2*a);
            System.out.printf("L'équation posséde une seul solution =" ,solution);
        }

    }
}
