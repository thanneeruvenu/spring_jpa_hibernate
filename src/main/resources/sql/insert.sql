-- insert department data
insert into department  values (123,'abc');
insert into department  values (124,'xyz');

-- insert employee data
insert into employee (firstName,department_id) values ('emp123',123);
insert into employee (firstName,department_id) values ('emp12',123);

insert into employee (firstName,department_id) values ('emp124',124);
insert into employee (firstName,department_id) values ('emp12',124);
