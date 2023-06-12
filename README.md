# comento_hw03
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
