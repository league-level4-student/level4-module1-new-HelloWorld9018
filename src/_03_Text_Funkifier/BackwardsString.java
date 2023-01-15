package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
//return the the unfunkifiedText string backwards.
    	String funkyText = "";
    	
    	for(int i  = unfunkifiedText.length()-1; i>=0; i--) {
    		funkyText += unfunkifiedText.charAt(i);
    	}
    	//System.out.println(funkyText);
        return funkyText;

    }
}
