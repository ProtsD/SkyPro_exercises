/*Создайте таблицу city с колонками city_id и city_name.*/
CREATE TABLE city (city_id BIGSERIAL NOT NULL, city_name VARCHAR(60) NOT NULL);
ALTER TABLE city ADD PRIMARY KEY(city_id);

/*Заполните таблицу city и назначьте работникам соответствующие города.*/
INSERT INTO city (city_name)
VALUES ('Voronezh'),('Moscow'),('Omsk'),('Saint-Petersburg');
SELECT * FROM city;

/*Добавьте в таблицу employee колонку city_id.*/
ALTER TABLE employee ADD COLUMN city_id INT DEFAULT 1 NOT NULL;
/*Назначьте эту колонку внешним ключом. Свяжите таблицу employee с таблицей city.*/
ALTER TABLE employee ADD FOREIGN KEY (city_id) REFERENCES city(city_id);

UPDATE employee
SET city_id = 2 WHERE first_name ='Ivan3';
SELECT * FROM employee;
UPDATE employee
SET city_id = 3 WHERE first_name ='Ivan5';
SELECT * FROM employee;

/*Получите имена и фамилии сотрудников, а также города, в которых они проживают*/
SELECT first_name, last_name, city.city_name
FROM employee
JOIN city
ON employee.city_id = city.city_id;

/*Получите города, а также имена и фамилии сотрудников, которые в них проживают.
Если в городе никто из сотрудников не живет, то вместо имени должен стоять null*/
SELECT first_name, last_name, city.city_name
FROM employee
RIGHT JOIN city
ON employee.city_id = city.city_id;

/*Получите имена всех сотрудников и названия всех городов. Если в городе не живет
никто из сотрудников, то вместо имени должен стоять null. Аналогично, если города
для какого-то из сотрудников нет в списке, должен быть получен null.*/
SELECT first_name, last_name, city.city_name
FROM employee
FULL OUTER JOIN city
ON employee.city_id = city.city_id;

/*Получите таблицу, в которой каждому имени должен соответствовать каждый город.*/
SELECT first_name, city.city_name
FROM employee
CROSS JOIN city;

/*Получите имена городов, в которых никто не живет.*/
SELECT first_name, city.city_name
FROM employee
FULL OUTER JOIN city
ON employee.city_id = city.city_id
WHERE first_name IS NULL;

--DROP TABLE employee;