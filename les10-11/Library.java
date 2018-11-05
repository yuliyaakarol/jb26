package by.epam.les10.main;

import java.util.ArrayList;
import java.util.List;


public class Library {
	private List<PrintedEdition> units = new ArrayList<PrintedEdition>();
	
	public Library() {
	}

	public void add(PrintedEdition unit) {
		units.add(unit);
	}

	public void remove(PrintedEdition unit) {
		units.remove(unit);
	}

	public List<PrintedEdition> getUnits() {
		return units;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((units == null) ? 0 : units.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		return true;
	}

	public List<PrintedEdition> find(Findable findMatcher){//FindByTitle
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
		
 

}
