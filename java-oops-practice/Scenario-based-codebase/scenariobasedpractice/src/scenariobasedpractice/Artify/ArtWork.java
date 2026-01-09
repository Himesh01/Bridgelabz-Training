package scenariobasedpractice.Artify;

public class ArtWork implements IPurchasable{
       private String title;
       private String artistName;
       private double price;
       private String license;
	  
       public ArtWork(String title, String artistName, double price) {
		this.title = title;
		this.artistName = artistName;
		this.price = price;
	   }

	   public String getTitle() {
		   return title;
	   }

	   public void setTitle(String title) {
		   this.title = title;
	   }

	   public String getArtistName() {
		   return artistName;
	   }

	   public void setArtistName(String artistName) {
		   this.artistName = artistName;
	   }

	   public double getPrice() {
		   return price;
	   }

	   public void setPrice(double price) {
		   this.price = price;
	   }

	   public String getLicense() {
		   return license;
	   }

	   public void setLicense(String license) {
		   this.license = license;
	   }

	   @Override
	   public void purchase(String title,String license) {
		   license(license);
		   if(getLicense().equalsIgnoreCase("Exclusive")) {
		 System.out.println("\n------Purchase Bill--------");
		 System.out.println("Title       : "+getTitle());
		 System.out.println("Artist Name : "+getArtistName());
		 System.out.println("Price       : "+getPrice());
		 System.out.println("Discount    : 10%");
		 System.out.println("------------------------------");
		 System.out.println("Final Price : "+(getPrice()-((getPrice()/100)*10)));}
		   else {
		 System.out.println("\n------Purchase Bill--------");
		 System.out.println("Title       : "+getTitle());
		 System.out.println("Artist Name : "+getArtistName());
		 System.out.println("Price       : "+getPrice());
		 System.out.println("-----------------------------");
		 System.out.println("Final Price : "+getPrice());
				 }   
		   }
		 
	

	   @Override
	   public void license(String license) {
	      setLicense(license);
	   }
       
	   public void details() {
		   System.out.println("\n--------ArtWork Detail---------");
		   System.out.println("Title       : "+getTitle());
		   System.out.println("Artist Name : "+getArtistName());
		   System.out.println("Price       : "+getPrice());
	   }
       
}
