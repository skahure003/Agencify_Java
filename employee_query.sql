/*
* table name: employees
* columns: 
* id(integer)
* name(text)
* age(integer)
* salary(float)
* Write a SQL query that selects all employees whose age is
  above 30 and salary is above $50,000.
*/

SELECT * FROM employees WHERE age>30 AND salary>50000;