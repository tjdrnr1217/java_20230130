package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2023.02.17
//메인에서 실행시키며 결과 출력하는 클레스
public class Print {

	// 3권 정도 임의의 값으로 추가한 후 실행하기
	public void printBook(List<Book> book) {
		for (Book bk : book) {
			System.out.println("책번호:" + bk.getCode());
			System.out.println("책제못:" + bk.getTitle());
			System.out.println("책저자:" + bk.getAuthor());
			System.out.println("책가격:" + bk.getPrice());
			System.out.println("날짜:" + bk.getRegdate());
		}
	}

	// 전체 책과 필터하는 가격 조건 받으면 가격버다 큰 책만 반환
	public List<Book> queryPrice(List<Book> book, long price) {
		List<Book> list = new ArrayList<>();
		for (Book a : book) {
			if (a.getPrice() > price) {
				System.out.println(a.getCode());
				System.out.println(a.getTitle());
				System.out.println(a.getAuthor());
				System.out.println(a.getPrice());
				System.out.println(a.getRegdate());
				list.add(a);
			}
		}
		return list;

	}

	// 가격에서 일의 자리가 0인서만 조회
	// ex)12233 => x
	// ex)12300 => O
	public List<Map<String, Object>> quertPriceList(List<Book> book) {

		List<Map<String, Object>> list = new ArrayList<>();

		for (Book savebook : book) {
			if (savebook.getPrice() % 10 == 0) {
				Map<String, Object> map = new HashMap<>();
				map.put("code", savebook.getCode());
				map.put("title", savebook.getTitle());
				map.put("author", savebook.getAuthor());
				map.put("price", savebook.getPrice());
				map.put("regdate", savebook.getRegdate());

				list.add(map);
			}

		}
		return list;

	}

	// ex) 3
	// 3*1 = 3
	// ~
	// 3*9 = 27
	public void gugudan(int n) {

		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + "=" + (i * n));

		}
	}

	// n개의 정수형이 오면 합을 구해서 반화하는 메소드 구현
	public long sum(List<Long> list) {

		long sum = 0;
		for (Long n : list) {
			sum += n;
		}
		return sum;

	}

	// n개의 실수형이 전달되면 합과 평균을 구해서 반환하는 메소드 구현
	public Map<String, Object> sumAvg(List<Double> list) {
		double sum = 0.0d;
		double avg = 0.0d;
		Map<String, Object> map = new HashMap<>();
		for (Double b : list) {
			sum += b;
		}
		avg = sum / (double) list.size();
		map.put("sum111", sum);
		map.put("avg222", avg);
		return map;

	}
}
