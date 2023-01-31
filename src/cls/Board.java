package cls;

import java.util.Date;

// �۹�ȣ(long) brdNo
// ������(String) brdTitle
// �۳���(String) brdContent
// �ۼ���(String) brdWriter
// ��ȸ��(long) brdHit 
// �������(Date) brdDate
public class Board {
	
	// ������ Ÿ������ �ʿ��� �׸��� ���弼��.
	// getter / setter
	// toString���� ���弼��.
	// Main5 ������ ���� �Խñ� 1���� ������ �������� �߰��� �� ����ϱ�
	
	long brdno = 0;
	String brdTitle = "";
	String brdContent = "";
	String brdWriter = "";
	long brdHir = 0;
	Date brdDate = null ;
	
	
	@Override
	public String toString() {
		return "Board [brdno=" + brdno + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
				+ brdWriter + ", brdHir=" + brdHir + ", brdDate=" + brdDate + "]";
	}

	public long getBrdno() {
		return brdno;
	}
	
	public void setBrdno(long brdno) {
		this.brdno = brdno;
	}
	
	public String getBrdTitle() {
		return brdTitle;
	}
	
	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}
	
	public String getBrdContent() {
		return brdContent;
	}
	
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	
	public String getBrdWriter() {
		return brdWriter;
	}
	
	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}
	
	public long getBrdHir() {
		return brdHir;
	}
	
	public void setBrdHir(long brdHir) {
		this.brdHir = brdHir;
	}
	
	public Date getBrdDate() {
		return brdDate;
	}
	
	public void setBrdDate(Date brdDate) {
		this.brdDate = brdDate;
	}
	

}
