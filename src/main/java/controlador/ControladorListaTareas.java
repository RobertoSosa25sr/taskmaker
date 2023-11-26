package controlador;

import java.io.*;
import java.sql.Date;
import java.sql.Time;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import modelo.TareasEntity;

@WebServlet(name = "controladorListaTareas", value = "/lista-tareas")
public class ControladorListaTareas extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("vista/vistaListaTareas.jsp");
    }

    public void destroy() {
    }



}