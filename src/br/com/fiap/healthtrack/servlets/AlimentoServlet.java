package br.com.fiap.healthtrack.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.dao.AlimentoDAO;
import br.com.fiap.healthtrack.entities.Alimento;

/**
 * Servlet implementation class AlimentoServlet
 */
@WebServlet("/alimento")
public class AlimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AlimentoDAO alimentoDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlimentoServlet() {
        super();

        alimentoDAO = new AlimentoDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ArrayList<Alimento> alimentos = alimentoDAO.getAll();
		request.setAttribute("alimentos", alimentos);
		request.getRequestDispatcher("alimento-crud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomeAlimento = request.getParameter("nomeAlimento");
		
		System.out.println(nomeAlimento);
		long vlKCal = Long.parseLong(request.getParameter("vlKCal"));
		long vlGord = Long.parseLong(request.getParameter("vlGord"));
		long vlCarb = Long.parseLong(request.getParameter("vlCarb"));
		long vlProt = Long.parseLong(request.getParameter("vlProt"));
		
		Alimento alimento = new Alimento(nomeAlimento, vlKCal, vlGord, vlCarb, vlProt);
		
		alimentoDAO.insert(alimento);
		
		doGet(request, response);
	}

}
