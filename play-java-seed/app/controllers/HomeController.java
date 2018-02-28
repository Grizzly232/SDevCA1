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

    public Result projects() {
        db.fillProject(2);
        List<Project> projList = Project.findAll();
		return ok(views.html.projects.render("wilkommen", projList));
	}
}
