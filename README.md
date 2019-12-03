# RoboVentures
Welcome to RoboVentures! (Trademark pending..)

This program will have users name and create robots of different types who will perform a variety of tasks for you.

## Background Info
- Program was created in VS Code 2017 using Java
- Command-line application
- Each robot type and task have stats that affect the pace/success of a given task

## Getting started
- Open the directory where all the files are saved
- Compile RoboVentures.java using javac
- Run RoboVentures by calling java RoboVentures

Once running you will be faced with the the main menu of the program. Here you can traverse the menu by entering any of the lettered choices.
- For example if you wish to see what tasks our robots can aid you with, simply press B (or b)

If you wish to close the application simply enter Q when inside the main menu.

## Creating/Using Robots
In here you will be able to select the type of robot you would like and name them. Then, you will be asked the task(s) and ordering you would like the robot(s) to complete them. Lets get started!

- Follow the instructions clearly for best results (some errors are caught but not quite all).
- Enter the type, name of the robot you wish to create in that format (type followed by a comma then a space followed by its name) casing is not relevant for either type or robot.
- After entering your first robot you will be faced with the same menu, you can continue to add robots or simply enter R when done. 

Once you have finished creating your new friends you will be presented with the numbered tasks the robot can complete. All robots have six total tasks to choose from, however, no two types have identical tasks to choose from. In this menu you can do the following:

- Using the format displayed you may enter any amount of tasks you wish the robot to perform (with a minimum of 1) in the order you enter them, beware of your robot's stamina and failing tasks (See below for robot stats)
- Keep in mind that although there are six availalble tasks for each robot, no robot has the stamina to complete all six in one go so choose wisely!
- Once you finish entering the task(s)'s order if you made multiple robots you will now be asked to set the task order for the following robots you have made
- After all the robot's task order have been set the robots will get to work!

At this point your first robot will begin their given task in the order specified by the user. The robot type-specific stats will determine whether the task can be done, or how fast it will be done. Depending on the task the program will be pause anywhere from 1 to 20 seconds while the robot is at work.

If the robot does not have the stamina to complete a task it will shutdown.

## Viewing Robot Types
In this page you can learn about the different types of robots available at RoboVentures! 

You will be taken to a menu that will ask you which type you are interested in then display the information of the model you chose.

## Viewing Tasks
Similarly, in this page you can view all the tasks available for the robots to complete alonside their stats.

## Robot Type & Task Stats
Each robot type has an endurance value (ranging from 110-150) and a speed bonus value (0-0.25) that will help determine if they can complete a task and how fast they can get it done. Alongside this, each task has an "Affinity" type who gets extra stats whenever they perform it.

ENDURANCE: How much stamina a Robot has, if it reaches 0 it will not be able to perform its task

SPEED BONUS: How much faster a robot can perform a task (from 0% to 25%)
- for example a task that would take 100 seconds would be completed in 75.

AFFINITY: The type of robot who will gain bonus stats by performing its preffered task. Affinity gives a flat boost of an extra 15% faster completion and will use up 10 less stamina.

PERSISTENCE/FATIGUE: How much stamina a certain task will lower once completed.

## Author
- Carlos Valdes <https://github.com/CarlosValdes470>

