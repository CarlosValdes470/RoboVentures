/*
**************************************************************************************

CREATED BY: Carlos Valdes

FOR: Red Ventures Technical Assessment

**************************************************************************************
*/
import java.util.Scanner;

public class Robot_Type_Info{
    private String type;
    private String continues;
    Scanner choice = new Scanner(System.in);

    //Root type info menu
    public void Info_Choice()
    {
        System.out.println("\nWelcome to RoboVentures garage! Which model are you interested in?");
        System.out.println("A: Unipedal\nB: Bipedal\nC: Quadrupedal\nD: Arachnid\nE: Radial\nF: Aeronautical\n");
        type = choice.nextLine().toUpperCase();
        Types(type);

    }
    //Displays the robot type chosen by the user, its stat rankings for endurance/speed from LOW -> EXCELLENT
    //Quirky descriptions of each Robot (please laugh :( ) and the tasks the type is compatible with
    public void Types(String type)
    {
        if(type.equals("A"))
        {
            System.out.println("TYPE: UNIPEDAL\nENDURANCE: AVG\nSPEED BONUS: NONE\n");
            System.out.println("This RoboVentures model known as 'Big Foot' here at RV, may not be the greatest walker, but it makes cookies that put Girl Scouts to shame!");
            System.out.println("Never skipping leg day, Big Foots accompish just as much as their multi-pedal counterparts and excel at tasks that don't require walking (or hopping...)\n");
            System.out.println("HOBBIES: Leg day at the gym, unicycling sports, baton twirling\n");
            System.out.println("This model is compatible with the folowing tasks:\nWashing dishes, laundry, baking, recycling, raking leaves, and making sammiches\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase(); //Asks user if they wish to see another Robot type
            if(continues.equals("Y"))
            {
                Info_Choice(); //If answered yes, sends user back to the type info menu. Otherwise, quits back to the main menu
            }
        }
        else if(type.equals("B"))
        {
            System.out.println("TYPE: BIPEDAL\nENDURANCE: EXCELLENT\nSPEED BONUS: 20%\n");
            System.out.println("Our most popular model! Known as 'Ric' has a huge cult following due to its uncanny resemblence to C-3PO.");
            System.out.println("The possibilities are endless. It can even wash your dog!\n");
            System.out.println("HOBBIES: Commic-Con appearances, long walks in the beach, basketball\n");
            System.out.println("This model is compatible with the folowing tasks:\nMowing the lawn, dog baths, raking leaves, baking, car washing, and making sammiches\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Info_Choice();
            }

        }
        else if(type.equals("C"))
        {
            System.out.println("TYPE: QUADRUPEDAL\nENDURANCE: EXCELLENT\nSPEED BONUS: 25%\n");
            System.out.println("We endearingly call this model 'Fido'. It can help out with many fetching type tasks! You may have found your new BFF!\n");
            System.out.println("HOBBIES: Dog walker trainer, ultimate frisbee, taking walks in the park\n");
            System.out.println("This model is compatible with the folowing tasks:\nRecycling, dog baths, sweeping, making sammiches, car washing, and mowing the lawn\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Info_Choice();
            }

        }
        else if(type.equals("D"))
        {
            System.out.println("TYPE: ARACHNID\nENDURANCE: LOW\nSPEED BONUS: 25%\n");
            System.out.println("Nicknamed 'Charlotte', this model is always great at juggling different tasks and fitting into tight spaces");
            System.out.println("Whatever this model lacks in size, it more than makes up for in speed, flexibility, and proper grammar!\n");
            System.out.println("Hobbies: browsing the web, volunteering at haunted houses, dancing Salsa\n");
            System.out.println("This model is compatible with the folowing tasks:\nRecycling, sweeping, raking leaves, dishes, making sammiches, and car washing\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Info_Choice();
            }

        }
        else if(type.equals("E"))
        {
            System.out.println("TYPE: RADIAL\nENDURANCE: ABOVE AVG\nSPEED BONUS: NONE\n");
            System.out.println("This unit, known as the 'Wazowski' model, is not the most popular with children.");
            System.out.println("While it may be as creepy looking as a Monsters Inc. associate, this model has great durability and can double as a scarecrow!\n");
            System.out.println("HOBBIES: Stand-up comedy, restauraunt critic, Uno player\n");
            System.out.println("This model is compatible with the folowing tasks:\nDoing dishes, laundry, raking leaves, dog baths, baking, and car washing\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Info_Choice();
            }

        }
        else if(type.equals("F"))
        {
            System.out.println("TYPE: AERONAUTICAL\nENDURANCE: LOW\nSPEED BONUS: 10%\n");
            System.out.println("Our 'Bender' is definitely out of this world! It is the only flight-enabled unit designed for tasks that seem just out of reach.");
            System.out.println("The sky is the limit though. (Shameless plug: Bender2.0 The Sky Is Not The Limit coming out soon!).\n");
            System.out.println("HOBBIES: Flying above neighbors yard, watching telenovelas, church choir\n");
            System.out.println("This model is compatible with the folowing tasks:\nRecycling, baking, making sammiches, dishes, laundry, and washing car\n");
            System.out.println("Do you wish to see another model?(Y/N): ");
            continues = choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Info_Choice();
            }

        }
        //If user entered an incorrect menu choice, sends them back to the info menu to try again
        else
        {
            System.out.println("Whoops! Looks like you did not choose correctly, please try again!");
            Info_Choice();
        }
    }
}