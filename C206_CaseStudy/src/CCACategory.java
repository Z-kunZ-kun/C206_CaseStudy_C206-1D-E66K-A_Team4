
public class CCACategory {

	private String category_title;
	private int category_id;

	public CCACategory(String category_title, int category_id) {
		this.category_title = category_title;
		this.category_id = category_id;

	}

	public String getTitle() {
		return category_title;
	}

	public void setTitle(String category_title) {
		this.category_title = category_title;
	}

	public int getCategoryID() {
		return category_id;
	}

	public void setCategoryID(int category_id) {
		this.category_id = category_id;
	}

	public String toStringMain() {
		String output = String.format("%-20s %-10s\n", this.category_id,this.category_title);
		return output;
	}
	
}
