package main.java.jackson.ownexamples.menujsonparser;

public class MenuRootDto {

	private MenuDto menu;

	public MenuDto getMenu() {
		return menu;
	}

	public void setMenu(MenuDto menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "MenuRootDto{" +
				"menu=" + menu +
				'}';
	}
}
