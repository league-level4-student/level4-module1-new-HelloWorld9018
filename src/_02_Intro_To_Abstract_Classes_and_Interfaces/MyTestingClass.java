package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class MyTestingClass extends AbstractClassDemo implements InterfaceDemo, DemoInterface {

	@Override
	public void abstractDemo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return 0;
	}
/*How do I know what to put in the newly implemented methods..would it vary across all 
	the classes that extend AbstractClass Demo? */
	
	public void main(String[] args) {
		demo();
		//num=0;
		//how do I set the member variable from AbstractClassDemo equal to something?
	}
//is this how I run AbstractClassDemo's implemented method?
//-------------------------------above is from AbstractClassDemo-----------------------------
@Override
public double interDemo() {
	// TODO Auto-generated method stub
	return 0;
}

//----------------------------above is from InterfaceDemo---------------------------

@Override
public String faceDemo() {
	// TODO Auto-generated method stub
	return null;
}

//---------------------------above is from DemoInterface---------------------------

//how come I can't run the class?
}
