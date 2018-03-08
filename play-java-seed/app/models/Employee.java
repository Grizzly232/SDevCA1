package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Transient
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    @Id
    @Column
    private long emp_id;
    @Constraints.Required

    private String fName;
    private String lName;

    @OneToOne
    @JoinColumn(name = "address")
    public Address address;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "collaborators")
    public List<Project> projects;

    public Employee() {

    }

    public Employee(@Constraints.Required String fName) {
        this.fName = fName;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    static public List<Employee> findAll() {
        return Employee.find.all();
    }
}
