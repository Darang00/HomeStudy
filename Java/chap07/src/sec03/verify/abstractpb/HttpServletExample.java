package sec03.verify.abstractpb;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet()); // Sign-in
		method(new FileDownloadServlet()); //Down-loading a file
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
