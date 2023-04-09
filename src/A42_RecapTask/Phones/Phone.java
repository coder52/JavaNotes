package A42_RecapTask.Phones;

import A42_RecapTask.abstractions.AbstractDevice;
import A42_RecapTask.utils.Career;

public abstract class Phone extends AbstractDevice {
	
	Career career;

	public Career getCareer() {
		return career;
	}

	public void setCareer(Career career) {
		this.career = career;
	}	
	

}
