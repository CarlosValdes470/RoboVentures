/*
**************************************************************************************

CREATED BY: Carlos Valdes

FOR: Red Ventures Technical Assessment

**************************************************************************************
*/
import java.util.Scanner;

public class Robot{
    private String robo_Name;
    private String robo_Type;
    private double speed;
    private int endurance;
    private boolean flag = true;
    private String[] task_Order = new String[4];
    Scanner order = new Scanner(System.in);

    public Robot(){}

    //Receives Robot type and name then passes it to the type "branding" method
    public Robot(String type, String name){
        robo_Type = type.toUpperCase();
        robo_Name = name;

        Robot_types(robo_Type);
    }

    //Assigns Robot stats based on type chosen by user, then sends them to the appropriate method to decide task order
    public void Robot_types(String type){
        
        if(type.equals("UNIPEDAL")){
            endurance = 115;
            speed = 0;
            isUnipedal();
        }
        else if(type.equals("BIPEDAL")){
            endurance = 110;
            speed = 0.2;
            isBipedal();
        }
        else if(type.equals("QUADRUPEDAL")){
            endurance = 150;
            speed = 0.25;
            isQuadrupedal();
        }
        else if(type.equals("ARACHNID")){
            endurance = 110;
            speed = 0.25;
            isArachnid();
        }
        else if(type.equals("RADIAL")){
            endurance = 120;
            speed = 0;
            isRadial();
        }
        else if(type.equals("AERONAUTICAL")){
            endurance = 120;
            speed = 0.1;
            isAeronautical();
        }
        //If user entered an incorrect model then display error message and dont allow any method to use its information
        else{
            System.out.println("Sorry! We do not carry that model, please try again with a model we carry.");
            flag = false;
        }

        
    }

    //for testing purposes, displays Robot info, so long as it has a valid type
    public void Robot_Info()
    {
        if(flag)
        {
            System.out.println("\nNAME: "+robo_Name);
            System.out.println("TYPE: "+robo_Type);
            System.out.println("SPEED: "+speed);
            System.out.println("ENDURANCE: "+endurance);
        }
    }
    
    public String getName()
    {
        if(flag)
        {
            return robo_Name;
        }
        else
        {
            return "\nSorry! We do not carry this model.\n";
        }
    }

    public String getType()
    {
        if(flag)
        {
            return robo_Type;
        }
        else
        {
            return "\nSorry! We do not carry this model.\n";
        }
    }

    public double getSpeed()
    {
        if(flag)
        {
            return speed;
        }
        else
        {
            return -1;
        }
    }

    //Updates the current Robot's endurance after the fatigue taken from a task
    public void updateEndurance(int fatigue)
    {
        endurance += fatigue;
    }

    public int getEndurance()
    {
        if(flag)
        {
            return endurance;
        }
        else
        {
            return -1;
        }
    }

    //Returns order for tasks to be done, entered by user
    public String[] getTask_Order()
    {
        return task_Order;
    }

    //Lists the tasks the Robot can do and asks user for which task(s) and order the Robot should do
    public void isUnipedal()
    {
        //Any number of numbered tasks can be entered from having a Robot do just 1 to 1000!
        //Except most Robots will break down after 4~5 tasks to recharge...
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Dishes\n2) Laundry\n3) Make sammich\n4) Bake cookies\n5) Recycling\n6) Rake leaves\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }

    public void isBipedal()
    {
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Make sammich\n2) Mow the lawn\n3) Rake leaves\n4) Dog bath\n5) Baking\n6) Washing car\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }

    public void isQuadrupedal()
    {
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Sweep house\n2) Take out recycling\n3) Mow the lawn\n4) Dog bath\n5) Dishes\n6) Make sammich\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }

    public void isArachnid()
    {
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Sweep house\n2) Take out recycling\n3) Rake leaves\n4) Wash car\n5) Dishes\n6) Make sammich\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }

    public void isRadial()
    {
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Dishes\n2) Laundry\n3) Rake leaves\n4) Wash car\n5) Dog bath\n6) Bake\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }

    public void isAeronautical()
    {
        System.out.println("\nPlease select the order you wish "+robo_Name+" to tackle these tasks:");
        System.out.println("1) Take out recycling\n2) Bake cookies\n3) Make sammich\n4) Wash car\n5) Dishes\n6) Laundry\n");
        System.out.println("Select the order seperated by commas (Example: 2,3,4,1,5,6):");
        String order_Sequence = order.nextLine();
        task_Order = order_Sequence.split(",");
    }
}