package Interface;

import classes.Ambulance;

public interface IAmbulance {

    boolean addAmbulance( Ambulance A);

    boolean RemoveAmbulance(Ambulance A);

    public Ambulance searchAmbulance(String Aid);

    void showAllAmbulance();
}