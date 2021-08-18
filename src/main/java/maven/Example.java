package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input something: ");
        String usersResponse = input.nextLine();
        System.out.println("You Entered: " + usersResponse);

        if (!StringUtils.isNumeric(usersResponse)) {
            System.out.println(usersResponse + " is not a number.");
        } else {
            System.out.println(usersResponse + " is a number.");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(usersResponse));
        System.out.println("Reversed: " + StringUtils.reverse(usersResponse));
    }
}
