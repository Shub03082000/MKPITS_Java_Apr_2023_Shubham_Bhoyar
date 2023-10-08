USE sakila

-- 85.	List the rental date and rental duration for each rental made by customer "NICOLE PETERSON".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film 

SELECT rental_date, rental_duration FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
rental.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE first_name = "NICOLE" AND last_name = "PETERSON"
