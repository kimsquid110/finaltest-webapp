package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.dto.PlayerDTO;
import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/player/insert")
public class InsertPlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String playerName = request.getParameter("playerName");
        String birthDate = request.getParameter("birthDate");
        String position = request.getParameter("position");
        String bio = request.getParameter("bio");
        String contact = request.getParameter("contact");
        String teamCode = request.getParameter("teamCode");
        String activeStatus = request.getParameter("activeStatus");

        PlayerDTO player = new PlayerDTO();
        player.setPlayerName(playerName);
        player.setBirthDate(birthDate);
        player.setPosition(position);
        player.setBio(bio);
        player.setContact(contact);
        player.setTeamCode(teamCode);
        player.setActiveStatus(activeStatus);

        PlayerService playerService = new PlayerService();
        boolean result = playerService.insertPlayer(player);

        String path = "";
        if (result) {
            path = "/views/common/successPage.jsp";
            request.setAttribute("successCode", "insertPlayer");
        } else {
            path = "/views/common/errorPage.jsp";
            request.setAttribute("message", "신규 선수 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
