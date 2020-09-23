package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        
        if (age == null || age.equals("")) {
            String error = "You must give your current age.";
            request.setAttribute("error", error);
            request.getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        
        int i = Integer.parseInt(age) + 1;
        
        String display = "Your age next birthday will be " + i;
        request.setAttribute("display", display);
        request.getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
