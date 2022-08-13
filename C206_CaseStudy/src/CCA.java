public class CCA extends CCACategory {
	public int id;
	public String ccaTitle;
	public String description;
	public int seats;
	public String dayOfCCA;
	public String time;
	public String venue;

	public CCA(String category_title, int category_id, int id, String ccaTitle, String description,
			int seats, String dayOfCCA, String time, String venue) {
		super(category_title, category_id);
		this.id = id;
		this.ccaTitle = ccaTitle;
		this.description = description;
		this.seats = seats;
		this.dayOfCCA = dayOfCCA;
		this.time = time;
		this.venue = venue;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getCCATitle() {
		return ccaTitle;
	}

	public void setCCATitle(String ccaTitle) {
		this.ccaTitle = ccaTitle;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) { 
		this.seats = seats;
	}

	public String getDay() {
		return dayOfCCA;
	}

	public void setDay(String dayOfCCA) {
		this.dayOfCCA = dayOfCCA;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
	public String toString() {
		String output = super.toString();
		output = String.format("%-63s %-15d %-15s %-15s %-15s %-19s %-13s\n", output, id, ccaTitle,seats, dayOfCCA, time, venue);
		return output;
	}

}