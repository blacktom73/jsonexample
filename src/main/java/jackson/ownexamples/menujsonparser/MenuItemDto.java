package main.java.jackson.ownexamples.menujsonparser;

public class MenuItemDto {

	private String value;
	private String onclick;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	@Override
	public String toString() {
		return "MenuItemDto{" +
				"value='" + value + '\'' +
				", onclick='" + onclick + '\'' +
				'}';
	}
}
