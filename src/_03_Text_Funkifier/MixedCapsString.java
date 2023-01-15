package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		//returns the unfunkifiedText String with alternating cases starting with lower case
		System.out.println(unfunkifiedText);
		String funkyText = "";
		for(int i = 0; i<(unfunkifiedText.length()); i++) {
		
		if(i%2==1) {
		
			String a = "" + unfunkifiedText.charAt(i);
			a = a.toUpperCase();
	
			funkyText += a;
		}
		else {
		
			String b = "" + unfunkifiedText.charAt(i);
			b = b.toLowerCase();
			funkyText += b;
		}
		
		}
		
		return funkyText;
	}

}
