
public class PageObjects {
	//URLs
	public static final String BASE_URL = System.getProperty("movie-database-url");//"http://localhost";
	public static final String LOGIN_URL = BASE_URL + "/login";
	public static final String MOVIES_URL = BASE_URL + "/movie-app/movies";
	public static final String ACTORS_URL = BASE_URL + "/actor-app/actors";
	
	//LOGIN PAGE OBJECTS
	public static final String USERNAME_TEXTBOX_ID = "username";
	public static final String PASSWORD_TEXTBOX_ID = "password";
	
	//USER OBJECTS
	public static final String USERNAME_VALUE = "user";
	public static final String USERNAME_PASSWORD_VALUE = "user";
	
	//NEW MOVIE OBJECTS
	public static final String MOVIE_NAME = "Police Academy";
	public static final String MOVIE_DESC = "Nachdem die Ausbildung zum Polizisten auf der Polizeiakademie jedem Bürger offen steht, bewirbt sich ein Haufen undisziplinierter und total schräger Vögel, soll aber nach dem Willen eines intriganten Schleimers mit Pauken und Trompeten durchfallen. Trotz des Chaos, daß sie während des Unterrichts anrichten, vollbringen die Rekruten bei einem ersten Testeinsatz gute Leistungen...(Quelle: ofdb.de)";
	
}
