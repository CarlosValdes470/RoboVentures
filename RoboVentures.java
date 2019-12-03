/*
**************************************************************************************

CREATED BY: Carlos Valdes

FOR: Red Ventures Technical Assessment

**************************************************************************************
*/
import javax.lang.model.util.ElementScanner6;
import javax.sound.sampled.SourceDataLine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class RoboVentures{

//Methods for tasks calculate stats and determine if a task can be performed by a robot
    static void do_My_Dishes(Robot r){
        //1000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0; //task lowers the amount required for the task if the robot type has affinity for the task
        double speed_Bonus = r.getSpeed(); //grab the robot type's speed bonus from the current robot object
        int type_Affinity_Vitality = 0; //task boost that lowers fatigue on robot if robot type has affinity for task
        int persistence = -20; //The fatigue the task has on the robot
        int robo_Vitality = r.getEndurance(); //get endurance for the robot type
        String robo_Name = r.getName(); //get name of the robot

        //checks if your robot has the "affinity" type and provides bonus if it does
        if(r.getType().equals("UNIPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }
        //calculates if you have enough endurance for the task and how long the task will take you based on bonus/affinity
        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 1000 - (1000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has started washing the dishes from last night's >solo< dinner");

        //if the task results in endurance (perservere) falling to 0 or below then it can not be performed
        if(perservere > 0)
        {   
            //pauses the program for the amount of time the task takes to complete
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
            Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished washing the dishes!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        //lets user know their Robo buddy unfortunately failed the task
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard and could not finish your mountain of dishes...\n");
        }
        //Updates the robots endurance by applying the fatigue of the task to them for future tasks
        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void sweep_My_House(Robot r){
        //3000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -20;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("QUADRUPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 3000 - (3000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has started sweeping the house. Careful or you'll be swept off your feet!");

        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
            Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished sweeping!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! The legos are to blame...\n");
        }

        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void do_My_Laundry(Robot r){
        //10000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -30;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("RADIAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 10000 - (10000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has started the laundry. They are not impressed by your wardrobe...");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished washing your undies!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard and could not finish your dirty laundry...\n");
        }

        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void please_Recycle(Robot r){
        //4000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -30;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("AERONAUTICAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 4000 - (4000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" is taking out the recycling you always forget.");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" took out the recycling!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard... Who will save the turtles now?!\n");
        }

        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void what_is_a_Sammich(Robot r){
        //7000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -15;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("BIPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 7000 - (7000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has started making your sammich (they wonder if this is the purpose of their existence).");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished making your BLT!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard and failed to add that last slice of gluten-free bread..\n");
        }
        
        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void mow_My_Lawn(Robot r){
        //20000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -35;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("BIPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 20000 - (20000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" started mowing the lawn and is now competing with your neighbor's lawn mower.");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished mowing the lawn (possible damage was made to neighbor's lawn)\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard. Your neighbor's lawn mower was just too mighty.\n");
        }
        
        r.updateEndurance((persistence + type_Affinity_Vitality));
        
    }

    static void rake_them_Leaves(Robot r){
        //18000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -15;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("ARACHNID"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 18000 - (18000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" began to rake the leaves. Looks like your neighbor decided to use his leaf blower again...");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished raking the leaves! (You now owe your neighbor a leaf blower). \nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard. Neighbor leaf blower 1. You 0.!\n");
        }
        
        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void wash_Princess(Robot r){
        //14500 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -40;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("BIPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 14500 - (14500*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" began the daunting task of giving Princess a bath...");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" Finished washing Princess (there seems to be multiple bite marks on "+robo_Name+" though..)\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard. WHERE'S PRINCESS?!\n");
        }
        
        r.updateEndurance((persistence + type_Affinity_Vitality));
    }
    static void i_Want_Samoas(Robot r){
        //8000 original milliseconds spent on task with no bonus
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -30;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("UNIPEDAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 8000 - (8000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has embodied the spirit of a girl scout.");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" made some fire Samoas!\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard and burnt the Samoas..(not the fire samoas you were expecting)\n");
        }

        r.updateEndurance((persistence + type_Affinity_Vitality));
    }

    static void wash_HondaCivic94(Robot r){
        //20000 original milliseconds spent on task with no bonuses
        double type_Affinity_Speed = 0;
        double speed_Bonus = r.getSpeed();
        int type_Affinity_Vitality = 0;
        int persistence = -45;
        int robo_Vitality = r.getEndurance();
        String robo_Name = r.getName();

        if(r.getType().equals("AERONAUTICAL"))
        {
            type_Affinity_Speed = 0.15;
            type_Affinity_Vitality = 10;
        }

        int perservere = (robo_Vitality + type_Affinity_Vitality) + persistence;
        double time_Spent = 20000 - (20000*(speed_Bonus + type_Affinity_Speed));

        System.out.println(robo_Name+" has started washing your Honda Civic (It seems like it has never been washed before...)");
        
        if(perservere > 0)
        {
            try
            {
                Thread.sleep((int)time_Spent); 
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            System.out.println(robo_Name+" finished cleaning your Honda and now it looks like a Prius.\nTime elapsed: "+(time_Spent/1000)+"s\n");
        }
        else
        {
            System.out.println("Oh no! "+robo_Name+" has collapsed! They worked themselves too hard. Let's be honest, it was an impossible task to begin with..\n");
        }

        r.updateEndurance((persistence + type_Affinity_Vitality));
    }
    //Determines which tasks (and their order) the robot will be performing based on user-chosen input from the Robot object
    static void im_Not_Doing_Chores(Robot r){
        int iterator = 0;
        String type = r.getType(); //gets type of current Robot
        String[] task_Order = r.getTask_Order().clone(); //receives the numbered order the user wishes the tasks to be performed.
        
        //performs tasks based on robot type and user-input order from the Robot object
        if(type.equals("UNIPEDAL"))
        {
            //Goes through however many numbered tasks were entered and performs the task method(s) in the order received
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        do_My_Dishes(r);
                        break;
                    case "2":
                        do_My_Laundry(r);
                        break;
                    case "3":
                        what_is_a_Sammich(r);
                        break;
                    case "4":
                        i_Want_Samoas(r);
                        break;
                    case "5":
                        please_Recycle(r);
                        break;
                    case "6":
                        rake_them_Leaves(r);
                        break;
                }
            }
        }
        else if(type.equals("BIPEDAL"))
        {
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        what_is_a_Sammich(r);
                        break;
                    case "2":
                        mow_My_Lawn(r);
                        break;
                    case "3":
                        rake_them_Leaves(r);
                        break;
                    case "4":
                        wash_Princess(r);
                        break;
                    case "5":
                        i_Want_Samoas(r);
                        break;
                    case "6":
                        wash_HondaCivic94(r);
                        break;
                }
            }
        }
        else if(type.equals("QUADRUPEDAL"))
        {
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        sweep_My_House(r);
                        break;
                    case "2":
                        please_Recycle(r);
                        break;
                    case "3":
                        mow_My_Lawn(r);
                        break;
                    case "4":
                        wash_Princess(r);
                        break;
                    case "5":
                        what_is_a_Sammich(r);
                        break;
                    case "6":
                        wash_HondaCivic94(r);
                        break;
                }
            }
        }
        else if(type.equals("ARACHNID"))
        {
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        sweep_My_House(r);
                        break;
                    case "2":
                        please_Recycle(r);
                        break;
                    case "3":
                        rake_them_Leaves(r);
                        break;
                    case "4":
                        wash_HondaCivic94(r);
                        break;
                    case "5":
                        do_My_Dishes(r);
                        break;
                    case "6":
                        what_is_a_Sammich(r);
                        break;
                }
            }
        }
        else if(type.equals("RADIAL"))
        {
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        do_My_Dishes(r);
                        break;
                    case "2":
                        do_My_Laundry(r);
                        break;
                    case "3":
                        rake_them_Leaves(r);
                        break;
                    case "4":
                        wash_HondaCivic94(r);
                        break;
                    case "5":
                        wash_Princess(r);
                        break;
                    case "6":
                        i_Want_Samoas(r);
                        break;
                }
            }
        }
        else if(type.equals("AERONAUTICAL"))
        {
            for(; iterator < task_Order.length; iterator++)
            {
                switch(task_Order[iterator])
                {
                    case "1":
                        please_Recycle(r);
                        break;
                    case "2":
                       i_Want_Samoas(r);
                        break;
                    case "3":
                        what_is_a_Sammich(r);
                        break;
                    case "4":
                        wash_HondaCivic94(r);
                        break;
                    case "5":
                        do_My_Dishes(r);
                        break;
                    case "6":
                        do_My_Laundry(r);
                        break;
                }
            }
        }
        //if an invalid task number was entered do nothing
        else
        {
            return;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 0; //iterator
        int i = 1; //iterator
        String user_Robot =""; //user input string
        String user_Choice =""; //user input string
        ArrayList<String[]> split_arr = new ArrayList<String[]>(); //holds Robot type+name pairs as inputed
        ArrayList<Robot> my_Robots = new ArrayList<>(); //holds Robots created by user during batch

        System.out.println("Welcome to RoboVentures! Where you will meet your new helpful friend(s).");

        //replays menu for quick back and forth repetitions of tasks until the user wishes to quit (Q)
        while(!user_Choice.equals("Q"))
        {

            System.out.println("Type the letter of the page you wish to enter\n\nA: Create/Use Robots\nB: Information on Robot types\nC: Information on tasks\nQ: Quit program");
            user_Choice = input.nextLine().toUpperCase(); //Grabs first menu choice (accepting both lower/upper casing)

            //Robot creation/use menu
            if(user_Choice.equals("A"))
            { 
                //Repeatedly asks for new Robot entries (their type and name) until user is done adding Robots (R)
                while(!user_Robot.toUpperCase().equals("R"))
                {

                    System.out.println("Please enter the type and name of your robot (Example: Arachnid, budgetSpiderMan) or R to stop:");
                    user_Robot = input.nextLine();
                    if(!user_Robot.toUpperCase().equals("R"))
                    {
                        split_arr.add(user_Robot.split(", ")); //adds user input (comma seperated) type+name pairs unless R was entered 
                    }
                }

                //If the Robot pair (type+name) array is not empty or null...
                if(!split_arr.isEmpty()  && split_arr != null)
                {
                    //for each string array (Robot info pair) inside our arraylist we do the following
                    for(String[] robot_String : split_arr)
                    {
                        //Adds Robots to our Robot array with the type+name pair given
                        for(i = 1; i < robot_String.length; i++)
                        {
                            //Passes the type stored in x (index the string array is stored inside the arraylist), 
                            //0 (first index of string array contains the type)
                            //Then passes the name of the Robot stored in x, i (second index where the name is stored)
                            Robot lil_helper = new Robot(split_arr.get(x)[0], split_arr.get(x)[i]);
                            my_Robots.add(lil_helper);
                        }

                        x++;//increments into the next string array stored in the arraylist, if any
                    }

                    x = 0; //reset iterator if they wish to create/use another batch of Robots later on
                    Robot tester = new Robot(); //Robot object

                    //for each robot stored in our Robot arraylist, create a Robot and send it to the task deciding method
                    for(int j = 0; j < my_Robots.size(); j++)
                    {
                        tester = my_Robots.get(j);
                        im_Not_Doing_Chores(tester);
                    }
                    //clears arraylists for repeated use
                    split_arr.clear();
                    my_Robots.clear();
                    user_Robot = ""; //reset if they wish to use create/add option again
                }
            }
            //Sends user to the Robot type menu inside its corresponding object
            else if(user_Choice.equals("B"))
            {
                Robot_Type_Info types = new Robot_Type_Info();
                types.Info_Choice();
            }
            //Sends user to the task info menu inside its corresponding object
            else if(user_Choice.equals("C"))
            {
                Task_Info tasks = new Task_Info();
                tasks.Task_Info_Choice();
            }
        }
    }
}