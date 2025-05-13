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
sal*12+comm "a   's",
comm 상여금
from emp;

select * from emp;

select
sal as 월급, sal*10  연봉
from emp;

-- sal 컬럼을 기준으로 오름차순-작은것부터 큰 것 순서   asc는 생략가능
select * from emp      
order by sal;

-- sal 컬럼을 기준으로 내림차순 큰순서 (desc)
--디센딩(Descending) : 내려가는, 강하하는, 하향의, 내림차순
select * from emp
order by sal desc;


--가장 먼저 입사한 순서로 출력
select *from emp
order by hiredate;

select *from emp
order by ename desc;

select *from emp
order by sal desc;

--부서번호로 오름차순 겹치면 sal 내림차순
select *from emp
order by deptno asc, sal asc, empno desc;