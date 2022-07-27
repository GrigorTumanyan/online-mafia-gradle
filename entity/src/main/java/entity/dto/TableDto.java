package entity.dto;

import entity.enums.TableStatus;
import entity.model.Player;
import entity.model.User;

import java.util.List;
import java.util.Objects;

public class TableDto {

    private String title;

    private int maxPlayer;

    private int maxAudience;

    private User createdBy;

    private TableStatus status;

    private List<User> audienceList;

    private List<Player> currentPlayerList;

    public TableDto(String title, int maxPlayer, int maxAudience, User createdBy, TableStatus status, List<User> audienceList, List<Player> currentPlayerList) {
        this.title = title;
        this.maxPlayer = maxPlayer;
        this.maxAudience = maxAudience;
        this.createdBy = createdBy;
        this.status = status;
        this.audienceList = audienceList;
        this.currentPlayerList = currentPlayerList;
    }

    public TableDto() {
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
        TableDto tableDto = (TableDto) o;
        return maxPlayer == tableDto.maxPlayer && maxAudience == tableDto.maxAudience && Objects.equals(title, tableDto.title) && Objects.equals(createdBy, tableDto.createdBy) && status == tableDto.status && Objects.equals(audienceList, tableDto.audienceList) && Objects.equals(currentPlayerList, tableDto.currentPlayerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, maxPlayer, maxAudience, createdBy, status, audienceList, currentPlayerList);
    }

    @Override
    public String toString() {
        return "TableDto{" +
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
