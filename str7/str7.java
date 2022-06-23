package str7;

public class str7 {
public static void main(String[] args)
{
    String c1 = "Stephen Edwin King";
    String c2 = "Walter Winchell";
    String c3 = "stephen edwin king";

    // Test any of the above Strings equal to one another
    boolean equals1 = c1.toLowerCase().equals(c2.toLowerCase());
    boolean equals2 = c1.toLowerCase().equals(c3.toLowerCase());

    // Display the results of the equality checks.
    System.out.println("\"" + c1 + "\" equals \"" +
        c2 + "\"? " + equals1);
    System.out.println("\"" + c1 + "\" equals \"" +
        c3 + "\"? " + equals2);
}
}


