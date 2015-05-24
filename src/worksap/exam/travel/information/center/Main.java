package worksap.exam.travel.information.center;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		// construct all the n cities with only city 1 being festive
		List<City> cities = new ArrayList<>();
		cities.add(new City(0));
		for (int i = 1; i <= n; i++) {
			City city = new City(i);
			if (i == 1) {
				city.distance = 0;
			} else {
				city.distance = n;
			}
			cities.add(city);
		}
		// construct the bidirectional edges between cities
		for (int i = 0; i < n - 1; i++) {
			int city1 = in.nextInt();
			int city2 = in.nextInt();
			City one = cities.get(city1);
			City two = cities.get(city2);
			one.connectedCities.add(city2);
			two.connectedCities.add(city1);
			if (one.distance > two.distance + 1) {
				one.distance = two.distance + 1;
			}
			if (two.distance > one.distance + 1) {
				two.distance = one.distance + 1;
			}
		}
		for (int i = 0; i < m; i++) {
			int type = in.nextInt();
			switch (type) {
			case 1:
				// announcement
				int c = in.nextInt();
				cities.get(c).distance = 0;
				adjustCities(c, cities);
				break;
			case 2:
				// inquiry
				int q = in.nextInt();
				System.out.println(cities.get(q).distance);
				break;
			default:
				break;
			}
		}
		in.close();
	}

	private static void adjustCities(int c, List<City> cities) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(cities.get(c).id);
		while (!queue.isEmpty()) {
			int cityId = queue.poll();
			for (Integer id : cities.get(cityId).connectedCities) {
				if (!queue.contains(id)) {
					if (cities.get(id).distance > cities.get(cityId).distance + 1) {
						cities.get(id).distance = cities.get(cityId).distance + 1;
						queue.offer(id);
					}
				}
			}
		}
	}
}

class City {
	int id;
	int distance;
	List<Integer> connectedCities;

	public City(int id) {
		this.id = id;
		connectedCities = new ArrayList<>();
	}

}