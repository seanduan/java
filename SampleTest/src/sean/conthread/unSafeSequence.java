package sean.conthread;

public class unSafeSequence {
	private int number;
	
	public unSafeSequence() {
		this.number = 0;
	}

	public void getNext(){
		number++;
	}
}
