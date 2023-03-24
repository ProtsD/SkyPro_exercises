SELECT * FROM employee;

/*Доведите количество записей в таблице до 5*/
INSERT INTO employee (first_name,last_name, gender, age)
VALUES ('Ivan1', 'Ivanov1', 'male', 35),
('Ivan2', 'Ivanov2', 'male', 45),
('Ivan3', 'Ivanov3', 'male', 90),
('Ivan4', 'Ivanov4', 'female', 30),
('Ivan5', 'Ivanov5', 'male', 21);

/*Получите информацию об именах и фамилиях по всем сотрудникам. Колонки должны называться «Имя» и «Фамилия»*/
SELECT first_name AS Имя, last_name AS Фамилия
FROM employee;

/*Получите всю информацию о сотрудниках, которые младше 30 или старше 50 лет*/
SELECT * FROM employee
WHERE NOT age BETWEEN 30 AND 50;

/*Получите всю информацию о сотрудниках, которым от 30 до 50 лет*/
SELECT * FROM employee 
WHERE age BETWEEN 30 AND 50;

/*Выведите полный список сотрудников, которые отсортированы по фамилиям в обратном порядке*/
SELECT * FROM employee
ORDER BY last_name DESC;

/*Выведите сотрудников, имена которых длиннее 5 символов*/
SELECT * FROM employee
WHERE first_name LIKE '_____%';

/*Измените имена у двух сотрудников так, чтобы на 5 сотрудников было только 3 разных имени, 
то есть чтобы получились две пары тезок и один сотрудник с уникальным именем*/

UPDATE employee
SET first_name = 'Ivan1'
WHERE first_name IN('Ivan2');

UPDATE employee
SET first_name = 'Ivan5'
WHERE first_name ='Ivan4';

/*Посчитайте суммарный возраст для каждого имени. Выведите в двух столбцах «имя» и «суммарный возраст»*/
SELECT first_name AS Имя, SUM(age) AS Cуммарный_возраст
FROM employee
GROUP BY Имя;

SELECT * FROM employee;
/*Выведите имя и самый юный возраст, соответствующий имени.*/
SELECT first_name AS Имя, age AS Минимальный_возраст
FROM employee
WHERE age = (SELECT MIN(age) FROM employee);

/*Выведите имя и максимальный возраст только для неуникальных имен. Результат отсортируйте по возрасту в порядке возрастания.*/
SELECT first_name AS Имя, MAX(age) AS Максимальный_возраст_в_группе
FROM employee
GROUP BY first_name
HAVING COUNT(first_name)>1;

DELETE FROM employee;