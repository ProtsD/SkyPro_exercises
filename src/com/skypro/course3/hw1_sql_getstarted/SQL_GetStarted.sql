CREATE DATABASE skypro;

CREATE TABLE employee (id BIGSERIAL NOT NULL PRIMARY KEY,
					  first_name VARCHAR(50) NOT NULL,
					  last_name VARCHAR(50) NOT NULL,
					  gender VARCHAR(6) NOT NULL,
					  age INT NOT NULL);

INSERT INTO employee (first_name,last_name, gender, age)
VALUES ('Ivan1', 'Ivanov1', 'male', 35), 
    	('Ivan2', 'Ivanov2', 'male', 36), 
		('Ivan3', 'Ivanov3', 'male', 37) ;

SELECT * FROM employee;

UPDATE employee SET (first_name,last_name, gender, age) = ('Ivan4', 'Ivanov4', 'male', 40) WHERE id = 6;

DELETE FROM employee where id = 4;

SELECT * FROM employee;