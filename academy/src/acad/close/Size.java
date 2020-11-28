package acad.close;

public enum Size {

	XXS(32),XS(34),S(36),M(38),L(40);
	
	private int evroSize;
	
	Size(int evroSize){
		
		this.evroSize = evroSize;
	}
	public String getDescription(int evroSize) {
			
		String s = "Взрослый размер";
		return s;
	}
	public int getEvroSize() {
		return evroSize;
	}

}
