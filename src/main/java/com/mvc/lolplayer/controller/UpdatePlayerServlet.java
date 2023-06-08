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

        String playerId = request.getParameter("playerId");
        // 수정할 정보들을 여기에 추가하고 매개변수로 받아올 수 있습니다.

        PlayerDTO player = new PlayerDTO();

        // 수정할 정보들을 player 객체에 설정합니다.

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
