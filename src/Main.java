public class Main {

    public static void main(String[] args) {

        Exercise e1 = new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. " +
                "Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that your return to starting position.", 30, "");

        System.out.println("Push ups: "+ e1.getExerciseName() + ", " + "Duration: " + e1.getDuration()+ ", " + "Description: " + e1.getDescription() + "seconds");
    }
}
