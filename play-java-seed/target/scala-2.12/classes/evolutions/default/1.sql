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
  next_deadline                 timestamp,
  description                   varchar(255),
  constraint pk_project primary key (project_name)
);


# --- !Downs

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

