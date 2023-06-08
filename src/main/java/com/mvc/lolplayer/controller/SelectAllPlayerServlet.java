package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.dto.PlayerDTO;
import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/player/list")
public class SelectAllPlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PlayerService playerService = new PlayerService();
        List<PlayerDTO> playerList = playerService.selectAllPlayers();

        for(PlayerDTO player : playerList) {
            System.out.println(player);
        }

        String path = "";
        if(playerList != null) {
            path = "/views/player/playerList.jsp";
            request.setAttribute("playerList", playerList);
        } else {
            path = "/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 목록 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }

}
