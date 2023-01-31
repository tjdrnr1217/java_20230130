package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//5명의 학생의 국어점수를 보관하고 처리할 클래스
@Setter
@Getter
@ToString
public class KorScore {

	private String[] student = new String[5];
	private int[] score = new int[5];

	// getter , setter , ToString 메소드가 존함.

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < this.score.length; i++) { // 0 1 2 3 4 (5 x)
			sum += this.score[i];
		}
		return sum;
	}

	public float avgScore() {
		float avg = 0.0f;
		int sum = this.sumScore();
		avg = (float) sum / (float) this.score.length; // 실수 1개 이상 필요
		return avg;
	}

	public int maxScore() {
		int max = this.score[0];
		for (int i = 0; i < this.score.length; i++) {
			if (max < this.score[i]) {
				max = this.score[i];
			}
		}
		return max;
	}

	public int minScore() {
		int min = this.score[0];
		for (int i = 0; i < this.score.length; i++) {
			if (min > this.score[i]) {
				min = this.score[i];
			}
		}
		return min;
	}

	public int countScore() {
		int count = 0;
		for (int i = 0; i < this.score.length - 1; i++) {
			if (this.score[i] >= 90) {
				count += 1;
			}
		}
		return count;
	}
}
