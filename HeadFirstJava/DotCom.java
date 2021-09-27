import java.util.ArrayList;

public class DotCom {
	private	ArrayList<String> locationCells;

	public void setLocationCells (ArrayList<String> loc) {
		locationCells = loc;
	}

	public String checkYourself(String UserInput) {
		String result = "miss";

		int index = locationCells.indexOf(UserInput);
		if (index > 0 ) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
			
		}
		return result;
	}
}