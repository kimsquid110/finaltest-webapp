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

        int playerCode = Integer.parseInt(request.getParameter("playerCode"));
        PlayerService playerService= new PlayerService();
        boolean result = playerService.deletePlayer(playerCode);

        String path = "";
        if(result) {
            path = "/views/common/successPage.jsp";
            request.setAttribute("successCode", "deletePlayer");
        } else {
            path = "/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 삭제 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
