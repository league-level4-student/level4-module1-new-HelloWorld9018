package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	protected ArrayList<Patient> Patients = new ArrayList<>();
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	abstract public void doMedicine();
	abstract public void assignPatient(Patient patient);
	abstract public void makesHouseCalls();
	abstract public void performsSurgery();
	//abstract public void getPatients();
	
	abstract public ArrayList<Patient> getPatients();
	
	
		
	

}
