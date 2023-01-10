package Interface;

import classes.Emergency;

public interface IEmergency {

    boolean addEmergency(Emergency E);

    boolean RemoveEmergency(Emergency E);

    public Emergency searchEmergency(String EmPatID);

    void showAllEmergency();
}