# Write your MySQL query statement below

select   visits.customer_id ,count(visits.visit_id ) as count_no_trans 
from visits
where visits.visit_id not in (
    select Transactions.visit_id
    from Transactions
)
group by visits.customer_id ;