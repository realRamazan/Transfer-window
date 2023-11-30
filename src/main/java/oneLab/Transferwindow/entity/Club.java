package oneLab.Transferwindow.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "country")
    String country;
    @Column(name = "numberOfPlayers")
    int numberOfPlayers;

    public Club(int id, String name, String country, int numberOfPlayers) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.numberOfPlayers = numberOfPlayers;
    }

    public Club() {
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
