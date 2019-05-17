import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        /*  Using the text above, create 6 objects.  */

        Exercise e1 = new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. " +
                "Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that your return to starting position.", 30, "floor");
        Exercise e2 = new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbow positioned under your shoulder " +
                "your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "floor");
        Exercise e3 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down. " +
                "Goto a squat and exhale, the explode back up to standing, driving through heels.", 45, "standup");
        Exercise e4 = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle. " +
                "Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "floor");
        Exercise e5 = new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, "standup");
        Exercise e6 = new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "standup");

        /*  create print method (using formatting) that prints those objects in a form like this:   */

        /*System.out.println(e6.getExerciseName() + "             " + "DURATION:  " + e6.getDuration()+ " seconds");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("DESCRIPTION: " + e6.getDescription()+ "\n"); */


        /* Put your objects into an array and call your printing method in the loop.   */
        Exercise[] exArray = {e1, e2, e3, e4, e5, e6};


        System.out.println("Exercises\n");
        for (int i = 0; i < exArray.length; i++) {
           exArray[i].printExercise();
           System.out.println("\n");
        }




        /*  Create a new loop through the array and print only:
            Exercises on the floor */

        String floor;
        System.out.println("Floor Exercises \n");
        for (int i = 0; i < exArray.length; i++){
            if (exArray[i].getPosition().equals("floor")){
                exArray[i].printExercise();
                System.out.println("\n");
            }
        }


        /* Exercises that are on the floor and take more than a minute */

        String standup;
        System.out.println("exFloor more than a minute \n");
        for (int i = 0; i < exArray.length; i++) {
            if (! exArray[i].getPosition().startsWith("standup") && exArray[i].getDuration() > 60) {
                exArray[i].printExercise();
            System.out.println("\n");
            }
        }



        // Bonus
        System.out.println("Bonus");
        String[] IntervalWorkOut = {"Push-ups", "Squats", "Planks"};
        IntervalWorkOut intW1 = new IntervalWorkOut(IntervalWorkOut, 4, 30 );
        intW1.printIntervalWorkOut();
    }
}


