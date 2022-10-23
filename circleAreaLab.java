public class circleArea
{
    public static void main(String[] args)
    {
        double radius = 7.5;
        System.out.println(areaOfCircle(radius));
        
        radius = 10;
        System.out.println(areaOfCircle(radius));
        
        radius = 72.534;
        System.out.println(areaOfCircle(radius));
        
        radius = 55;
        System.out.println(areaOfCircle(radius));
        
        radius = 101;
        System.out.println(areaOfCircle(radius));
        
        radius = 99.952;
        System.out.println(areaOfCircle(radius));        
    }
    
    public static String areaOfCircle(double radius)
    {
        double area = Math.pow(radius, 2) * Math.PI;
        return String.format("Circle area is :: %.2f", area);
    }
}
