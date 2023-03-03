package entities;

public class Task extends Lesson{

	private String description;
	private Integer quastionCount;
	
	public Task() {
		super();
	}
	
	public Task(String title, String description, Integer quastionCount) {
		super(title);
		this.description = description;
		this.quastionCount = quastionCount;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuastionCount() {
		return quastionCount;
	}

	public void setQuastionCount(Integer quastionCount) {
		this.quastionCount = quastionCount;
	}

	@Override
	public Integer duration() {
		
		return getQuastionCount() * 5 * 60;  
		
	}	
	 

}
