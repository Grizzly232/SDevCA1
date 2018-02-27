package controllers;

import play.mvc.*;

import models.*;
import views.html.*;
import models.database.DatabaseOperator;

import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	Random rand = new Random();
    DatabaseOperator db = new DatabaseOperator();

	 
    public Result index() {
        db.fillEmployee(5);
        List<Employee> empList = Employee.findAll();
        return ok( index.render(empList.get(5).getName()));
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
