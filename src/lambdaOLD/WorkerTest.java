package lambdaOLD;

public class WorkerTest {
public static void main(String[] args) {
	Worker w = new Worker();
	new Thread(w).start();
}
}
