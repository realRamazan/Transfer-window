package oneLab.Transferwindow.dto;

public class PlayerDTO {
    int id;
    String name;
    String surName;
    int teamId;

    double currentPrice;

    public PlayerDTO(int id, String name, String surName, int teamId, double currentPrice) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.teamId = teamId;
        this.currentPrice = currentPrice;
    }

    public PlayerDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
