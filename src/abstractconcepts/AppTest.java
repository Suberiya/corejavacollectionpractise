package abstractconcepts;

public class AppTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(20);
		
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();
		
		System.out.println("-----------------");
		
		// top casting
		
		// child class object can be refered by parent abstract classs reference variaable
		
		Page pg = new LoginPage();
		
		pg.title();
		pg.footers();
		pg.url();
		pg.pageLoadingTime();

}
}