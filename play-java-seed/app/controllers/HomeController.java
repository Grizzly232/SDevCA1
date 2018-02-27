package controllers;

import io.ebean.Ebean;
import io.ebean.Finder;

import org.h2.tools.Script;
import play.mvc.*;
import play.api.Environment;
import play.db.ebean.*;

import models.*;
import views.html.*;
import models.database.DatabaseJPA;

import java.util.*;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	Random rand = new Random();
    DatabaseJPA db = new DatabaseJPA();

	 
    public Result index() {
        db.fillEmployee(5);
        List<Employee> empList = Employee.findAll();
        return ok( index.render(empList.get(4).getName()));
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
