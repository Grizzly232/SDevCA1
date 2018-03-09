package controllers;

import io.ebean.Ebean;
import io.ebean.ExpressionList;
import io.ebean.SqlQuery;
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

    List<Project> projList;
	 
    public Result index() {
        db.fillEmployee(5);
        List<Employee> empList = Employee.findAll();
        return ok( index.render("hi"));
    }

    public Result projects() {
        //db.fillProject();
        //db.fillEmployee();
        projList = Project.findAll();

        db.log.debug("this is a fucken debug message");
		return ok(projects.render("wilkommen", projList));
	}

	public Result project(String name) {
        projList = Project.findAll();
        Project projToLoad = new Project();
        List<Employee> collaborators = projToLoad.getCollaborators();
        SqlQuery sql = Ebean.createSqlQuery("SELECT * FROM PROJECT_EMPLOYEE");

        for(Project p : projList) {
            if(p.getProjectName().equals(name))
                projToLoad = p;
        }

        Employee emp = Ebean.find(Employee.class, 3);
        db.log.debug("Employee: " + emp.getEmp_id());
        db.addToAssociation(projToLoad, emp);

        return ok(project.render(name, projToLoad, collaborators));
    }
}
