# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  number                        varchar(255) not null,
  street                        varchar(255),
  city                          varchar(255),
  postcode                      varchar(255),
  state                         varchar(255),
  constraint pk_address primary key (number)
);

create table department (
  name                          varchar(255) not null,
  description                   varchar(255),
  constraint pk_department primary key (name)
);

create table employee (
  emp_id                        bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_employee primary key (emp_id)
);

create table project (
  project_name                  varchar(255) not null,
  category                      varchar(255),
  description                   varchar(255),
  constraint pk_project primary key (project_name)
);

create table project_employee (
  project_project_name          varchar(255) not null,
  employee_emp_id               bigint not null,
  constraint pk_project_employee primary key (project_project_name,employee_emp_id)
);

alter table project_employee add constraint fk_project_employee_project foreign key (project_project_name) references project (project_name) on delete restrict on update restrict;
create index ix_project_employee_project on project_employee (project_project_name);

alter table project_employee add constraint fk_project_employee_employee foreign key (employee_emp_id) references employee (emp_id) on delete restrict on update restrict;
create index ix_project_employee_employee on project_employee (employee_emp_id);


# --- !Downs

alter table project_employee drop constraint if exists fk_project_employee_project;
drop index if exists ix_project_employee_project;

alter table project_employee drop constraint if exists fk_project_employee_employee;
drop index if exists ix_project_employee_employee;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

drop table if exists project_employee;

