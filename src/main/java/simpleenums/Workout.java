package simpleenums;

import java.util.ArrayList;

public class Workout {
    ArrayList<WorkoutSet> sets = new ArrayList<>();

    public void addSet(WorkoutSet set) {
        this.sets.add(set);
    }

    public void printWorkout() {
        for(WorkoutSet set: this.sets) {

            if (set.getExercise() == Exercise.SQUAT) {
                System.out.println("That doesn't look like 380 lbs to me, sissy boy.");
            }

            System.out.println("Exercise: " + set.getExercise() + " " + set.getReps() + " reps");
        }
    }
}
