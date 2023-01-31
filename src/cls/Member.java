package cls;

import java.util.Date;

//내가 원하는 타입을 만듬. 실행하는 클레스 아님!!
//아이디, 암호, 이메일, 나이, 연락처, 가입일자...(설계상에서 정해지는 항목)
public class Member {

	String userId = "";
	String userPw = "";
	String userEmail = "";
	int useAge = 0; // 01012345678 => 1012345678, 001=> 1
	String userPhone = "000-0000-0000";
	Date userDate = null; // 클레스형의 타입을 만들어 놓음

	@Override
	public String toString() { // 마우스 오른쪽 -> 소스 -> toString
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", useAge=" + useAge
				+ ", userPhone=" + userPhone + ", userDate=" + userDate + "]";
	}

	// 메소드, 함수
	// 1.Main4에서 사용할 수 있다. Public
	// 2.반환타입 문자로 반환해야 함.
	// 3.메소드명(Main4에서 전달할 값 )
	public String getUserId() {
		return userId;
	}

	// void는 반환되지 않는다.
	public void setUserId(String userId) {
		this.userId = userId; // 위에 정의된 변수에 넣겠다
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUseAge() {
		return useAge;
	}

	public void setUseAge(int useAge) {
		this.useAge = useAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	// setter <= 누군가에 의해서 값을 저장시키는 역할함.
	// getter <= 누군가에 의해서 값을 가지고 역할함.

}
