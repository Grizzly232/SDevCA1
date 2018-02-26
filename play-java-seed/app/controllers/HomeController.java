package controllers;

import io.ebean.Finder;

import play.mvc.*;
import play.api.Environment;
import play.db.ebean.Transactional;

import database.models.*;
import views.html.*;

import java.util.*;
import javax.inject.Inject;
import database.DatabaseJPA;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


	DatabaseJPA database = new DatabaseJPA();
	Random rand = new Random();
	List<Employee> empList = Employee.find.all();
	 
    public Result index() {
        return ok( index.render(empList.toString()));
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
