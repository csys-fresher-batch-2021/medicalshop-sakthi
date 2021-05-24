package in.sakthi.model;

public class Medicine {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	public Medicine(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
