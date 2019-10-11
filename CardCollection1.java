import java.util.*;

public class CardCollection1{
	
	private String label; 
	private ArrayList<Card> cards;
	
    public CardCollection(String label) { 
	    this.label = label; 
		this.cards = new ArrayList<Card>();
	}
     
	/*public void addCard(Card card) { 
	    this.cards.add(card); 
	}
	*/
	public void addCard(Card card) {
		cards.add(card); 
	}
    
	/*public Card popCard(int i) {
		return cards.remove(i); 
	}
	*/
	public Card popCard() { 
	    int i = size() - 1;
		return popCard(i); 
	}
    
	public int size() { 
	    return cards.size(); 
	}

    public boolean empty() {
		return cards.size() == 0; 
	}
	
	public void deal(CardCollection that, int n) {
		for (int i = 0; i < n; i++) { 
		    Card card = popCard();
			that.addCard(card); 
		}
    }

    public void swapCards(int i, int j) { 
	    Card temp = cards.get(i); 
		cards.set(i, cards.get(j));
		cards.set(j, temp); 
	}
	
    public void shuffle() { //need to add own riffle algorithm
	    Random random = new Random();
		int split = 20 + rn.nextInt(10);
		int s = cards.size();
		String[] arr1 = new String[split];
		String[] arr2 = new String[cards.size() - split];
		//System.out.println(split);
		for(int i = 0; i < split; i++){
			arr1[i] = cards.get(i);
		}
		//System.out.println(Arrays.toString(arr1));
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = cards.get(i+split);
		}	
		//System.out.println(Arrays.toString(arr2));
		int k = 0;
		while(k < cards.size() ){
			int num = rn.nextInt(2);
			//System.out.println(num);
			if(num == 0){
				int nums = rn.nextInt(arr1.length);
                if(nums == arr1.length){
					continue;
				}				
				if(arr1[nums] != "-1"){
					String temp = arr1[nums];
					arr1[nums] = "-1";
					cards.add(temp);
					k = k+1;   
				}
                if(arr1[nums] == "-1"){
					continue;
				}				
			}
			if(num == 1){
			    int nums = rn.nextInt(arr2.length);
				if(nums == arr2.length){
					continue;
				}
                if(arr2[nums] != "-1"){
					String temp = arr2[nums];
					arr2[nums] = "-1";
					cards.add(temp); 
					k = k+1;	
				}
                if(arr2[nums] == "-1"){
					continue;
				}				
			}
			if(num == 2){
				continue;
			}
		}
	}



}