package com.mvc.lolplayer.model.dao;

import com.mvc.lolplayer.model.dto.PlayerDTO;

import java.util.List;

public interface PlayerDAO {

    List<PlayerDTO> selectAllPlayers();

    PlayerDTO selectPlayerById(String playerId);

    boolean insertPlayer(PlayerDTO player);

    boolean updatePlayer(PlayerDTO player);

    boolean deletePlayer(String playerId);
}
