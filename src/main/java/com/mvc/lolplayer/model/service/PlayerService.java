package com.mvc.lolplayer.model.service;

import com.mvc.lolplayer.model.dao.PlayerDAO;
import com.mvc.lolplayer.model.dto.PlayerDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.mvc.common.Template.getSqlSession;

public class PlayerService {

    private PlayerDAO playerDAO;

    public PlayerDTO selectOnePlayerById(int playerCode) {
        SqlSession sqlSession = getSqlSession();

        playerDAO = sqlSession.getMapper(PlayerDAO.class);
        PlayerDTO selectedPlayer = playerDAO.selectPlayerById((playerCode));
        sqlSession.close();

        return selectedPlayer;
    }

    public List<PlayerDTO> selectAllPlayers() {
        SqlSession sqlSession = getSqlSession();

        playerDAO = sqlSession.getMapper(PlayerDAO.class);
        List<PlayerDTO> playerList = playerDAO.selectAllPlayers();
        sqlSession.close();

        return playerList;
    }

    public boolean insertPlayer(PlayerDTO player) {
        SqlSession sqlSession = getSqlSession();

        playerDAO = sqlSession.getMapper(PlayerDAO.class);
        boolean result = playerDAO.insertPlayer(player);

        if (result) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public boolean updatePlayer(PlayerDTO player) {
        SqlSession sqlSession = getSqlSession();

        playerDAO = sqlSession.getMapper(PlayerDAO.class);
        boolean result = playerDAO.updatePlayer(player);

        if (result) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public boolean deletePlayer(int playerCode) {
        SqlSession sqlSession = getSqlSession();

        playerDAO = sqlSession.getMapper(PlayerDAO.class);
        boolean result = playerDAO.deletePlayer(playerCode);

        if (result) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

}
