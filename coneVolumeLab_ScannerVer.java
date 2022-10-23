import java.util.Scanner;

public class coneVolumeLab {
    public static void main (String args[])
    {
        Scanner keyb = new Scanner(System.in);
        double radius; 
        double height;

        System.out.print("Enter the largest possible radius of the cone: ");
        radius = keyb.nextDouble();

        System.out.print("\nEnter the height of the cone: ");
        height = keyb.nextDouble();

        System.out.println(volumeCone(radius, height));

    }

    public static double volumeCone(double radius, double height)
    {
        double preAnswer1 = (radius * radius) * 3.14;
        double preAnswer2 = height / 3;
        double answer = preAnswer1*preAnswer2;
        return answer; 
    }
    
}
