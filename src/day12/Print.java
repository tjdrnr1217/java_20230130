package day12;

import java.util.Iterator;
import java.util.List;

import day11.Titanic;

public class Print {

	// 전체 목록을 받아서 생존자의 인원수를 구하시오,
	public void printSurvived(List<Titanic> list) {
		int count = 0;
		for (Titanic titanic : list) {
			if (titanic.getSurvived().equals("Yes")) {
				count++;
			}
		}
		System.out.println(count);

	}

	// 전체 목록을 받아서 연령대별 인원수를 구하시오(단 0은 제외, while문 사용)
	// 0.01 ~ 9 어린이
	// 10 ~ 19 10대
	// 20 ~ 29 20대
	// 30 ~ 39 30대
	// --
	public void printAge(List<Titanic> list) {
		Iterator<Titanic> cursor = list.iterator();
		int[] a = new int[11];
		while (cursor.hasNext()) {
			Titanic t = new Titanic();
			if (t.getAge() < 10) {
				a[0] += t.getAge();
			}
		}
		System.out.println(a[0]);

	}

	// 전체 목록에서 티켓등급(pclass)값의 종류별 개수를 구하시오
	public int[] printPClass(List<Titanic> list) {
		int[] cnt = { 0, 0, 0, 0 };
		for (Titanic t : list) {
			int n = t.getPclass();
			cnt[n]++;
		}
//		int a[] = new int[3];
//		for (Titanic t : list) {
//			if (t.getPclass() == 1) {
//				a[0]++;
//			} else if (t.getPclass() == 2) {
//				a[1]++;
//			} else {
//				a[2]++;
//			}
//		}

		return cnt;

	}

	// 전체 목록에서 운임요금(fare) 30보다 큰것만 (fare와 name출력.) (단 fare는 소주점을 올림하여 정수로 표사
	public void printFare(List<Titanic> list) {
		for (Titanic t : list) {
			if (t.getFare() > 30) {
				System.out.println(Math.ceil(t.getFare()));
				System.out.println(t.getName());
			}

		}

	}

	// 전체 목록에서 이름(name)의 mr.Miss.mrs. 를 각각 포함하는 인원수를 구하시오.
	public void PrintName(List<Titanic> list) {
		int a[] = new int[4];
		for (Titanic t : list) {
			if (t.getName().contains("Mr.")) {
				a[0]++;
			} else if (t.getName().contains("Miss.")) {
				a[1]++;
			} else if (t.getName().contains("Mrs.")) {
				a[2]++;
			} else {
				a[3]++;
			}
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}

	// 연령대별 생존자수 구하기
	public void printAgeSurvived(List<Titanic> list) {
		System.out.println(list.toString());
		int[] a = new int[9];
		int[] b = new int[9];
		
		for (Titanic t : list) {	
			if(t.getAge() > 0) {
				int n =(int) t.getAge()/10;
				a[n]++;
				if(t.getSurvived().equalsIgnoreCase("Yes")) {
					b[n]++;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(i*10 + "대: " + ( (float)b[i] / (float)(a[i] ) * 100 ));
			//System.out.println(a[i]);
				
		}
	}

	// 성별 생존자수 구하기
	public void printSexSurvived(List<Titanic> list) {
		// 1. 남여 인원수 구하기,
		// 2. 남여 생존자수 구하기,
		// 남 생존잔수 / 남 전체인원 * 100
		int[] cnt1 = new int[2]; // 인원수
		int[] cnt2 = new int[2];
		for (Titanic t : list) {
			if (t.getSex().equals("male")) {
				cnt1[0]++;
				if (t.getSurvived().equals("Yes")) {
					cnt2[0]++;
				}
			} else if (t.getSex().equals("female")) {
				cnt1[1]++;
				if (t.getSurvived().equals("Yes")) {
					cnt2[1]++;
				}

			}
		}
		System.out.println("남자 생존자수:" + (float) cnt2[0] / (float) cnt1[0] * 100);
		System.out.println("여자 생존자수:" + (float) cnt2[1] / (float) cnt1[1] * 100);

	}

	// 티켓 등급별 생존자수 구하기
	public void printPClassSurvived(List<Titanic> list) {
		int[] cnt1 = new int[4];
		int[] cnt2 = new int[4];
		for (Titanic t : list) {
			if (t.getPclass() == 1) {
				cnt1[1]++;
				if (t.getSurvived().equals("Yes")) {
					cnt2[1]++;
				}

			} else if (t.getPclass() == 2) {
				cnt1[2]++;
				if (t.getSurvived().equals("Yes")) {
					cnt2[2]++;
				}

			} else if (t.getPclass() == 3) {
				cnt1[3]++;
				if (t.getSurvived().equals("Yes")) {
					cnt2[3]++;
				}
			}

		}
		System.out.println("1등급:" + (float) cnt2[1] / (float) cnt1[1] * 100);
		System.out.println("2등급:" + (float) cnt2[2] / (float) cnt1[2] * 100);
		System.out.println("3등급:" + (float) cnt2[3] / (float) cnt1[3] * 100);

	}

	// for문 사용
	public void PrintListAll(List<Titanic> list) {
		// 위치를 알 수 없음.
		for (Titanic titanic : list) {
			System.out.println(titanic.getFare());
			System.out.println(titanic.getSurvived());
			System.out.println(titanic.getPclass());
			System.out.println(titanic.getSex());
			System.out.println(titanic.getSibsp());
			System.out.println(titanic.getParch());
			System.out.println(titanic.getTicket());
			System.out.println(titanic.getCabin());
			System.out.println(titanic.getEmbarked());
			System.out.println(titanic.getName());
			System.out.println(titanic.getPassengerid());
			System.out.println(titanic.getAge());
			System.out.println(titanic.getRegdate());
			System.out.println("-------------------------");
		}

		// 위치를 알 수 있음.

	}

	// while문 이용해서 출력
	public void printListAll1(List<Titanic> list) {
		Iterator<Titanic> cursor = list.iterator();
		while (cursor.hasNext()) {
			Titanic c = cursor.next();
			System.out.println(c.getFare());
			System.out.println(c.getSurvived());
			System.out.println(c.getPclass());
			System.out.println(c.getSex());
			System.out.println(c.getSibsp());
			System.out.println(c.getParch());
			System.out.println(c.getTicket());
			System.out.println(c.getCabin());
			System.out.println(c.getEmbarked());
			System.out.println(c.getName());
			System.out.println(c.getPassengerid());
			System.out.println(c.getAge());
			System.out.println(c.getRegdate());
			System.out.println("-------------------------");
		}

//		// 2.
//		int i = 0;
//		while(i<list.size()) {
//			Titanic c = cursor.next();
//			System.out.println(c.getFare());
//			System.out.println(c.getSurvived());
//			System.out.println(c.getPclass());
//			System.out.println(c.getSex());
//			System.out.println(c.getSibsp());
//			System.out.println(c.getParch());
//			System.out.println(c.getTicket());
//			System.out.println(c.getCabin());
//			System.out.println(c.getEmbarked());
//			System.out.println(c.getName());
//			System.out.println(c.getPassengerid());
//			System.out.println(c.getAge());
//			System.out.println(c.getRegdate());
//			System.out.println("-------------------------");
//		}

	}

	// do-while문 이용해서 출력
	public void PrintListAll2(List<Titanic> list) {
		Iterator<Titanic> cursor = list.iterator();
		do {

		} while (cursor.hasNext());
		Titanic c = cursor.next();
		System.out.println(c.getFare());
		System.out.println(c.getSurvived());
		System.out.println(c.getPclass());
		System.out.println(c.getSex());
		System.out.println(c.getSibsp());
		System.out.println(c.getParch());
		System.out.println(c.getTicket());
		System.out.println(c.getCabin());
		System.out.println(c.getEmbarked());
		System.out.println(c.getName());
		System.out.println(c.getPassengerid());
		System.out.println(c.getAge());
		System.out.println(c.getRegdate());
		System.out.println("-------------------------");
	}

}
