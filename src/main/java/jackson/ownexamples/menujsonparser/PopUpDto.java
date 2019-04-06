package main.java.jackson.ownexamples.menujsonparser;

import java.util.Arrays;


public class PopUpDto {

	private MenuItemDto[] menuitem;

	public MenuItemDto[] getMenuitem() {
		return menuitem;
	}

	public void setMenuitem(MenuItemDto[] menuitem) {
		this.menuitem = menuitem;
	}

	@Override
	public String toString() {
		return "PopUpDto{" +
				"menuitem=" + Arrays.toString(menuitem) +
				'}';
	}
}
