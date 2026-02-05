package activity3;

import java.time.LocalDateTime;

public class SecretAgent {
    private final String agentID;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

  public SecretAgent(String agentID, String codename, int clearanceLevel) {
    this.agentID = agentID;
    this.codename = codename;
    if (clearanceLevel >= 1 && clearanceLevel <= 10) {
        this.clearanceLevel = clearanceLevel;
    } else {
        System.out.println("Invalid clearance level. Setting to default level 1.");
        this.clearanceLevel = 1;
    }
    this.onMission = false;
    this.lastMissionCompletionTime = null;
}

    public String getAgentId() {
        return agentID;
    }

    public String getCodename() {
        return codename;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public boolean isOnMission() {
        return onMission;
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    public void setCodename(String newCodename) {
        this.codename = newCodename;
    }

    public void setClearanceLevel(int level) {
        if (level >= 1 && level <= 5) {
            this.clearanceLevel = level;
        } else {
            System.out.println("Invalid clearance level.");
        }
    }

    public void startMission() {
        this.onMission = true;
    }

    public void completeMission() {
        this.onMission = false;
        this.lastMissionCompletionTime = LocalDateTime.now();
    }
}