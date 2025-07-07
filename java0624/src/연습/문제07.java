package 연습;

public class 문제07 {

	public static void main(String[] args) {
		int manDistance = 1, womanDistance = 1;

		int[] man = new int[2];
		int[] woman = new int[2];
		int[] place = new int[2];

		while (true) {
			// 생성기
			man[0] = (int) (Math.random() * 50) + 1;
			man[1] = (int) (Math.random() * 50) + 1;

			System.out.printf("남성 x좌표: %d, y좌표: %d\n", man[0], man[1]);

			// 생성기
			woman[0] = (int) (Math.random() * 50) + 1;
			woman[1] = (int) (Math.random() * 50) + 1;
			System.out.printf("여성 x좌표: %d, y좌표: %d\n", woman[0], woman[1]);

			// 생성기
			place[0] = (int) (Math.random() * 50) + 1;
			place[1] = (int) (Math.random() * 50) + 1;
			System.out.printf("장소 x좌표: %d, y좌표: %d\n", place[0], place[1]);

			// 거리 계산
			man[0] = man[0] - place[0];
			man[0] *= man[0];
			man[1] = man[1] - place[1];
			man[1] *= man[1];
			manDistance = (man[0] + man[1]);

			woman[0] = woman[0] - place[0];
			woman[0] *= woman[0];
			woman[1] = woman[1] - place[1];
			woman[1] *= woman[1];
			womanDistance = (woman[0] + woman[1]);

			// 거리 비교
			if (manDistance < womanDistance) {
				System.out.println("만나지 못함");

			} else if (manDistance > womanDistance) {
				System.out.println("만남 성공");
				break;
			}
		}

	}

}
