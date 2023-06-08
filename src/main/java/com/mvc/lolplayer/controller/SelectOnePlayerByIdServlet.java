package com.mvc.lolplayer.controller;

import com.mvc.lolplayer.model.dto.PlayerDTO;
import com.mvc.lolplayer.model.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player/select")
public class SelectOnePlayerByIdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* 전달한 파라미터 꺼내기 */
        String playerId = request.getParameter("playerId");

        System.out.println("playerId : " + playerId);

        /* 선수 ID를 이용해 선수 정보를 조회하는 비즈니스 로직 호출 */
        PlayerService playerService = new PlayerService();
        PlayerDTO selectedPlayer = playerService.selectOnePlayerById(playerId);

        System.out.println("selectedPlayer : " + selectedPlayer);

        /* 비즈니스 로직 실행 결과에 따라 뷰 연결 */
        String path = "";
        if(selectedPlayer != null) {
            path = "/WEB-INF/views/player/showPlayerInfo.jsp";
            request.setAttribute("selectedPlayer", selectedPlayer);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "선수 정보 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }

}
