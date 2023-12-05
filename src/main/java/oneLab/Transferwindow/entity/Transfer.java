package oneLab.Transferwindow.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transfers")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "playerId")
    Integer playerId;
    @Column(name = "fromClubId")
    Integer fromClubId;
    @Column(name = "toClubId")
    Integer toClubId;
    @Column(name = "transferPrice")
    Double transferPrice;
    @Column(name = "transferType")
    String transferType;
    @Column(name = "rentalPeriod")
    Integer rentalPeriod;
    @Column(name = "transferDate")
    Date transferDate;

    public Transfer() {
    }

    public Transfer(Integer id, Integer playerId, Integer fromClubId, Integer toClubId, Double transferPrice, String transferType, Integer rentalPeriod, Date transferDate) {
        this.id = id;
        this.playerId = playerId;
        this.fromClubId = fromClubId;
        this.toClubId = toClubId;
        this.transferPrice = transferPrice;
        this.transferType = transferType;
        this.rentalPeriod = rentalPeriod;
        this.transferDate = transferDate;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getFromClubId() {
        return fromClubId;
    }

    public void setFromClubId(Integer fromClubId) {
        this.fromClubId = fromClubId;
    }

    public Integer getToClubId() {
        return toClubId;
    }

    public void setToClubId(Integer toClubId) {
        this.toClubId = toClubId;
    }

    public Double getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(Double transferPrice) {
        this.transferPrice = transferPrice;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public Integer getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(Integer rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }


}
