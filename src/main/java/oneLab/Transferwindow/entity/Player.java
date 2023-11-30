package oneLab.Transferwindow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "surName")
    String surName;

    @Column(name = "teamId")
    int teamId;

    public Player() {
    }

    public Player(String name, String surname, int teamId) {
        this.name = name;
        this.surName = surname;
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surName;
    }

    public void setSurname(String surname) {
        this.surName = surname;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
