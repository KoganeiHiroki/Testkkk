package テスト;

public class スタート {
	public static void main(String args[]) {
		
		王様 A = new 王様();
		王様 B = new 王様("ああ");
		System.out.println("王様は" + 王様.王様_count + "人");
		
		ヒーロー C = new ヒーロー();
		
		System.out.println(C.getName());
		
		C.setName("しんじ");
		
		System.out.println(C.getName());
		
		C.setAge(22);
		A.talk(C);
		
		
		System.out.println(C.getName());
		
		
		
		
		
		

		
		
//		A.setName("シンジ");
//		A.name2 = "ジ";
//		
//		System.out.println(A.getName());
//		
//		System.out.println(A.name2);
//		
//		A.talk();
//		
		
	}

}
