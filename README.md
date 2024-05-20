# Server Side release

## 2024-05-17
- CRUD 구현 테스트

## 2024-05-17
1. 오라클 연결 설정 확인하기
- pom.xml mybatis 관련 라이브러리 추가
- web.xml 컨텍스트 파라미터 값 action-mybatis.xml로 수정
- [WEB-Inf] spring/action-mybatis.xml 파일 추가
- [WEB-INF] config/jdbc/jdbc-properties 추가
- [src/main/resources] mybatis.mappers/member.xml 추가
- [src/main/resources] mybatis.model/modelConfig.xml 추가
2. index.jsp에서 css 및 image 적용하기
- webapp/resources/css, images 추가
- index.jsp, header.jsp 경로 수정

## 2024-05-20
1. [views] 수정
- header.jsp 경로 수정
- layout 수정
- member/loginForm.jsp, sub_image.html, sub_menu.html 추가
2. [src/main/resources] 수정
- tiles/tiles_member.xml 로그인 화면 정의 추가
3. [com.myspring.pro30.nonage.controller] 수정
- NonageController.java에 로그인 화면, contract, 로그아웃, 장바구니 화면, 마이페이지, 1:1 고객 게시판 RequestMapping 추가