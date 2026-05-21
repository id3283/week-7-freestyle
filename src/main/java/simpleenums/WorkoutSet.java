package simpleenums;

public class WorkoutSet {
    // can be one of: squat, benchPress, bicepCurl, studentThrow
    private Exercise exercise;
    private int reps;

    public WorkoutSet(Exercise exercise, int reps) {
        this.exercise = exercise;
        this.reps = reps;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public int getReps() {
        return reps;
    }
}
