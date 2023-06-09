package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.dto.PlayerDTO;
import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player/update")
public class UpdatePlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        int playerCode = Integer.parseInt(request.getParameter("playerCode"));
        String playerName = request.getParameter("playerName");
        String position = request.getParameter("position");
        String bio = request.getParameter("bio");
        String contact = request.getParameter("contact");
        String teamCode = request.getParameter("teamCode");
        String activeStatus = request.getParameter("activeStatus");

        PlayerDTO player = new PlayerDTO();
        player.setPlayerCode(playerCode);
        player.setPlayerName(playerName);
        player.setPosition(position);
        player.setBio(bio);
        player.setContact(contact);
        player.setTeamCode(teamCode);
        player.setActiveStatus(activeStatus);


        boolean result = new PlayerService().updatePlayer(player);

        String path = "";
        if(result) {
            path = "/views/common/successPage.jsp";
            request.setAttribute("successCode", "updatePlayer");
        } else {
            path = "/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
