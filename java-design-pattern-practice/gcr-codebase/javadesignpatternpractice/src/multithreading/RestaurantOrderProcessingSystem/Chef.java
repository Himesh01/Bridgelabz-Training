package multithreading.RestaurantOrderProcessingSystem;

public class Chef extends Thread {
	private String chefName;
	private String dishName;
	private long totalCookingTime;
	
	public Chef(String chefName, String dishName, double d) {
		this.chefName = chefName;
		this.dishName = dishName;
		this.totalCookingTime = (long)(d * 1000);
	}
	
	@Override
	public void run() {
		System.out.println(chefName +" Started preparing "+ dishName);
		
		try {
			long stepTime = totalCookingTime/4;
			for(int i =0 ; i<= 4;i++) {
				Thread.sleep(stepTime);
				int progress = i*25;
				System.out.println(chefName + " preparing " + dishName + " : " + progress + "% complete");
            }
            System.out.println(chefName + " completed " + dishName);

        } catch (InterruptedException e) {
            System.out.println(chefName + " was interrupted while cooking " + dishName);
        }
	}
}
