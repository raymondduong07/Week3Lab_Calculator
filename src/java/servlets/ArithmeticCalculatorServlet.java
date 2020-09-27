package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String answer = "---";

        request.setAttribute("answer", answer);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String answer = "---";

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || second == null || second.equals("")) {
            answer = "invalid";
            request.setAttribute("answer", answer);
        }

        String submit = request.getParameter("submit");
        
        try {
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            int finalAnswer = 0;

            switch (submit){
                case "+":
                    finalAnswer = a+b;
                    break;
                case "-":
                    finalAnswer = (a)-(b);
                    break;
                case "*":
                    finalAnswer = a*b;
                    break;
                case "%":
                    finalAnswer = a%b;
                    break;
            }
            request.setAttribute("answer", finalAnswer);
        } catch (NumberFormatException e) {
        }

        request.getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
