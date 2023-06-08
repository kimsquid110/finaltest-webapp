package com.mvc.lolplayer.model.dto;

public class PlayerDTO {
    private int playerCode;
    //
    private String playerName;
    //
    private String birthDate;
    //
    private String position;

    //
    private String bio;
    //
    private String contact;
    // 팀 코드
    private String teamCode;
    // 활동 상태
    private String activeStatus;


    public PlayerDTO(){

    }

    public int getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(int playerCode) {
        this.playerCode = playerCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerCode=" + playerCode +
                ", playerName='" + playerName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", bosition='" + position + '\'' +
                ", bio='" + bio + '\'' +
                ", contact='" + contact + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
