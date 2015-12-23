package concert;


public class PerformanceImpl implements Performance {

	public void perform() throws IllegalStateException {
		System.out.println("Początek występu");
		int choice = (int)Math.floor(Math.random() * 2);
		if(choice!=1){
			System.out.println("Występ nieudany");
			throw new IllegalStateException();
		}
		System.out.println("Występ udany");
	}

}
