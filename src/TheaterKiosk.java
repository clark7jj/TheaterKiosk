import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args) {
        // Pseudocode for Task #4
        // class TheaterKiosk
        //     main()
        //         declare variables
        //         num age = 0;
        //         output "Enter your age: "
        //         input age
        //         Process
        //         if age >= 21 then
        //             OUTPUT "You get a wristband. Enjoy the show!"
        //         end if
        //     return
        // endClass

        // Java Code for Task #4
        {
            Scanner in = new Scanner(System.in);
            int age = 0;

            System.out.print("Enter your age: ");
            age = in.nextInt();

            if (age >= 21) {
                System.out.println("You get a wristband. Enjoy the show!");
            }


        }
    }
}
