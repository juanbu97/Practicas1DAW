package herenciaJava;

public class TestTerminal {
public static void main(String[] args) {
	
	Terminal t1 = new Terminal("680 847 633");
	Terminal t2 = new Terminal("957 655 249");
	Terminal t3 = new Terminal("957 655 035");
	Terminal t4 = new Terminal("689 987 659");
	
	
	System.out.println(t1);
	System.out.println(t2);
	
	t1.llamar(t2, 320);
	t1.llamar(t3, 200);
	
	
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
}
}
