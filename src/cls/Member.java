package cls;

import java.util.Date;

//���� ���ϴ� Ÿ���� ����. �����ϴ� Ŭ���� �ƴ�!!
//���̵�, ��ȣ, �̸���, ����, ����ó, ��������...(����󿡼� �������� �׸�)
public class Member {
	
	String userId = "";
	String userPw = "";
	String userEmail = "";
	int useAge = 0; // 01012345678 => 1012345678, 001=> 1
	String userPhone = "000-0000-0000";
	Date userDate = null; // Ŭ�������� Ÿ���� ����� ����
	
	
	
	@Override
	public String toString() { //���콺 ������ -> �ҽ� -> toString
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", useAge=" + useAge
				+ ", userPhone=" + userPhone + ", userDate=" + userDate + "]";
	}

	// �޼ҵ�, �Լ�
	// 1.Main4���� ����� �� �ִ�. Public
	// 2.��ȯŸ�� ���ڷ� ��ȯ�ؾ� ��.
	// 3.�޼ҵ��(Main4���� ������ �� )
	public String getUserId() {
		return userId;
	}
	
	//void�� ��ȯ���� �ʴ´�.
	public void setUserId(String userId) { 
		this.userId = userId; // ���� ���ǵ� ������ �ְڴ�
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
	
	// setter <= �������� ���ؼ� ���� �����Ű�� ������.
	// getter <= �������� ���ؼ� ���� ������ ������.
	
	

	}


