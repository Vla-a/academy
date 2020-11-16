package by.deals;

public class Wine extends Product{

	String view;

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public Wine(String view) {
		super();
		this.view = view;
	}

	public Wine() {
		super();
		
	}

	public Wine(double price, String type, String name, int quantity, String view) {
		super(price, type, name, quantity);
		
	}
	
}
