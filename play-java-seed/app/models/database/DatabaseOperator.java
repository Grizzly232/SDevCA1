package models.database;

import io.ebean.Ebean;

import models.*;

import java.util.*;

public class DatabaseOperator {

    Random rand = new Random();
    public char[] randomData = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public void fillAll() { //fill all tables with random debug information

    }

    public void fillEmployee() {
        List<Employee> empList = null;
        empList.add(new Employee());
    }
    public void fillEmployee(int amount) {
        for(int i = 0; i < amount; i++) {
            Employee emp = new Employee(getWord(7));
            Ebean.save(emp);
        }
    }

    public void fillProject() {
        Project proj1 = new Project("Tinder For Dogs", "eDating", "Find lonely bitches near you. Bark, woof and waggle your way to a brighter, happier future.");
        Project proj2 = new Project("Deep AI", "Artificial Intelligence", "New machine learning algorithms promise a greater future for us all. You'll never notice a man-made apocalypse as long as your emojis are interactive.");
        Project proj3 = new Project("Popeville", "Gaming", "Grind your way to the top to become the next pompous pope there ever was. Climb up the catholic hierarchy by any means necessary. Nepotism, bribery, blackmail, indulgences, you name it! ");
        Project proj4 = new Project("The Day Light", "Gadget", "The Day Light, the world's first solar-powered flashlight. Simply face the solar panel towards the sun and you'll have all the energy you'll need to illuminate your surroundings. NOTE: Loses charge if not exposed to sun.");
        Project proj5 = new Project("Delicious Denarius", "Financial App", "One goal. Be the number 1 donator. Pay your way to the top to reap your glory.");

        Ebean.save(proj1);
        Ebean.save(proj2);
        Ebean.save(proj3);
        Ebean.save(proj4);
        Ebean.save(proj5);
    }

    //inserts random data into projects
    public void fillProject(int amount) {
        for(int i = 0; i < amount; i++) {
            Project proj = new Project(getWord(5), getWord(15), getSentence(20));
            Ebean.save(proj);
        }
    }

    public void deleteAll() {
        deleteProject();
    }

    public void deleteProject() {
        List<Project> projList = Project.findAll();
        Ebean.deleteAll(projList);
    }

    //randomizes letters. Used to generate data
    public char getLetter() {
        return randomData[rand.nextInt(26)];
    }

    public String getWord(int numChars) {
        String out = "";
        for(int i = 0; i < numChars; i++) {
            out = out.concat(String.valueOf(getLetter()));
        }
        return out;
    }

    public String getSentence(int numWords) {
        String out = "";
        for(int i = 0; i < numWords; i++) {
            out = out.concat(getWord(rand.nextInt(8)));
            out = out.concat(" ");
        }
        return out;
    }
}
