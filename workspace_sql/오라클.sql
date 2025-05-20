SELECT * FROM emp;

SELECT * FROM dept;

SELECT * FROM  salgrade;

SELECT empno, ename,  deptno FROM  emp;

SELECT ename, sal FROM emp;

SELECT sal, ename, 123,  'a' FROM emp;

SELECT deptno FROM emp;

SELECT DISTINCT deptno FROM emp;

SELECT DISTINCT job, deptno FROM emp;

SELECT DISTINCT job, deptno FROM emp;

SELECT * FROM emp, dept;

SELECT ename,
    sal,
    sal * 12 + comm AS s1,                    -- sql 에서 유일하게 "가 들어가는곳 별칭지정
    sal * 12 + comm "a   's",
    comm            상여금
FROM
    emp;

SELECT *
FROM emp;

SELECT sal   AS 월급,
       sal * 10 연봉
FROM  emp;

-- sal 컬럼을 기준으로 오름차순-작은것부터 큰 것 순서   asc는 생략가능
SELECT * FROM emp ORDER BY sal;

-- sal 컬럼을 기준으로 내림차순 큰순서 (desc)
--디센딩(Descending) : 내려가는, 강하하는, 하향의, 내림차순
SELECT * FROM emp ORDER BY sal DESC;


--가장 먼저 입사한 순서로 출력
SELECT * FROM emp ORDER BY hiredate;

SELECT * FROM emp ORDER BY ename DESC;

SELECT * FROM emp
ORDER BY sal DESC;

--부서번호로 오름차순 겹치면 sal 내림차순
SELECT *
FROM
    emp
ORDER BY
    deptno ASC,
    sal ASC,
    empno DESC;

SELECT *
FROM
    emp
ORDER BY
    deptno ASC,
    job DESC;
--겹치는 항목 정리 distinct
SELECT DISTINCT
    deptno
FROM
    emp;
--조건에 만족하는 데이터만 출력하는것 where @@=@;
SELECT *
FROM
    emp
WHERE
    deptno = 30;

SELECT *
FROM
    emp
WHERE
    deptno = 30
AND job = 'salesman';

SELECT *
FROM
    emp
WHERE
    sal = 1600;

--초과
SELECT *
FROM
    emp
WHERE  sal > 1600;

--이상
SELECT *
FROM
    emp
WHERE
    sal >= 1600;

--부정           != , <>
SELECT *
FROM
    emp
WHERE
    deptno != 30;

SELECT *
FROM
    emp
WHERE
    deptno <> 30;

SELECT *
FROM
    emp
WHERE
    deptno = 30
AND job = 'SALESMAN';

--OR
/*
emp 테이블에서 부서번호가 deptno가 30 이거나 job이 clerk인 사원의
모든정보를 출력하라

*/
SELECT *
FROM
    emp
WHERE
    deptno = 30
OR job = 'CLERK';
--and or 같이있는경우 and가 먼저 적용한다.

/*
 jop이 clerk이고 sal이 2000초과이거나 deptno가 10인사원
*/
SELECT *
FROM
    emp
WHERE
( job = 'CLERK'
OR sal > 1000 )
AND deptno = 10;

select *from emp
where job = 'CLERK' or ( sal > 1000) and deptno = 10 );

select *from emp
select * from emp where deptno <>30;

/*
   deptno  !=30, deptno <> 30. deptno ^=30, not deptno=30
*/

--월급 2000이상 4000미만인 사원을 출력하시오

select *from emp
where sal >= 2000 and sal < 4000;

select * from emp
where deptno =10 or deptno =20;
-- 한번에 포함
select * from emp
where deptno in (10,20);
-- not 붙여서 포함안된것들
select * from emp
where deptno not in (10,20);

select * from emp
where sal 1000;

select * from emp
where sal >800 and sal <3000;

select * from emp
where sal =1600;
--퀴즈
--1 부서번호가 10번인 사람들을 출력
select * from emp where deptno=10;
select * from emp where deptno=10;
--2  부서번호가 10번이 아닌 사람들을 출력
select * from emp where deptno<>10;
select * from emp where deptno!=10;
select * from emp where not (deptno=10);
--3  급여가 3000이상인 사람들을 출력
select * from emp where sal >=3000;
select * from emp where sal >=3000;
--4  급여가 1500~3000 사이 인 사람을 출력
select * from emp where sal >=1500 and sal <=3000;
select * from emp where sal >=1500 and sal <=3000;
--5  부서번호 10번인 사람중 급여 2000 이상인 사람을 출력
select * from emp where deptno=10 and sal >=2000;
select * from emp where deptno=10 and sal >=2000;
--6 부서번호가 30번중 1500~3000사이인사람을 출력
select * from emp where deptno=30 and sal >1500 and sal <3000;
select * from emp where deptno=30 and (sal >1500 and sal <3000);
--7  부서번호가 30번중 1500~3000 사이인 사람을 연봉이 작은순으로 출력 연봉이같은경우 이름이빠른순으로
select * from emp where deptno=30 and sal >1500 and sal <3000 
order by sal asc ename asc;

select * from emp where deptno=30 and (sal >1500 and sal <3000)
order by sal asc, ename asc;
--8  부서번호가 20,30번중 1500~3000사이인 사람을 연봉이작은순으로 출력 연봉이같은경우 이름이 빠른순으로 출력
select * from emp where deptno in(20,30) and sal >1500 and sal <3000 
order by sal asc ename asc;

select * from emp where deptno in(20,30) and ( sal >1500 and sal <3000 )
order by sal asc, ename;

select * from emp where deptno =20 or deptno=30and (sal >1500 and sal <3000)
order by sal asc, ename;
--9  부서번호가 20또는 30이고 급여가 1500이상인 직원의 이름과 급여를 급여 오름차순으로 출력하라
select * from emp where deptno in(20,30) and sal >=1500
order by sal asc;

select * from emp where deptno in (20,30)and sal >= 1500
order by sal asc;

--between 여기서 and 는 betwenn 이랑 세트
select * from emp
where sal between 2000 and 3000;
-- and deptno = 20; 여기서 쓰는 and 랑 글씨는 같지만 같은and 아님

select * from emp
where sal between 2000 and 3000
and sal !=2000
and sal !=3000;
select * from emp
where sal  between 2000 and 3000;

-- like 검색할때 사용 % 모든문자를뜻함 
--like   % 없어도 나오긴나옴  _ 무조건 한자리 앞에는 a여야하고 3번째가 s여야할때 a_b
select * from emp where  ename like 'S%';

select * from emp where ename like '____E%';

select * from emp where ename like '%AM%';

select * from emp where ename not like '%A%';

select * from emp where ename like
'%A%' or ename like '%a%';

select comm from emp;

select * from emp
where comm >400;
-- null = 검색안댐 겹침  null은 값이없는 상태를 뜻함 연산이 안되서 빠진다
select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where mgr is  not null;

select * from emp where deptno =10;
select * from emp where deptno =20;

-- union 특징은 중복대는걸 제거하고 출력해줌
-- 앞에있는 조회 쿼리(SQL)결과와 뒤에있는 조회 쿼리 결과를 위 아래로 합쳐 줌 다음줄에나오게함
-- 중복되는 줄은 한번만 나온다 = distinct  union 보다 all을 많이씀
select empno from emp
union all
select sal from emp;
 where deptno =10
union
select * from emp where deptno =10;

select * from emp where deptno =10
union all
select * from emp where deptno =10;

-- union all union과 같은데 중복되는줄도 무조건 모두 표시한다
-- 둘다 조회하는 컬럼 수 컬럼의 타입이 같아야 실행된다.

-- 부서 10번 사원번호 내림차순으로 정렬하여 출력
select * from emp where deptno=10
order by empno DESC
union all
--부서 20번을 사원번호 오름차순으로 정렬하여 출력
select *from emp where deptno=20
order by empno asc;



select empno from emp
union all
select ename from emp;

--where deptno =7+3
-- =기준으로 오른쪽 우선

--Q5
-- 사원 이름에 E가 포함된 30번 부서의 사원 중 급여가 1000~2000 사이가 아닌 사원이름
-- 사원 번호 급여 부서번호를 출력하는 SQl 구문을 작성해보세요
select ename,empno,sal,deptno
from emp where ename like '%L%' and deptno=30
and not(sal >=1000 and sal <=2000);


select ename,empno,sal,deptno
from emp where ename like '%E%' and deptno=30
and not(sal >=1000 and sal <=2000);
--이름,번호,급여,부서를출력하기
-- 이름에 E포함, 부서는 30, 급여 1000~2000까지가 아닌
select ename,empno,sal,deptno
from emp where
ename like '%E%'
and deptno = 30
and not (sal >= 1000 and 2000<=);
--Q2
--EMP 테이블을 사용하여 30번 부서 에서 근무하는 사원중에 직책이 @@인 사원의 사원번호
--이름 직책 급여 부서번호를 출력하는 SQL구문을 작성해보세요
select empno,ename,job,sal,deptno
from emp where deptno=30 and job ='SALESMAN';

select empno,ename,job,sal,deptno
from emp where deptno=30 and job ='SALESMAN';

select empno,ename,job,sal,deptno
from emp where deptno=30 and job='SALESMAN';
--Q6
--추가수당이없고 상급자가 있고 직책이 MANAGER,CLERK인 사원중에서
--사원 이름의 두번쨰 글자가 L이 아닌사원의 정보를 출력하는 SQL을 작성해보세여 
select * from emp
where comm is null and (job='MANAGER' or job='CLERK') and
ename not like '_L%';
select * from emp
where comm is null and (job='MANAGER' or job='CLERK') and
ename not like '_L%';
--추가수당 null mar null이 아니고 직책은 m,c 이름에 두번째글씨가 L이 아닌 사원정보
select * from emp
where
comm is null
and mgr is not null
and job in('MANAGER','CLERK')
and ename not like '_L%';


select *from emp
where
comm is null
and mgr is not null
and job in('MANAGER','CLERK')
and ename not like '_L%';

--upper, lower
select ename, upper(job), lower(job) from emp;

select ename from emp
where lower(ename) like lower('%aM%');
--원하는 숫자를 뽑을때 dual
select upper('aaacvTEEEWrb'), lower('asFFrerxcc') from dual;
select upper('aVc'), lower ('aVBc'), upper(lower('accfV') ) from dual;


select ename, length(ename) from emp;
select ename, length(ename)  from emp;
--@글자인애들만 뽑고싶을떄
select * from emp
where length(ename)>=4;

--bit : 1또는0
--1byte : 8bit
--1kbyte : 1024 byte
--1mbyte : 1024 kbyte 
--10진수 : 2진수
-- 0 0   1 1    2 10   3 11  4 100  5  101  6  110  7  111 8 1000

select lengthb('한'), lengthb('a') from dual;

desc emp; 

select job, substr(job,1,2),substr(job,3,2),substr(job,5)
from emp;

-- 사원 이름을 두번째부터 3글자만 출력
select job, substr(job,-3,2) from emp;

-- 이름 뒤에서 부터 3글자만 출력
select ename, substr(ename,-3) from emp;

select '010-1234-5678' as replace_before,
replace('010-1234-5678','-','&') as replace_1,
replace('010-1234-5678','-') as replace_2
from dual;


select ename,  replace(ename,'LL','&')from emp;

--lpad 넘어가면 자르고 모자르면 채우고
select lpad(ename,10,'&') from emp;
select rpad(ename,10,'&') from emp;

--문제1
-- ename 앞에 두글자만 출력
select substr(ename,1,2) as from emp;

select ename, substr(ename,1,2) , rpad(ename,2) from emp;

--문제2
--앞에 두글자만 원본을 출력하고 나머지는 4개의*로 표시
select ename, rpad  (substr (ename,1,2),6,'*') from emp;
select ename, rpad  (substr (ename,1,2),6,'*') from emp; 

select rpad( substr (ename , 1 , 2 ),6,'*') from emp;

--문제3
--사원 이름 두글자만 보이고 나머지는 *로 단 원래 이름길이 만큼 표시
select rpad( substr (ename , 1 , 2 ,length ename)'*') from emp;


--lpadm rpad
--lpad(대상 문자열, 전체자리수, 채울 문자열)
-- 전체 자리수가 대상 문자열의 길이보다 큰 경우 나머지를 채울 문자열로 채워준다
-- lpad는 왼쪽 rpad는 오른쪽
-- 전체 자리수보다 대상 문자열이 긴 경우 잘라낸다 즉, 두번째 값 길이만 출력된다

--글씨 합칠때 || dual;
select 'ab' ||  'cd' || 'ef' from dual;
select empno || ' : ' ||  ename from emp;
select 'e' || 'n' || 'a' || 'm' || 'e' from dual;

-- 맨앞 맨뒤 공백제거 trim 글씨 사이에 공백은 지워지지않음
select '  ab c f    ', trim('  ab c f    ') from dual;

--15/5=3(0)
--17/5=3(2)

-- ename 의 A를 '-' 로 모두 교체
select ename, replace(ename, 'A', '-') from emp;

--각 사원의 연봉을 출력
-- 월급 *12+comm ename,total_pay 로 출력

select sal,comm, ename, sal*12 +nvl(comm,0) as total_pay from emp;

select empno,ename,job,sal,
decode(job,
'MANAGER', sal*1.1,
'SALESMAN',sal*1.05,
'ANALYST', sal,
sal*1.03) as upsal from emp;


-- when 에서 then 은 중간에 , 사용안함
select empno,ename,job,sal,
case job
when 'MANAGER' then sal*1.1
when 'SALESMAN' then sal*1.05
when 'ANALYSJ' then sal
else sal*1.03
end as upsal
from emp;

--nvl 사용하지 않고 decode, case로 nnvl이랑 동일한 결과 출력하기
select 
nvl(comm,-1),
decode(comm,
null,-1,
comm) as decode,
case comm
when  null then -1
else comm
end as case
from emp;
--when comm is null then '해당없음'
-- 조건이 같으면 먼저 출력된게 우선 
select empno,ename,comm,
case
when comm is null then '해당없음'
when comm = 0 then '0원'
when comm >0 then '수당 : ' || comm
end as case 
from emp;

--Q1
--다음과 같은 결과가 나오도록 sql구문을 작성해보세요.
--empno열에는 emp 테이블에서 사원이름이 다섯글자이상이며 여섯글자 미만인 사원정보를 출력합니다.
--masking_ename 열에는 사원 이름의 첫글자만 보여주고 나머지 글자수만큼*기호로 출력하세요.
select empno,substr(empno,1,2) ||'**'as masking_empno,
ename, rpad (substr(ename,1,1), length(ename)-1,'*') as masking_ename
from emp
where length(ename) >=5
and length(ename)<6;

select empno, ename,
substr(ename,1,1) || rpad('*',length(ename)-1,'*') as masking_neame
from emp
where length(ename) >=5 
and length(ename) <6;


--Q2
-- emp테이블에서 사원의 월 평균 근무일 수는 21.5일입니다. 하루근무 시간을 8시간으로
--보았을때 사원의 하루급여 와 시급을 계산하여 결과를 출력하시오 단
-- 하루 급여는 소수점 셋째 자리에서 버리고, 시급은 소수둘째 자리에서  반올림하세요.

select empno,ename,sal,
trunc(sal/21.5,2)  day_pay,
round(sal/(21.5*8),1)as time_pay
from emp;

--Q4 EMp 테이블의 모든 사원을 대상으로 직속상관의 사원번호를 다음과같은조건으로변환해서 chg_mgr열에 출력하세요
-- 조건1 직속상관의 사원번호가 없을떄:0000
-- 조건2 직속상관의 사원번호 앞 두 자리가 75일때:5555
-- 조건3 직속상관의 사원번호 앞 두 자리가 76일때:6666
-- 조건4 직속상관의 사원번호 앞 두 자리가 77일때:7777
-- 조건5 직속상관의 사원번호 앞 두 자리가 78일때:8888
-- 그외 직속상관 사원 번호일때: 본래직속상관의 사원번호 그대로 출력

select empno,ename,mgr,
case
when mgr is null then'0000'
when substr( mgr, 1,2) =75 then'5555'
when substr( mgr, 1,2) =76 then'6666'
when substr( mgr, 1,2) =77 then'7777'
when substr( mgr, 1,2) =78 then'8888'
else to_char(mgr)
end
from emp;

select empno,ename,mgr,
case
when mgr is null then'0000'
when substr(to_char(mgr),1,2)='75' then'5555'
when substr(to_char(mgr),1,2)='76' then'6666'
when substr(to_char(mgr),1,2)='77' then'7777'
when substr(to_char(mgr),1,2)='78' then'8888'
else to_char(mgr)
end as mgr
from emp;

select empno,ename,mgr,
case
when mgr is null 
then'0000'

when mgr is not null
then
case substr(mgr,1,2)
when '75' then '5555'
when '76' then '6666'
when '77' then '7777'
when '78' then '8888'
else to_char(mgr)
end
end
from emp;

select
case
when mgr is null
then '0000'
when substr(mgr,2,1)in ('5','6','7','8')
then lpad (substr(mgr,2,1),4,substr(mgr,2,1) )
else '' ||mgr
end

lpad
(substr(mgr,2,1),4,substr(mgr,2,1) )
from emp;
--병합이안됌 여러줄이랑 한줄은 같이 조회가안됀다
select sum(sal)
from emp;

select median(sal)
from emp;

select sum(comm) from emp;

select count(*), sum(sal) from emp;

--count는 null 제외한 숫자
select count(sal),count(comm) from emp;

select max(sal), min(sal), min(hiredate), min(comm) from emp;
-- 이름에 A가 포함된 사람숫자
select count(*) from emp
where ename like '%A%';

select avg(sal)from emp;
--xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
--다중행 함수(집계함수)는 where 에서 사용할 숭 없다 length는 가능
select *
from emp
where sal >avg (sal);
--xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

select avg(distinct sal)
from emp
where deptno =30;

select avg(sal), deptno
from emp
group by deptno;

select deptno
from emp
group by deptno;
--그룹을 나눌때 =통계를 나눌떄
select deptno, sum(sal),count(*)
from emp
group by deptno;

select job 
from emp
group by job;

select deptno,job, count(*) ,
from emp
group by deptno, job;

select deptno,job, count(*) ,ename
from emp
group by deptno, job,ename;
--select 뒤에 * 표시는 모든걸 표시하기때문에 사용할수없다
select job  
from emp
where deptno=10
group by job
order by job desc;

--where은 group by 없어도 사용가능 having는 있어야 사용가능
select job,deptno, avg(sal)
from emp
group by deptno,job;

select job,deptno, avg(sal)
from emp
group by deptno,job
having avg(sal) >2000;
-- having은 무조건 group by 다음에 나옴

--실행되는 순서
-- 1순위 from= 어디에서 
-- 2순위 where= 어디에서 후 걸러냄
-- 3순위 group by 걸러진애들을 그룹으로 나눔
-- 4순위 having
-- 5순위 select = 출력
-- 6순위 order by
select job , count(*) as cnt
from emp
where sal >1000-- and cnt >3;  and count(*) >=3 where 에는 count 사용x
group by job
having count(*) >=3
order by cnt desc;

select job, deptno,avg(sal)
from emp
group by deptno, job;

select * from dept;

-- 오라클은 프로그램 SQL은 명령어
-- select 는 어디서든 가능하고 avl은 특정
------------*****join********----------
select * from  emp,  dept
order by empno;

-- 같은것만 출력할때 where emp.@ = dept.@
--count 써도 가능
select * from emp,dept
where emp.deptno=dept.deptno
order by empno;

select * from emp e, dept d
where e.deptno=d.deptno
order by empno;

--ambiguously햇갈리다 ? java에서도 나옴
--*있을땐 전부뽑는데 *없을땐 emp걸 사용할지 dept를 사용할지 정해줘야함
select ename,deptno
from emp e, dept d
where e.deptno=d.deptno; 

select ename,e.deptno  --e.
from emp e, dept d
where e.deptno=d.deptno; 

select * from salgrade;

select * from emp e,salgrade s
where e.sal between s.losal and s.hisal;
--
select grade, e.*,s.* from emp e, salgrade s
where e. sal >=s.losal and e.sal <= s.hisal;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename 
from emp e1, emp e2
where e1.mgr = e2.empno;

select count(*) 
from emp e1, emp e2
where e1.mgr = e2.empno;

select e1.empno,e1.ename,e1.mgr,
e2.empno as mgr_empno,
e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr=e2.empno(+)
order by e1.empno;


select e1.empno,e1.ename,e1.mgr,
e2.empno as mgr_empno,
e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr(+)=e2.empno
order by e1.empno;

select e.empno, e.ename, e.job,
deptno, d.dname, d.loc
from emp e join dept d using(deptno)
where sal >= 3000
order by deptno, e.empno;

select empno, ename, e.deptno
from emp e join dept d on(e.deptno=d.deptno)
where sal >= 3000;


select e1.empno,e1.ename,e1.mgr,
       e2. empno as mgr_empno,
       e2. ename as mgr_ename
from emp e1 left outer join emp e2 on(e1.mgr=e2.empno)
order by e1.empno;01:;

select empno, ename, e.deptno
from emp e left outer join emp e2 on(e1.mgr=e2.empno);
--left outer join


--되새김문제 226
-- Q1 급여가 2000을 초과한 사원의 부서정보 사원정보를 출력하시오
select e.empno,e.ename,e.sal,d.deptno,d.dname
from emp e, dept d
where e.deptno=d.deptno
and sal>2000;
--Q1풀이     --내림차순 desc
select e.deptno, d.dname, e.empno,e.ename,e.sal 
from emp e, dept d
where e.deptno=d.deptno
and sal > 2000
order by deptno,dname desc;


--Q2부서별 평균급여 최대급여 최소급여 사원수를 출력해보세요
select e.deptno,d.dname,
trunc( avg(e.sal)) as  avg_sal, 
max(e.sal) as  max_sal,
min (e.sal) as  min_sal,
count(d.deptno) as emp_count
from emp e, dept d
where e.deptno = d.deptno
group by e.deptno, d.dname;

--Q2풀이
select deptno, floor (avg(sal) ), max(sal),min(sal), count(*)
from emp e left outer join dept d using (deptno)
group by deptno
order by deptno;

--부서정보와 사원정보를 다음과가이 부서번호 사원이름숨으로 정렬하여 출력해보세요

select d.deptno, d.dname,e.empno,e.ename,e.job,e.sal
from dept d, emp e
where d.deptno= e.deptno
order by d.deptno, e. ename;

select d.deptno, d.dname, e.empno,e.ename,e.job,e.sal
from emp e right outer join dept d on (e.deptno=d.deptno)
order by deptno, ename;

--Q3 풀이
select d.deptno, dname,empno,ename,job,sal
from dept d left outer join emp e on d.deptno = e.deptno
order by d.deptno, e.ename;
--다음과같이 모든부서 정보 사원정보 급여 등급정보 각 사원의 직속상관정보를
--부서번호 사원번호 순서로 정렬하여 출력해보세요.
select
d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal, s.grade
from dept d
left join
   emp e on d.deptno = e.deptno
left join
   salgrade s on e.sal between s.losal and s.hisal
order by d.deptno;
-----------------------------------------------
-----------------------------------------------
select
d.deptno,d.dname,
e.empno,e.ename,e.mgr,e.sal,
s.grade
from
dept d
left join
emp e on d.deptno =e.deptno
left join
salgrade s on e.sal between s.losal and s.hisal
order by
d. deptno, e.empno;
-----------------------------------------------
-----------------------------------------------
select
d.deptno, d.dname,
e.empno,e.ename,e.mgr,e.sal,e.deptno as deptno_1,
s.losal, s.hisal, s.grade
from
dept d
left outer join emp e on d.deptno=e.deptno 
left outer join salgrade s on e.sal between s.losal and s.hisal
order by
d.deptno, e.empno;
-----------------------------------------------
-----------------------------------------------
select d.deptno, d.dname,
e.empno, e.ename, e.mgr, e.sal, e.hiredate,
s.grade as sal_grade,
m.empno as mgr_empno,
m.ename as mgr_ename
from emp e
join dept d on e.deptno= d.deptno
left join emp m on e.mgr = m.empno
left join salgrade s on e.sal between s.losal and s.hisal
order by d.deptno, e.empno;

--Q4 풀이

select d,deptno, d.dname, e.empno, e.ename, e.mgr 
       e, deptno deptno_1 s.losal, s.hisal, s.grade
from dept d
    left outer join emp e on (d.deptno = e.deptno)
    left outer join salgrade s on (e.sal >= s.losal 
    and e. sal <= s.hisal)
    left outer join emp e2 on (e.mgr=e2.empno)
order by d.deptnom e,empno;
 
 -- left outer join
 --왼쪽 테이블의 모든 값을 출력하는 것을 보장한다
 --on과 using을 다 사용할 수 있다
 --서브쿼리
 --SQL문 안에 select문이 들어가는 형태 
 --단일행 서브쿼리
 --결과가 select 결과가 값이 하나일때 (한칸이면서 한줄일떄)
 -- 마치 조회된 값 그 자체로 활용할수있는 방법
 --SELECT * FROM  emp WHERE  sal > (SELECT sal FROM emp  WHERE  ename = 'JONES')
--다중행 서브쿼리
--select 결과가 여러줄 일 때 (즉,한칸이지만 여러줄일때
--in에서 사용할수있다
----퀴즈------------
--전체 부서에서 부서별로 급여가 가장높은사원 가장낮은사원의 급여차이와 부서번호를 출력하시오

SELECT
    deptno              부서번호,
    MAX(sal)            최대급여,
    MIN(sal)            최소급여,
    MAX(sal) - MIN(sal) AS 급여차이
FROM
    emp
GROUP BY
    deptno;

SELECT
    deptno,
    MAX(sal),
    MIN(sal),
    MAX(sal) - MIN(sal) 급여차이
FROM
    emp
GROUP BY
    deptno;

--심화 job을 총 20자중 가운데정렬하세요
-- 가운데 정렬은 전체 길이의 반 - 글씨 길이의 반
--왼쪽 채우고 다음에 오른쪽 채우고

SELECT
    job,
    lpad(job,
         (length(job) / 2 + 20 / 2),
         '-'),
    rpad(
        lpad(job,
             (length(job) / 2 + 20 / 2),
             '-'),
        20,
        '-'
    )
FROM
    emp;

--subquery------------

SELECT
    *
FROM
    emp
WHERE
    sal > 2975;

SELECT
    *
FROM
    emp
WHERE
    sal > (
        SELECT
            sal
        FROM
            emp
        WHERE
            ename = 'JONES'
    );

-------------------------------------------------------------------------
SELECT
    *
FROM
    emp
WHERE
    hiredate < (
        SELECT
            hiredate
        FROM
            emp
        WHERE
            ename = 'SCOTT'
    );

SELECT
    *
FROM
    emp
WHERE
    sal > (
        SELECT
            AVG(sal)
        FROM
            emp
    );

SELECT
    MAX(sal)
FROM
    emp
GROUP BY
    deptno;

SELECT
    *
FROM
    emp
WHERE
    sal IN (
        SELECT
            MAX(sal)
        FROM
            emp
        GROUP BY
            deptno);

---------------------------any some 실무에서 거의 사용x----------------------

select * from emp;

select * from emp, dept where emp.deptno=dept.deptno;

-- from절에서의 서브쿼리
select *
from 
     (select * from emp where deptno=10) e10,
      dept d
where e10.deptno = d.deptno;

select job,count(*)
from emp
group by job
having count(*) >=3;

select *
from(
select job,count(*) cnt
from emp
group by job)
where cnt >=3;
----순서중 중간번호를 출력할때 rownum
select *
from(
select  rownum rn, emp.*
from emp
)
where rn = 3;

select *
from(
select  rownum rn, emp.*
from emp
)
where rn > 3 and rn <6;

--select 보다 order by가 빨라서
select rownum rn, emp.*
from emp
order by sal desc;

--- 출력된 값에서 원하는 순위의 표를 뽑아내려면 작성된표에서 select 로 한번더 감싸고 where를 사용한다

select * 
from(
        select rownum rn, e.*
        from(
        select  emp.*
        from emp
        order by sal desc
    ) e
)
where rn >= 2 and rn <=4; 

----------with 은 select 보다 우선--------

with e10 
    as (select * from emp where deptno = 10)
    select ename from e10;

select empno, ename, job, sal,
          (select grade
           from salgrade
           where e.sal between losal and hisal) as salgrade,
           deptno,
           (select dname
           from dept
           where e.deptno = dept.deptno) as dname
from emp e;

-------------되새김문제----------------
--Q1문제 전체사원중 allen과 같은 직책인 사원의 사원정보 부서정보를 다음과같이출력하시오
select e.job,e.empno,e.ename,sal,d.deptno,d.dname
from emp e
join dept d on e.deptno = d.deptno
where e.job = (
select job
from emp
where ename = 'ALLEN')
order by e.sal desc;

--Q2 전체사원의 평균급여보다 많이받는 사원의 사원정보 부서정보 급여 등급 정보를
--출력하는 sql 구문을 작성하세요 (단 출력할때 급여가 많은 순으로 정렬하되 같다면 사원번호 기준으로 오름차순으로 정렬하세요

-- 사원정보(사번,이름,입사일,근무지,급여등급정보) 출력할땐 급여가 많은순으로 하되 사번기준 오름차순
select empno,ename,dname,e.hiredate,loc,sal,grade
from emp e
join dept d on e.deptno= d.deptno
join salgrade s on e.sal between s.losal and s.hisal
where e.sal > (select avg(sal)
from emp
)
order by sal desc, empno asc;

--Q3 10번 부서에 근무하는 사원중 30번 부서에 없는 직책인 사원의 사원정보 부서정볼르 다음과같이
-- 출력하는 sql 구문을 작성하세요.

select e.empno,e.ename,e.job,d.deptno,d.dname,loc
from emp e
join dept d on e.deptno = d.deptno
where e.deptno = 10
and  e.job not in (
select job 
from emp
where deptno= 30);


--Q4 직책이 salesman인 사람의 최고급여보다 많이받는 사원의 사원정보 급여 등급정보를 오른쪽과
--같이 출력하는 sql 구문을 작성하세요
-- 단 서브쿼리를 활용할떄 다중행 함수를 사용하는 방법과 사용하지않는 2가지 방법으로 사원번호기준으로 오름차순으로 정렬하세요

select 
empno,ename,sal,grade
from emp e
join salgrade s on e.sal between s.losal and s.hisal
where e.sal > (
select max(sal)
from emp
where job = 'SALESMAN'
)
order by empno asc;












select empno,ename,sal,grade
from emp e
join salgrade s on e.sal between s.losal and s.hisal
where e. sal > (
select max(sal)
from emp
where job = 'SALESMAN'
)
order by e.empno asc;




























































