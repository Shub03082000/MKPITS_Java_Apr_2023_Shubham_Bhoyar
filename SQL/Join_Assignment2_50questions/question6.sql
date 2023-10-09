USE sakila

-- 56.	Retrieve the film titles rented by the customer with customer_id 500.
SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental
SELECT * FROM customer

SELECT title FROM film JOIN inventory ON
film.film_id = inventory.film_id JOIN rental ON
inventory.inventory_id = rental.inventory_id JOIN customer ON
rental.customer_id = customer.customer_id WHERE customer.customer_id = 500