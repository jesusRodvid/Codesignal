package dad.prueba.maven;
import java.util.Arrays; 

public class MakeArrayConsecutive2 {
	
	static int makeArrayConsecutive2(int[] statues) {
		 int numeroestatuas = statues.length;
		 Arrays.sort(statues);
		 int pequenias = statues[0];
		 int grandes = statues [numeroestatuas-1];
		 return grandes - pequenias - numeroestatuas +1;
		}

	public static void main(String[] args) {
		
		int [] tatues = new int [] {6,2,3,8};
		System.out.println(MakeArrayConsecutive2.makeArrayConsecutive2(tatues));
}
}
