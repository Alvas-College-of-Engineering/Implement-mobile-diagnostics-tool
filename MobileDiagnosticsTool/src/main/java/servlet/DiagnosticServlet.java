package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Device;

@WebServlet("/DiagnosticServlet")
public class DiagnosticServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String deviceName = request.getParameter("deviceName");

        int battery = Integer.parseInt(
                request.getParameter("battery"));

        int storage = Integer.parseInt(
                request.getParameter("storage"));

        String connectivity =
                request.getParameter("connectivity");

        Device device = new Device(deviceName,
                                   battery,
                                   storage,
                                   connectivity);

        String healthStatus;

        if (battery > 50 &&
            storage > 20 &&
            connectivity.equalsIgnoreCase("Connected")) {

            healthStatus = "Excellent";

        } else {

            healthStatus = "Needs Attention";
        }

        Cookie cookie = new Cookie("device",
                deviceName.replace(" ", "_"));
        response.addCookie(cookie);

        request.setAttribute("device", device);
        request.setAttribute("health", healthStatus);

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}