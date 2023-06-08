package com.mvc.lolplayer.model.service;

import com.mvc.lolplayer.model.dao.PlayerDAO;
import com.mvc.lolplayer.model.dto.PlayerDTO;

import java.util.List;

public class PlayerService {

    private PlayerDAO playerDao;

    public PlayerService(PlayerDAO playerDao) {
        this.playerDao = playerDao;
    }

    public PlayerService() {

    }

    public List<PlayerDTO> selectAllPlayers() {
        return playerDao.selectAllPlayers();
    }

    public PlayerDTO selectPlayerById(String playerId) {
        return playerDao.selectPlayerById(playerId);
    }

    public boolean insertPlayer(PlayerDTO player) {
        return playerDao.insertPlayer(player);
    }

    public boolean updatePlayer(PlayerDTO player) {
        return playerDao.updatePlayer(player);
    }

    public boolean deletePlayer(String playerId) {
        return playerDao.deletePlayer(playerId);
    }

    public int updateEmp(PlayerDTO emp) {
        return 0;
    }

    public PlayerDTO selectOneEmpById(String empId) {
        return null;
    }

    public List<PlayerDTO> selectAllEmp() {
        return null;
    }

    public String selectNewEmpId() {
        return null;
    }

    public String selectNewPlayerId() {
        return null;
    }

    public PlayerDTO selectOnePlayerById(String playerId) {
        return null;
    }
}
