package main.java.jackson.ownexamples.menujsonparser;

public class MenuDto {

	private String id;
	private String value;
	private PopUpDto popup;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public PopUpDto getPopup() {
		return popup;
	}

	public void setPopup(PopUpDto popup) {
		this.popup = popup;
	}

	@Override
	public String toString() {
		return "MenuDto{" +
				"id='" + id + '\'' +
				", value='" + value + '\'' +
				", popup=" + popup +
				'}';
	}
}
