package activity3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        Random rand = new Random();

        String[] targets = {
            "Retrieve stolen data",
            "Infiltrate enemy base",
            "High value extraction",
            "Disable surveillance system",
            "Intercept secret transmission",
            "Sabotage weapons facility",
            "Shut the system down",
            "Secure classified documents",
            "Neutralize rogue operative",
            "Plant tracking device"
        };

        this.missionTarget = targets[rand.nextInt(targets.length)];
        this.difficulty = rand.nextInt(5) + 1;
        int daysToAdd = rand.nextInt(24) + 7;   // 7 to 30
        this.missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void displayMissionBriefing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + missionDeadline.format(formatter));
    }
}