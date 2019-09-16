package vecka_36;

public class uppgift_2 {

	public static void main(String[] args) {
		
		String ord = "Ibland";
        String reverse = "";
        
        
        for(int i = ord.length() - 1; i >= 0; i--)
        {
            reverse = reverse + ord.charAt(i);
        }
        
        System.out.println(reverse);
	}
}
