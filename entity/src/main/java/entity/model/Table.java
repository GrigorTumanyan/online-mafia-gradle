package entity.model;

import entity.enums.TableStatus;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Table extends BaseEntity {
    @Column
    private String title;
    @Column
    private int maxPlayer;
    @Column
    private int maxAudience;
    @OneToOne
    private User createdBy;
    @Column
    private TableStatus status;
    @Column
    private List<User> audienceList;
    @ManyToMany
    private List<Player> currentPlayerList;

    public Table(String title, int maxPlayer, int maxAudience, User createdBy, TableStatus status, List<User> audienceList, List<Player> currentPlayerList) {
        this.title = title;
        this.maxPlayer = maxPlayer;
        this.maxAudience = maxAudience;
        this.createdBy = createdBy;
        this.status = status;
        this.audienceList = audienceList;
        this.currentPlayerList = currentPlayerList;
    }

    public Table() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public void setMaxPlayer(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public int getMaxAudience() {
        return maxAudience;
    }

    public void setMaxAudience(int maxAudience) {
        this.maxAudience = maxAudience;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public List<User> getAudienceList() {
        return audienceList;
    }

    public void setAudienceList(List<User> audienceList) {
        this.audienceList = audienceList;
    }

    public List<Player> getCurrentPlayerList() {
        return currentPlayerList;
    }

    public void setCurrentPlayerList(List<Player> currentPlayerList) {
        this.currentPlayerList = currentPlayerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return maxPlayer == table.maxPlayer && maxAudience == table.maxAudience && Objects.equals(title, table.title) && Objects.equals(createdBy, table.createdBy) && status == table.status && Objects.equals(audienceList, table.audienceList) && Objects.equals(currentPlayerList, table.currentPlayerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, maxPlayer, maxAudience, createdBy, status, audienceList, currentPlayerList);
    }

    @Override
    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                ", maxPlayer=" + maxPlayer +
                ", maxAudience=" + maxAudience +
                ", createdBy=" + createdBy +
                ", status=" + status +
                ", audienceList=" + audienceList +
                ", currentPlayerList=" + currentPlayerList +
                '}';
    }
}
