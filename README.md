# comento_hw03 & Hw04
#### 스프링부트 간단한 API 구현 - 20년도 로그인 수 API
- 스프링부트 개발환경 세팅
- 통계 API DB Table 생성
- 스프링부트, mybatis, mariaDB 연동

#### SW활용 현황 통계 API 구축을 위한 SQL - StatisticMapper에 작성
1) 월별 접속자 수
2) 일자별 접속자 수
3) 평균 하루 로그인 수
4) 휴일을 제외한 로그인 수
  - 구글 캘린더 API를 이용해서 한국의 공휴일 22,23,24년도 데이터를 json 형식으로 받아온 뒤, python의 mysql connector 라이브러리를 이용해 holiday 테이블에 삽입
  
    ![image](https://github.com/kikingki/comento_hw03/assets/63100425/90493cab-416e-4c3b-9503-d1dc7692d47e)

5) 부서별 월별 로그인 수

#### 통계 API 5개 구현
- 3차 과제에서 작성한 SQL을 기준으로 API 구현
- 3주차 과제 피드백
  - responseDTO를 사용하는 방법으로 변경
  - 접속자 수는 같은 사람이 여러번 로그인해도 1번으로 연산하므로, sql 쿼리문에 userID를 기준으로 중복을 제거하는 'DISTINCT userID' 사용

#### API가이드 문서 수정
- 완성된 API를 기반으로 2차 과제로 진행했던 API 가이드 문서를 보완하여 완성