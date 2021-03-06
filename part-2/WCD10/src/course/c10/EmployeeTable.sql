DROP TABLE EMPLOYEE;

CREATE TABLE EMPLOYEE (
   	ID BIGINT NOT NULL, 
   	FIRSTNAME VARCHAR(40) NOT NULL, 
	LASTNAME VARCHAR(40) NOT NULL,
	BIRTHDATE DATE,
	SALARY REAL
);

INSERT INTO EMPLOYEE VALUES (1, 'Tzeng', 'Jim', '1965-03-31', 50000.15);
INSERT INTO EMPLOYEE VALUES (2, 'Chung', 'Jobs', '1986-08-25', 92400.20);
INSERT INTO EMPLOYEE VALUES (3, 'Chen', 'Bill', '1961-09-22', 50200.45);
INSERT INTO EMPLOYEE VALUES (4, 'Chou', 'Jason', '1956-06-01', 40000.00);
INSERT INTO EMPLOYEE VALUES (5, 'Lai', 'David', '1969-12-22', 68400.22);
INSERT INTO EMPLOYEE VALUES (6, 'Sung', 'Bergeron', '1970-09-18', 40006.00);
