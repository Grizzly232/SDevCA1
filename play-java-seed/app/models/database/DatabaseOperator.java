package models.database;

import io.ebean.Ebean;
import io.ebean.Finder;

import org.h2.tools.Script;
import play.mvc.*;
import play.api.Environment;
import play.db.ebean.*;

import models.*;
import views.html.*;

import java.util.*;
import javax.inject.Inject;

public class DatabaseOperator {

    public char[] randomData = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public void fillAll() { //fill all tables with random debug information

    }

    public void fillEmployee(int amount) {
        for(int i = 0; i < amount; i++) {
            Employee emp = new Employee(getString(7));
            Ebean.save(emp);
        }
    }

    public void fillProject(int amount) {
        for(int i = 0; i < amount; i++) {
            Project proj = new Project(getString(5), "Artificial Intelligence", "Using neural" +
                    "networks and specialized backpropagation algorithms, our scientists have managed to create an AI");
            Ebean.save(proj);
        }
    }

    public char getLetter() {
        Random rand = new Random();
        return randomData[rand.nextInt(26)];
    }

    public String getString(int numChars) {
        String out = "";
        for(int i = 0; i < numChars; i++) {
            out = out.concat(String.valueOf(getLetter()));
        }
        return out;
    }
}
