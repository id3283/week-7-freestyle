package simpleenums;

public class Main {
    public static void main(String[] args) {

        // // can be one of: 1 - squat,  2- benchPress, 3 - bicepCurl, 3 - studentThrow

        Workout workout = new Workout();

        WorkoutSet set = new WorkoutSet(Exercise.BENCH_PRESS, 12);

        workout.addSet(set);
        workout.addSet(new WorkoutSet(Exercise.SQUAT, 12));
        workout.addSet(new WorkoutSet(Exercise.BENCH_PRESS, 12));

        workout.printWorkout();
    }
}
