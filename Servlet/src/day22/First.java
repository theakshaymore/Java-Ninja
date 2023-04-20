package day22;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		LocalDate currentTime = LocalDate.now();
//		Date currentDate = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 ranges: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		PrintWriter output = response.getWriter();
//		output.write("<html><head>Day22</head><body><p>Present date: " + currentDate + " and time: " + currentTime + "</p></body></html>");	
		output.write("<html><head>Day22</head><body><p>");
		if(start >= 1 || end <= 100 ){
			for(int i = start; i <= end; i++){
				if(isPrime(i)){
					output.write(i + " ");
				}
			}
		}else{
			output.write("Prime number doesn't exist");
		}
		output.write("</p></body></html>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public static boolean isPrime(int n){
		boolean isPrime = false;
		for(int i = 2; i< n; i++){
			if(n % i == 0){
				isPrime = false;
			}
			isPrime = true;
		}
		return isPrime;
	}
	
}
