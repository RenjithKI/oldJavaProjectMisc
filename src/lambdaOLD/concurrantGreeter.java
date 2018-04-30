package lambdaOLD;

public class concurrantGreeter extends Greeter {
public  void greet() {
	Thread t = new Thread (super::greet);
	t.start();
}

public static void main(String[] args) {
	concurrantGreeter cg = new concurrantGreeter();
	cg.greet();	
}
}
