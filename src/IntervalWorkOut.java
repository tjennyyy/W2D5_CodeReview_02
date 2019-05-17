/*Create new class IntervalWorkout that can contain: Several Exercises, Number of repetitions, Breaktime (in seconds)
 Example of an: Interval Workout  object contains Pushup, Squat and Plank exercises (in this order), with four repetitions means that you need to do a following interval workout:
    Pushup, Squat and Plank, then a Break (duration: Breaktime),    then
    Pushup, Squat and Plank, then a Break (duration: Breaktime),    then
    Pushup, Squat and Plank, then a Break (duration: Breaktime),    then
    Pushup, Squat and Plank
*/



public class IntervalWorkOut {

    private String[] exIn;
    private int repetitions;
    private int breaktime;

    public IntervalWorkOut(String[] exIn, int repetitions, int breaktime){
        this.exIn = exIn;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }

    public void printIntervalWorkOut(){
        System.out.println("****************************");
        System.out.println("Interval Workout STARTS!!!!");
        System.out.println("****************************");

        for(int i = 1; i <= this.repetitions; i ++) {
            System.out.println("============================");
            System.out.println("ROUND " + i + ":");

            for (int a = 0; a < exIn.length; a++)
                System.out.println(this.exIn[a]);

            if (i < this.repetitions) {
                System.out.println("============================");
                System.out.println("DO THE BREAK (" + this.breaktime + "SECONDS)");
            }
        }

        System.out.println("\n");
        System.out.println("****************************");
        System.out.println("CONGRATS - YOUR ARE DONE !!!");
        System.out.println("****************************");
    }
}
