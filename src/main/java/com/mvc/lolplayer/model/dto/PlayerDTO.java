package com.mvc.lolplayer.model.dto;

import java.sql.Date;

public class PlayerDTO implements java.io.Serializable {

    private String playerId;
    private String playerName;
    private String playerNick;
    private String email;
    private String phone;
    private String teamCode;
    private String position;
    private String rank;
    private int gamePlayed;
    private double kdaRatio;
    private String coachId;
    private Date joinDate;
    private Date retireDate;
    private String activeYn;

    public PlayerDTO() {
    }

    public PlayerDTO(String playerId, String playerName, String playerNick, String email, String phone, String teamCode, String position, String rank, int gamePlayed, double kdaRatio, String coachId, Date joinDate, Date retireDate, String activeYn) {
        super();
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerNick = playerNick;
        this.email = email;
        this.phone = phone;
        this.teamCode = teamCode;
        this.position = position;
        this.rank = rank;
        this.gamePlayed = gamePlayed;
        this.kdaRatio = kdaRatio;
        this.coachId = coachId;
        this.joinDate = joinDate;
        this.retireDate = retireDate;
        this.activeYn = activeYn;
    }
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNick() {
        return playerNick;
    }

    public void setPlayerNick(String playerNick) {
        this.playerNick = playerNick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(int gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public double getKdaRatio() {
        return kdaRatio;
    }

    public void setKdaRatio(double kdaRatio) {
        this.kdaRatio = kdaRatio;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(Date retireDate) {
        this.retireDate = retireDate;
    }

    public String getActiveYn() {
        return activeYn;
    }

    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerNick='" + playerNick + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", position='" + position + '\'' +
                ", rank='" + rank + '\'' +
                ", gamePlayed=" + gamePlayed +
                ", kdaRatio=" + kdaRatio +
                ", coachId='" + coachId + '\'' +
                ", joinDate=" + joinDate +
                ", retireDate=" + retireDate +
                ", activeYn='" + activeYn + '\'' +
                '}';
    }

    public void setEmpId(String empId) {
    }

    public void setEntDate(Date entDate) {
    }

    public void setTeamName(String teamName) {
    }

    public void setDebutYear(Date debutYear) {
    }

    public void setDetailInfo(String detailInfo) {
    }

    public void setActiveStatus(String activeStatus) {
    }

    public void setContact(String contact) {
    }
}
