--Activity 7 


select sum(purchase_amount) as total
from orders;

select avg(purchase_amount) as average
from orders;

select max(purchase_amount) as max_amt
from orders;

select min(purchase_amount) as min_amt
from orders;

select count(distinct salesman_id) countofsalesman
from orders;