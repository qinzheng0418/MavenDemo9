package web;



import domain.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ServletDemo",value ="/findAll")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("收到请求了");
            response.setContentType("text/html;charset=utf-8");
            //查询所有
            List<User> list=new UserService().findAllUser();
            if(list.size()>0&&list!=null){
                request.setAttribute("list", list);
                request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
            }else{
                response.getWriter().write("没有查到任何数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
