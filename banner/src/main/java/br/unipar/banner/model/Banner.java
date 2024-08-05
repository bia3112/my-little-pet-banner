package br.unipar.banner.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "BANNERS")
public class Banner {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String imageUrl;
    private boolean isActive = true;
    private boolean isPaid;
    private String externLink;
    private int credit;
    private Date createdAt;
    private Date deadLine;
    private int numberOfClicks;
    private String storeId;

    public Banner() {
    }

    public Banner(int numberOfClicks, Date deadLine, Date createdAt,
                  int credit, String externLink, boolean isPaid,
                  boolean isActive, String imageUrl, String title, UUID id, String storeId) {
        this.numberOfClicks = numberOfClicks;
        this.deadLine = deadLine;
        this.createdAt = createdAt;
        this.credit = credit;
        this.externLink = externLink;
        this.isPaid = isPaid;
        this.isActive = isActive;
        this.imageUrl = imageUrl;
        this.title = title;
        this.id = id;
        this.storeId = storeId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getExternLink() {
        return externLink;
    }

    public void setExternLink(String externLink) {
        this.externLink = externLink;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    //    @PrePersist
//    protected void onCreate() {
//        this.createdAt = new Date();
//        if (this.isActive == null) {
//            this.isActive = true;
//        }
//    }

}
