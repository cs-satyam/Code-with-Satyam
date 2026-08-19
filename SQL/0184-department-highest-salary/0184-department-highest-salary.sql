# Write your MySQL query statement below
select 
     d.name as Department ,
     e.name as Employee, 
     e.salary as Salary
from Department d
join Employee e 
    on d.id=e.departmentId 
    WHERE e.salary = (
    SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
);
