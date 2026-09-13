# Write your MySQL query statement below
select b.name from Employee a join Employee b
 on a.managerId  = b.id
 GROUP BY b.id, b.name
 having count(a.managerId ) >= 5 