package scenariobasedpractice.Artify;

import java.util.ArrayList;

public class Store {
    ArrayList<ArtWork> artwork = new ArrayList<>();
    
    public Store() {
    	artwork.add(new DigitalArt("World of night","raj",15000.0));
    	artwork.add(new DigitalArt("Gods Truth ","baz",12000.0));
    	artwork.add(new PrintArt("Colour of Lights","nag",200.0));
    }
    
    public double buy(String title,String license,double wallet) {
    	for(ArtWork a: artwork) {
    		if(a.getTitle().equalsIgnoreCase(title)) {
    				if(wallet>=a.getPrice()) {
    					a.purchase(title, license);
    					wallet = wallet-a.getPrice();
        				artwork.remove(a);
            			return wallet;
    				}else {
    					System.out.println("Not Have Enough Balance");
    					return wallet;
    				}
    		}
    	}
    
    	System.out.println("Art Piece Not Found");
    	return wallet;
    }
    public void details() {
    	for(ArtWork a: artwork) {
    		a.details();
    	}
    }
    
    public void certainDetail(String title) {
    	for(ArtWork a: artwork) {
    		if(a.getTitle().equalsIgnoreCase(title)) {
    			a.details();
    			return;
    		}
    	}
    	System.out.println("Error Not Found");
    }
}