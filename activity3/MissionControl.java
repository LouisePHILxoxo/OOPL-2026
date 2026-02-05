package activity3;

import java.time.format.DateTimeFormatter;

public class MissionControl {
    public static void main(String[] args) {

        SecretAgent agent = new SecretAgent("003", "Ethan Hunt", 10
            
        );

        System.out.println("=== AGENT STATUS ===");
        System.out.println("Agent ID: " + agent.getAgentId());
        System.out.println("Codename: " + agent.getCodename());
        System.out.println("Clearance Level: " + agent.getClearanceLevel());
        System.out.println("On Mission: " + agent.isOnMission());
        System.out.println("Last Mission Completion: " + agent.getLastMissionCompletionTime());
        System.out.println();

        Mission mission = new Mission();

        mission.displayMissionBriefing();
        System.out.println();

        if (agent.getClearanceLevel() >= mission.getDifficulty()) {
            agent.startMission();
            System.out.println("Agent " + agent.getAgentId() + " is cleared for mission.");
        } else {
            System.out.println("Agent " + agent.getAgentId() + "'s clearance is too low for this mission.");
        }

        if (agent.isOnMission()) {
            System.out.println("\n=== UPDATED AGENT STATUS ===");
            System.out.println("On Mission: " + agent.isOnMission());
        }

        System.out.println("\n...Mission in progress...\n");

        if (agent.isOnMission()) {
            agent.completeMission();
            System.out.println("Mission completed.");
        }

        System.out.println("\n=== FINAL AGENT STATUS ===");
        System.out.println("On Mission: " + agent.isOnMission());
        if (agent.getLastMissionCompletionTime() != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm");
            System.out.println("Last Mission Completion: " + agent.getLastMissionCompletionTime().format(formatter));
        } else {
            System.out.println("No mission completed yet.");
        }
    }
}