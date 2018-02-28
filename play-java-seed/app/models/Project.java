package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.validation.*;

@Entity
public class Project {

    @Transient
    public static final Finder<Long, Project> find = new Finder<>(Project.class);

    @Id
    private String projectName;
    //private Calendar nextDeadline;
    private String category;

    @Transient
    private ArrayList<Employee> collaborators;
    //private Image projectImage;   dunno how to implement images yet, have much to rearn
    private String description;

    public Project() {

    }

    public Project(String projectName, String category, String description) {
        this.projectName = projectName;
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

//    public Calendar getNextDeadline() {
//        return nextDeadline;
//    }
//
//    public void setNextDeadline(Calendar nextDeadline) {
//        this.nextDeadline = nextDeadline;
//    }

    public ArrayList<Employee> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(ArrayList<Employee> collaborators) {
        this.collaborators = collaborators;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<Project> findAll() {
        return Project.find.all();
    }
}
