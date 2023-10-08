USE sakila

-- 99.	Get the names of customers who have rented the film titled "Gang Terms".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film

SELECT first_name, last_name FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
inventory.inventory_id = rental.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE title = "Gang Terms"
