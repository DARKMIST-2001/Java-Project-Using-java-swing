package Interface;

import classes.Staff;

public interface IStaff {

	boolean addStaff(Staff s);
    boolean insertStaff(Staff s);

	boolean removeStaff(Staff s);

	public Staff searchStaff(String staff_ID);

	void showAllStaffs();
}
