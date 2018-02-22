package controllers;

import play.mvc.*;
import java.util.Random;
import database.DatabaseJPA;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	 
	DatabaseJPA database = new DatabaseJPA();
	Random rand = new Random();
	 
    public Result index() {
        return ok(views.html.index.render(Integer.toString(rand.nextInt())));
    }

	public Result cart() {
		return ok(views.html.cart.render());
	}
	
	public Result store() {
		return ok(views.html.store.render());
	}
	
	public Result signup() {
		return ok(views.html.signup.render());
	}
}
