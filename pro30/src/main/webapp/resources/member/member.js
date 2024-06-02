function isEmpty() {             //아이디, 패스워드 입력 확인 메서드
	if(document.loginForm.id.value == "" && document.loginForm.pwd.value != "") {    //아이디를 입력하지 않은 경우              
		alert("아이디를 입력해주세요.");
		document.loginForm.id.focus();
	} else if (document.loginForm.pwd.value == "" && document.loginForm.id.value != ""){     //비밀번호를 입력하지 않은 경우   
		alert("비밀번호를 입력해주세요.");
		document.loginForm.pwd.focus(); 
	} else if (document.loginForm.id.value == "" && document.loginForm.pwd.value == ""){            //아이디와 비밀번호 모두 입력하지 않은 경우      
		alert("아이디와 비밀번호를 입력하지 않으셨습니다."); 
		document.loginForm.id.focus();
	} else {   
		document.loginForm.submit();
	}
}

function go_next() {
	//alert("join");
	
	//1. 동의함을 체크했을 시 join_form 으로 전달합니다.
	if(document.formJoin.okon1[0].checked == true){
		document.formJoin.submit();
	}
	//2. 동의 안함을 체크했을 시 "약관에 동의하셔야만 합니다." 알림창만 띄웁니다.
	else{
		alert("약관에 동의하셔야만 합니다.");
	}
}

function go_save() {
	//alert("join");
	
	var formJoin = document.formJoin;
	
	if(formJoin.id.value == "") {           //1. 아이디 입력하지 않았을 경우
		alert("아이디를 입력하여 주세요.");
		formJoin.id.focus();
	} else if(formJoin.pwd.value == "") {   //2. 비밀번호를 입력하지 않았을 경우
		alert("비밀번호를 입력해 주세요.");
		formJoin.pwd.focus();
	} else if(formJoin.pwdCheck.value == "") {   //3. 비밀번호를 다시 한번 입력하지 않았을 경우
		alert("비밀번호를 다시 한번 입력해주세요.");
		formJoin.pwdCheck.focus();
	} else if(formJoin.pwd.value != formJoin.pwdCheck.value) {   //4. 비밀번호가 일치하지 않았을 경우
		alert("비밀번호가 일치하지 않습니다.");
		formJoin.pwd.focus();
	} else if(formJoin.name.value == "") {      //5. 이름을 입력하지 않았을 경우
		alert("이름을 입력해 주세요.");
		formJoin.name.focus();
	} else if(formJoin.email.value == "") {   //6. 이메일을 입력하지 않았을 경우
		alert("이메일을 입력해 주세요.");	
		formJoin.email.focus();
	} else {
		formJoin.submit();
	}
}

function post_zip() {
	var formJoin = document.formJoin;

	new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                
                } 

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
               formJoin.zipNum.value = data.zonecode;
               formJoin.address.value = addr;
                // 커서를 상세주소 필드로 이동한다.
               formJoin.detailAddress.focus();
                
            }
        }).open();
}