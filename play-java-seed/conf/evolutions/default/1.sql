# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  emp_id                        bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_employee primary key (emp_id)
);


# --- !Downs

drop table if exists employee;

