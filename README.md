# Server Side release
- pro30을 참고해주세요.

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

## 2024-05-21
1. 패키지 리팩토링
- com.nonage.xxx로 모두 경로 수정
- servlet-context.xml의 component-scan 컨텍스트 base-package 수정
2. DB 연동
- [webapp/spring] action.mybatis.xml에 빈 등록
- [src/main/resources/mappers]에 쿼리문 등록 
[com.nonage.member] 생성
- service, dao, controller 구현
3. 로그인 버튼 클릭 시 DB 연결
- [webapp/views/member] loginForm.jsp action 경로 수정

## 2024-05-28

1. 로그인 실패 시 예외처리
- [com.nonage.member.controller] MemberControllerImpl 회원정보가 DB에 등록되어있는지 체크
- 아이디와 패스워드가 DB 정보와 불일치 할 경우 처리를 위한 login_fail.jsp를 추가 
- [src.main.resources.tiles] tiles_member.xml에 loginFail 추가
- [com.nonage.member.controller] MemberControllerImpl에서 ModelAndView로 리턴
- [src/main/webapp/WEB-INF/views/member] loginForm.jsp 아이디, 패스워드 입력 validation 체크를 위한 isEmpty() 함수를 onclick 이벤트로 호출 
- [src/main/webapp/resources/member] member.js 안에 isEmpty() 정의
2. 로그아웃 구현
- [com.nonage.member.controller] MemberControllerImpl에 logout 추가 
3. Contract 구현
- [src/main/webapp/WEB-INF/views/member] contract.jsp 추가
- [src.main.resources.tiles] tiles_member.xml에 contract 추가
- [com.nonage.member.controller] MemberControllerImpl contract 추가
- [src/main/webapp/WEB-INF/views/member] 약관 동의 여부를 체크하는 go_next() 함수 선언
- [src/main/webapp/resources/member] member.js에서 go_next() 구현
4. Join 구현
- [src/main/webapp/WEB-INF/views/member] join_form.jsp 추가
- [src.main.resources.tiles] tiles_member.xml에 join_form 추가
- [com.nonage.member.controller] MemberControllerImpl joinForm 추가
- [src/main/webapp/WEB-INF/views/member] join_form.jsp 회원가입 정보 입력란 예외처리를 위한 go_save() 호출
- [src/main/webapp/resources/member] member.js에서 회원가입 입력란 예외처리를 위한 go_save() 구현

## 2024-06-02
1. Join 구현 완료
- [src/main/resources/mybatis/mappers] member.xml 회원가입을 위한 insert 쿼리문 추가
- [com.nonage.service] MemberService 회원 가입 service 추가
- [com.nonage.dao] MemberDAO 회원 가입 dao 추가
- [com.nonage.controller] MemberController 회원 가입 controller 추가
- spring 한글깨짐 방지 web.xml filter 설정
2. 우편번호 API 적용 테스트
- [src/main/webapp/views/member] join_form.jsp 텍스트명 수정 및 placeholder 추가
- [src/main/webapp/resources/member] member.js post_zip() 함수 구현
