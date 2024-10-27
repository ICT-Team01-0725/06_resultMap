package com.ict.resultMap.phj;

import com.ict.resultMap.phj.result_phj_user;
import com.ict.resultMap.phj.result_phj_service;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userDetail")
public class result_phj_controller extends HttpServlet {

    private result_phj_service userService;

    @Override
    public void init() throws ServletException {
        userService = new result_phj_service(/* SqlSessionFactory 객체 전달 */);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 쿼리 스트링에서 사용자 ID를 가져옴
        int userId = Integer.parseInt(request.getParameter("id"));
        
        // User 정보 조회
        result_phj_user user = userService.getUserById(userId);
        
        // 조회된 User 객체를 request 객체에 추가
        request.setAttribute("user", user);

        // userDetail.jsp로 포워드
        request.getRequestDispatcher("/result_phj_view.jsp").forward(request, response);
    }
}

