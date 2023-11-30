package oneLab.Transferwindow.dto;

public class ClubDTO {
    int id;
    String name;
    String country;
    int numberOfPlayers;

    public ClubDTO() {
    }

    public ClubDTO(int id,String name, String country, int numberOfPlayers) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.numberOfPlayers = numberOfPlayers;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
