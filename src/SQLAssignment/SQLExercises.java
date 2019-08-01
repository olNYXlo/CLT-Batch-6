package SQLAssignment;

/*
 * Q1) SELECT * FROM salesman
 * Q2) SELECT name, commission from salesman
 * Q3) SELECT name, city FROM salesman WHERE city = 'Paris'
 * Q4) SELECT salesman_id,name, city, commission FROM salesman WHERE commission BETWEEN 0.10 AND 0.12
 * Q5) SELECT * FROM salesman WHERE city = 'Paris' OR city = 'Rome'
 * Q6) SELECT * FROM salesman WHERE city = 'Paris' OR city = 'Rome' ?????
 * Q7) SELECT * FROM salesman WHERE city NOT IN ('Paris','Rome')
 * Q8) SELECT * FROM salesman WHERE commission BETWEEN 0.12 AND 0.14
 * Q9) SELECT * FROM salesman WHERE name LIKE 'A%' OR LIKE 'K%'
 * Q10) SELECT * FROM salesman WHERE name NOT LIKE 'A%' OR NOT LIKE 'L%'
 * Q11) SELECT * FROM salesman WHERE name LIKE 'N__I%'
 * Q12) SELECT salesman_id,name,city, CONCAT(commission,'%') from salesman
 * 
 * Q1) SELECT * from orders ORDER BY ord_no ASC
 * Q2) SELECT DISTINCT salesman_id from orders
 * Q3) SELECT ord_no, ord_date, purch_amt from orders WHERE salesman_id = 5001
 * Q4) SELECT * from orders WHERE ord_date NOT IN 2012-09-10 AND salesman_id <= 505
 * 		OR
 * 		SELECT * from orders WHERE purch_amt <= 1000
 * Q5) SELECT * from orders WHERE purch_amt < 500 AND customer_id BETWEEN 3002 AND 3004
 * Q6) SELECT * from orders WHERE ord_date = 2012-10-05 OR (customer_id > 3002 AND purch_amt < 1000)
 * Q7) 
 * Q8) SELECT * from orders WHERE purch_amt BETWEEN 500 AND 4000 AND purch_amt NOT IN (948.50,1983.43)
 * Q9) SELECT SUM (purch_amt) from orders
 * Q10) SELECT AVG(purch_amt) from orders
 * Q11) 
 * Q12) SELECT MAX(purch_amt) from order
 * Q13) SELECT MIN(purch_amt) from order
 * Q14) SELECT MAX(purch_amt),customer_id from SELECT DISTINCT customer_id from orders
 * Q15) SELECT purch_amt,customer_id,ord_date from SELECT DISTINCT customer_id from orders WHERE MAX(purch_amt)
 * Q16) 
 * Q17) 
 * Q18) 
 * Q19) 
 * Q20) 
 * Q21) 
 * Q22) 
 * Q23) 
 * Q24) 
 * Q25) 
 * Q26) 
 * Q27) 
 * Q28) 
 * Q29) 
 * Q30) 
 * Q31) 
 */



public class SQLExercises {

	public static void main(String[] args) {

	}
}
