package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import io.ebean.bean.EntityBean;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Transient
    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    @Id
    @Column
    private long emp_id;
    @Constraints.Required
    @Column
    private String name;

    public Employee() {

    }

    public Employee(String name) {
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


    static public List<Employee> findAll() {
        return Employee.find.all();
    }
}
