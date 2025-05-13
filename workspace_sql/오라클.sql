select * from emp;
select * from dept;
select * from salgrade;

select empno, ename, deptno
from emp;

select ename, sal from emp;

select
sal,
ename,
123,
'a'
from emp;

SELECT
deptno
from emp;

SELECT
distinct deptno
from emp;

SELECT
distinct job, deptno
from emp;

SELECT
distinct job, deptno
from emp;

select * from emp, dept;

select
ename, sal,
sal*12+comm as s1,                    -- sql 에서 유일하게 "가 들어가는곳 별칭지정
sal*12+comm "a             s",
comm 추가수당
from emp;
