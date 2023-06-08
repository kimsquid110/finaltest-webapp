package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.dto.PlayerDTO;
import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player/insert")
public class InsertPlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String playerName = request.getParameter("playerName");
        String position = request.getParameter("position");
        String teamName = request.getParameter("teamName");
        java.sql.Date debutYear = java.sql.Date.valueOf(request.getParameter("debutYear"));
        String detailInfo = request.getParameter("detailInfo");
        String activeStatus = request.getParameter("activeStatus");
        String contact = request.getParameter("contact");

        PlayerService playerService = new PlayerService();
        String newPlayerId = playerService.selectNewPlayerId();

        PlayerDTO player = new PlayerDTO();
        if(newPlayerId != null) player.setPlayerId(newPlayerId);
        player.setPlayerName(playerName);
        player.setPosition(position);
        player.setTeamName(teamName);
        player.setDebutYear(debutYear);
        player.setDetailInfo(detailInfo);
        player.setActiveStatus(activeStatus);
        player.setContact(contact);

        System.out.println("insert request player : " + player);

        boolean result = playerService.insertPlayer(player);

        String path = "";
        if(result) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "insertPlayer");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "신규 선수 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
