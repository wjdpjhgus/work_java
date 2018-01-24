#SQL은 비절차적 언어이다.

#1. 부서번호가 10번 부서직원의 사원번호, 이름, 월급을 출력
SELECT empno, ename, sal FROM emp WHERE deptno=10;

#2. 사원번호가 7369인 직원의 이름, 입사일, 부서 번호를 출력
SELECT ename, hiredate, deptno FROM emp WHERE empno = 7369;

#3. 이름이 ALLEN인 직원의 모든 정보를 출력
SELECT *FROM emp WHERE ename ='ALLEN';

4. 입사일이 81/12/03인 사원들의 이름, 부서번호, 월급, 입사일을 출력
SELECT ename, deptno, sal, hiredate FROM emp WHERE hiredate = '1981-12-03';

#5. 직무가 MANAGER가 아닌 직원의 모든 정보를 직무명으로 오름차순 정렬(ASC)하여 출력
SELECT *FROM emp WHERE job != 'MANAGER' ORDER BY job DESC;

#6. 입사일이 1981/12/31 이후에 입사한 사원의 정보를 최근 입사한 직원 순서대로 출력
SELECT * FROM emp WHERE hiredate >= '1980-12-31' ORDER BY hiredate DESC;

#7. 급여가 800이상인 직원의 이름 , 급여 , 부서번호를 급여가 작은 순서대로 출력
SELECT  ename, sal, deptno FROM emp WHERE sal >= 800 ORDER BY sal ASC;

#8. 부서번호가 20번 이상인 사원의 모든 정보를 부서번호가 작은 순서대로 출력
SELECT * FROM emp WHERE deptno >= 20 ORDER BY deptno ASC;

#9. 입사일이 1981-06-01 보다 먼저 입사한 직원들의 모든 정보를 출력
SELECT* FROM emp WHERE hiredate <= '1981-06-01' 

#10. 입사일이 81년 하반기에 입사한 사원의 이름, 월급, 입사일을 입사한 순서대로 출력
SELECT  ename, sal, hiredate FROM emp WHERE hiredate BETWEEN '1980-07-01' AND'1981-12-31' ORDER BY hiredate ASC;

#11. 급여가 1600보다 크고 3000보다 작은 직원의 이름, 직무, 급여를 출력
SELECT ename, job, sal FROM emp WHERE sal > 1600 AND sal < 3000;  

#12. 사원번호가 7654와 7782사이 이외의 사원의 모든 정보를 출력
#같이풀이
SELECT * FROM emp WHERE NOT(empno > 7654 AND empno <7782);

#13. 이름이 K로 시작하는 직원들보다 높은 이름을 가진 직원의 모든 정보를 출력
#단, K로 시작하는 직원의 이름도 제외시킨다.
#같이 풀이
SELECT *FROM emp WHERE ename >= 'L%';

#14. 이름이 B와 J사이의 모든 사원의 정보를 출력
#같이 풀이
SELECT *FROM emp WHERE ename >= 'B%' AND ename < 'K%'; #J%는 JONE의 경우 보다 크다.

#15. 입사일이 81년 이외에 입사한 직원의 모든 정보를 출력
#같이 풀이
SELECT * FROM emp WHERE NOT(hiredate > '1981-01-01' AND hiredate <'1981-12-31');
SELECT * FROM emp WHERE (hiredate < '1981-01-01' OR hiredate >'1981-12-31');

#16. 직무가 MANAGER와 SALESMAN인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE job ='MANAGER' OR job ='SALESMAN';

#17. 부서 번호와 20,30 번을 제외한 모든 직원의이름, 사원번호, 부서번호를 출력
SELECT ename, empno, deptno FROM emp WHERE(deptno!=20 AND deptno!=30);

#18. 이름이 S로 시작하는 사원의 사원번호, 이름, 입사일, 부서번호를 출력
SELECT empno, deptno, ename, hiredate FROM emp WHERE ename LIKE'S%';
SELECT empno, deptno, ename, hiredate FROM emp WHERE ename >='S%'AND ename <'T';
#19. 입사일이 82년도인 직원의 모든 정보를 출력
SELECT * FROM emp WHERE hiredate >= '1982-01-01' AND hiredate <='1982-12-31';
#20. 이름 중 대소문자 구분없이 S또는 s가 들어있는 직원의 모든 정보를 출력
SELECT * FROM emp WHERE ename LIKE '%S%' OR ename LIKE '%s%';
#같이 풀이

