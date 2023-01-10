package classes;
import Interface.IDoctor;
import Interface.IPharmacy;
import Interface.IStaff;
import javax.print.Doc;
import javax.swing.*;

public class Hospital implements IDoctor, IPharmacy, IStaff {
	public static Staff staff[] = new Staff[100];
	public static Ambulance ambulance[] = new Ambulance[50];
	public static Doctor doctor[] = new Doctor[150];
	public static Patient patient[] = new Patient[150];
	public static Emergency emergency[] = new Emergency[100];

	public boolean InsertStaff(Staff s) {
		boolean flag = false;
		for (int i = 0; i < staff.length; i++) {
			if (staff[i] == null) {
				staff[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean InsertAmbulance(Ambulance A) {
		boolean flag = false;
		for (int i = 0; i < ambulance.length; i++) {
			if (ambulance[i] == null) {
				ambulance[i] = A;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean InsertDoctor(Doctor D) {
		boolean flag = false;
		for (int i = 0; i < doctor.length; i++) {
			if (doctor[i] == null) {
				doctor[i] = D;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean InsertPatient(Patient P) {
		boolean flag = false;
		for (int i = 0; i < patient.length; i++) {
			if (patient[i] == null) {
				patient[i] = P;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean InsertEmergency(Emergency E) {
		boolean flag = false;
		for (int i = 0; i < emergency.length; i++) {
			if (emergency[i] == null) {
				emergency[i] = E;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean RemoveStaff(Staff s) {
		boolean flag = false;
		for (int i = 0; i < staff.length; i++) {
			if (staff[i] == s) {
				staff[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean RemoveAmbulance(Ambulance A) {
		boolean flag = false;
		for (int i = 0; i < ambulance.length; i++) {
			if (ambulance[i] == A) {
				ambulance[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean RemoveDoctor(Doctor D) {
		boolean flag = false;
		for (int i = 0; i < doctor.length; i++) {
			if (doctor[i] == D) {
				doctor[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean RemovePatient(Patient P) {
		boolean flag = false;
		for (int i = 0; i < patient.length; i++) {
			if (patient[i] == P) {
				patient[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean RemoveEmergency(Emergency E) {
		boolean flag = false;
		for (int i = 0; i < emergency.length; i++) {
			if (emergency[i] == E) {
				emergency[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Staff searchStaff(String sid) {
		Staff s = null;
		for (int i = 0; i < staff.length; i++) {
			if (staff[i] != null) {
				if (staff[i].get_staff_ID().equals(sid)) {
					s = staff[i];
					break;
				}
			}
		}
		return s;
	}

	public Ambulance searchAmbulance(String Aid) {
		Ambulance s = null;
		for (int i = 0; i < ambulance.length; i++) {
			if (ambulance[i] != null) {
				if (ambulance[i].get_Id().equals(Aid)) {
					s = ambulance[i];
					break;
				}
			}
		}
		return s;
	}

	public Doctor searchDoctor(String Did) {
		Doctor s = null;
		for (int i = 0; i < doctor.length; i++) {
			if (doctor[i] != null) {
				if (doctor[i].getDId().equals(Did)) {
					s = doctor[i];
					break;
				}
			}
		}
		return s;
	}

	public Patient searchPatient(String patID) {
		Patient s = null;
		for (int i = 0; i < patient.length; i++) {
			if (patient[i] != null) {
				if (patient[i].getpatID().equals(patID)) {
					s = patient[i];
					break;
				}
			}

		}
		return s;

	}

	public Emergency searchEmergency(String EmPatientId) {
		Emergency s = null;
		for (int i = 0; i < emergency.length; i++) {
			if (emergency[i] != null) {
				if (emergency[i].get_EmPatientId().equals(EmPatientId)) {
					s = emergency[i];
					break;
				}
			}
		}
		return s;
	}


	public static String showAllpat_Name(int i) {return patient[i].getpatName();}
	public static String showAllpat_ID(int i) {return patient[i].getpatID();}
	public static String showAllpat_Dis(int i) {return patient[i].getpatDiseases();}
	public static String showAllpat_Sex(int i) {return patient[i].getPatSex();}
	public static String showAllpat_Age(int i) {return patient[i].getpatAge();}
	public static String showAllpat_BirthYear(int i) {return patient[i].getpatBirthYearr();}
	public static String showAllpat_NID(int i) {return patient[i].getpatNIDNumber();}
	public static String showAlldoc_ID(int i){return doctor[i].getDId(); }
	public static String showAlldoc_Name(int i){return doctor[i].getDName(); }
	public static String showAlldoc_Room(int i){return doctor[i].getDRoom(); }
	public static String showAlldoc_Qualification(int i){return doctor[i].getDQualification(); }
	public static String showAlldoc_Appoinment(int i){return doctor[i].getDAppointment(); }
	public static String showAlldoc_Specialist(int i){return doctor[i].getDSpecialist(); }
	public static String ShowEmr_pat_name(int i){
		return emergency[i].get_EmPatientName();
	}
	public static String ShowEmr_pat_Id(int i){
		return emergency[i].get_EmPatientId();
	}
	public static String ShowEmr_pat_phn(int i){
		return emergency[i].get_EmPatientPhoneNumber();
	}
	public static String ShowEmr_pat_add(int i){
		return emergency[i].get_EmPatientaddress();
	}
	public static String ShowEmr_pat_bld_grp(int i){
		return emergency[i].get_EmPatientBloodGroup();
	}
	public static String showAlldri_Name(int i){return ambulance[i].get_Driver_Name(); }
	public static String showAlldri_num(int i){return ambulance[i].get_Phone_Number(); }
	public static String showAlldri_id(int i){return ambulance[i].get_Id(); }
	public static String showAllamu_num(int i){return ambulance[i].get_Ambulance_Num();  }
	public static String showAllStaff_Name(int i){return staff[i].get_staff_Name(); }
	public static String showAllStaff_ID(int i){return staff[i].get_staff_ID(); }
	public static String showAllStaff_Post(int i){return staff[i].get_staff_Post(); }
	public static double showAllStaff_Salary(int i){return staff[i].get_staff_Salary(); }
	public static String showAllStaff_PhoneNumber(int i){return staff[i].get_staff_PhoneNumber(); }


	@Override
	public boolean add_new_Doctor(int d) {
		return false;
	}

	@Override
	public boolean totalNumMedi(int total_num_med) {
		return false;
	}

	@Override
	public boolean totalCost(int total_cost) {
		return false;
	}

	@Override
	public boolean addStaff(Staff s) {
		return false;
	}

	@Override
	public boolean insertStaff(Staff s) {
		return false;
	}

	@Override
	public boolean removeStaff(Staff s) {
		return false;
	}

	@Override
	public void showAllStaffs() {

	}
}

	




	

	
	
