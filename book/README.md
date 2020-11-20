# Spring-boot thymeleaf view\

* HTML, CSS, JS가 적용된 Static web, HTML 파일에 Controller로 부터 전달되어 온 데이터를
기본모양을 흐트리지않는 범위에서 자유롭게 표현하는 view

* JSP와 비교했을때 JSP는 서버를 거쳐서 Rendering이 되지 않으면 어떻게 확면이 구성되는지
그결과를 알기가 어렵다

* 표준 web browser에서 

# data-jpa 프로젝트
* spring jpa 프로젝트에서 spring.datasource.initalize-mode 를 always로 설정한 후
src/main/resources 폴더에 data.sql 파일을 생성한 후 insert SQL을 저장해 두면 
프로젝트가 재 시작될때 data.sql 파일의 SQL문을 읽어서 데이터를 자동으로 추가한다
샘플 데이터가 필요할때 사용하면 좋다.
* 또한
src/main/resources 폴더에 schema.sql 파일을 생성한 후 DDL SQL을 저장해두면
프로젝트가 재 시작될떄 SQL문을 실행할수 있다.
