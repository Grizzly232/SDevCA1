package database.models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "Employees")
public class Employee extends Model {

    @Transient
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    @Id
    long emp_id;
    @Constraints.Required
    String name;

    public Employee() {

    }

    public Employee(long emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Employee> findAll() {
        return Employee.find.all();
    }
}
