package angelo.visual_novel;

import angelo.visual_novel.display.Display;

public class Launcher {
	
	private static Display display;

	public static void main(String[] args) {
		display = new Display("Mage's Story", 1080, 720);
	}

}
