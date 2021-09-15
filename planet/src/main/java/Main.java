import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IllegalArgumentException{
        System.out.print("Enter planet: ");
        Scanner console = new Scanner(System.in);
        String l=console.nextLine();
        try {
            Planet planet = Planet.valueOf(l);
            System.out.println(planet);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("ERROR: Illegal name planet!");
            System.out.println("Available type planet: Earth, Jupiter, Mercury, Neptune, Pluto, Saturn, Uranus");
        }
    }
}

