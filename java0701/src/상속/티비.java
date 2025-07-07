package 상속;

public class 티비 extends 전자제품 {
	int 채널;
	int 볼륨;
	
	public 티비(int 채널, int 볼륨) {
		this.채널 = 채널;
		this.볼륨 = 볼륨;
	}

	public void changeChannel() {
		System.out.println("채널변경");
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(채널 + " : " + 볼륨);
	}
	
}
