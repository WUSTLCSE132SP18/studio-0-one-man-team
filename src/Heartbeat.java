
public class Heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 1;
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println(time + " secs have passed");
				time++;
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}

}
