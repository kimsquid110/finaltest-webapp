package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player/delete")
public class DeletePlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String playerId = request.getParameter("playerId");

        boolean result = new PlayerService().deletePlayer(playerId);

        String path = "";
        if(result) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "deletePlayer");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 삭제 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
