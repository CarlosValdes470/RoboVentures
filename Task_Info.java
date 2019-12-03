/*
**************************************************************************************

CREATED BY: Carlos Valdes

FOR: Red Ventures Technical Assessment

**************************************************************************************
*/
import java.util.Scanner;

public class Task_Info{
    private String task;
    private String continues;
    Scanner task_Choice = new Scanner(System.in);

    //Task info menu, asks user which task they are interested in seeing then sends them into the info method
    public void Task_Info_Choice()
    {
        System.out.println("Welcome to the Task Info Menu! Please select which common task(s) our Robo friends will be tackling for you.");
        System.out.println("A: Cleaning dishes\nB: Sweeping the house\nC: Doing laundry\nD: Taking out recycling\nE: Making sammiches\nF: Mowing the lawn\nG: Raking leaves\nH: Dog bath\nI: Baking cookies\nJ: Washing car\n");
        task = task_Choice.nextLine().toUpperCase();
        Tasks(task);
    }
    //Displays info of task user selected
    public void Tasks(String task)
    {
        if(task.equals("A"))
        {
            System.out.println("TASK: Doing dishes");
            System.out.println("PERSISTENCE: -20");
            System.out.println("ETA: 1000ms/1s");
            System.out.println("AFFINITY: UNIPEDAL\n");
            System.out.println("Tired of seeing (and smelling) undone dishes in your sink?");
            System.out.println("No problem! Have one of our Robo friends make cooking/cleaning fun!\n");
            System.out.println("Robot types compatible for this task:\nUnipedal, Radial, Arachnid, Aeronautical");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase(); //Ask user if they wish to see another task or quit the task info menu
            if(continues.equals("Y"))
            {
                Task_Info_Choice(); //If they wish to see another task, sends user back to the task info menu
            }
        }
        else if(task.equals("B"))
        {
            System.out.println("TASK: Sweeping the house");
            System.out.println("PERSISTENCE: -20");
            System.out.println("ETA: 3000ms/3s");
            System.out.println("AFFINITY: ARACHNID\n");
            System.out.println("Sweeping again? Why stay home and sweep when you can be out connecting with the world around you?\nHave one of our Robo associates do the Spring, Summer, Fall, and Winter cleaning for you.");
            System.out.println("Sit back, relax, and let one of our Robots worry about how much Fabuloso is enough\n");
            System.out.println("Robot types compatible for this task:\nQuadrupedal, Arachnid");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("C"))
        {
            System.out.println("TASK: Doing laundry");
            System.out.println("PERSISTENCE: -30");
            System.out.println("ETA: 10000ms/10s");
            System.out.println("AFFINITY: RADIAL\n");
            System.out.println("Having friends compliment you on your 'pink' new shirt due to a laundry accident?\nHow about showing up to a party with a shirt so wrinkled that you could swear John Cena fought it?");
            System.out.println("Leave it to the Pros here at RoboVentures! We'll make your mom proud.\n");
            System.out.println("Robot types compatible for this task:\nUnipedal, Radial, Aeronautical");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("D"))
        {
            System.out.println("TASK: Taking out recycling");
            System.out.println("PERSISTENCE: -30");
            System.out.println("ETA: 4000ms/4s");
            System.out.println("AFFINITY: AERONAUTICAL\n");
            System.out.println("Judged for 'recycling' bottles without washing off their contents? Not sure what is or is not recycable in the first place?");
            System.out.println("Stop procrastinating and start saving turtles! The models here at RoboVentures are equipped with precise recycle timing technologies!\n");
            System.out.println("Robot types compatible for this task:\nQuadrupedal, Arachnid, Aeronautical, Unipedal");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("E"))
        {
            System.out.println("TASK: Making Sammiches");
            System.out.println("PERSISTENCE: -15");
            System.out.println("ETA: 7000ms/7s");
            System.out.println("AFFINITY: BIPEDAL\n");
            System.out.println("There is no shame in purchasing one of our state of the art robots to simply make you a BLT; that recipe is far too vague than it lets on!");
            System.out.println("Our RoboVentures robots will make you forget about Subway, Quiznos, and even Jimmy!\n");
            System.out.println("Robot types compatible for this task:\nUnipedal, Bipedal, Aeronautical, Bipedal, Radial");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("F"))
        {
            System.out.println("TASK: Mowing the lawn");
            System.out.println("PERSISTENCE: -35");
            System.out.println("ETA: 20000ms/20s");
            System.out.println("AFFINITY: BIPEDAL\n");
            System.out.println("Why fight your neighbor over whose lawn mower cuts better? Once your neighbor sees one of our robots in your lawn, your dominance will be established!");
            System.out.println("Cut grass the way it was meant to be cut!\n");
            System.out.println("Robot types compatible for this task:\nQuadrupedal, Bipedal");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("G"))
        {
            System.out.println("TASK: Raking leaves");
            System.out.println("PERSISTENCE: -15");
            System.out.println("ETA: 18000ms/18s");
            System.out.println("AFFINITY: ARACHNID\n");
            System.out.println("Ever seen a spider rake leaves? Your neighbors have not either. It's time for you to change the status quo. Order one of our robots today to rake your fallen leaves.\n");
            System.out.println("Robot types compatible for this task:\nBipedal, Arachnid, Radial, Unipedal");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("H"))
        {
            System.out.println("TASK: Dog bath");
            System.out.println("PERSISTENCE: -40");
            System.out.println("ETA: 14500ms/14.5s");
            System.out.println("AFFINITY: BIPEDAL\n");
            System.out.println("When was the last time you enjoyed giving your fur-ball of love a bath? When was the last time you gave it a bath?");
            System.out.println("If you are unsure about either of those questions, then look no further than RoboVentures! Our amazing models are 100% animal friendly!\n");
            System.out.println("Robot types compatible for this task:\nBipedal, Quadrupedal, Radial");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("I"))
        {
            System.out.println("TASK: Baking cookies");
            System.out.println("PERSISTENCE: -30");
            System.out.println("ETA: 8000ms/8s");
            System.out.println("AFFINITY: UNIPEDAL\n");
            System.out.println("Are those ready-to-bake cookies not turning out like they appear on the box label? Tired of disappointing friends and family with half-melted or burnt cookies?");
            System.out.println("Do everyone a favor and have one of our amazing assistants make those cookies look their greatest! We'll make a cookie monster out of you!\n");
            System.out.println("Robot types compatible for this task:\nUnipedal, Aeronautical, Bipedal, Radial");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        else if(task.equals("J"))
        {
            System.out.println("TASK: Washing car");
            System.out.println("PERSISTENCE: -45");
            System.out.println("ETA: 20000ms/20s");
            System.out.println("AFFINITY: Aeronautical\n");
            System.out.println("Just because your car costs less than one of our helpers does not mean you can't have it shining bright!");
            System.out.println("Our built in AAA technology will make your car look brand new!\n");
            System.out.println("Robot types compatible for this task:\nArachnid, Radial, Aeronautical, Bipedal, Quadrupedal");
            System.out.println("Do you wish to see another task?(Y/N): ");
            continues = task_Choice.nextLine().toUpperCase();
            if(continues.equals("Y"))
            {
                Task_Info_Choice();
            }

        }
        //If user does not input correctly, display error message and take them back to the task info menu
        else
        {
            System.out.println("Whoops! Looks like you did not choose correctly, please try again!");
            Task_Info_Choice();
        }
    }
}