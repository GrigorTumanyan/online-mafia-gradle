package entity.model;

import entity.enums.MafiaRole;
import entity.enums.PlayerStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Player extends BaseEntity{
    @Column
    private int speakingTime;
    @Column
    private int rebuke;
    @OneToOne
    private MafiaRole gameRole;
    @OneToOne
    User user;
    @OneToOne
    private PlayerStatus playerStatus;
}
