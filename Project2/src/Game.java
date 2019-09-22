
public class Game {

	private void commandLoop() {
		
		
	}
	
	public static void main(String[] args) {
		// Dungeon: 4 rooms (0 through 3)
		String[] rooms = {
				"|You're in a large dark room| false 1 -1 -1 2 ", 
				"|You're in a dark large room| false -1 0 -1 -1 ",
				"|You're in a large room, very dark| false 0 0 3 0 ",
				"|You're in a dark room, very small| true 0 0 0 0 "
		};
		
		// Set the dungeon up according to the input
		Controller c = new Controller(rooms.length);
		for (int i = 0; i < rooms.length; i++) {
			c.buildRoom(i, rooms[i]);
		}

		// Create and position player
		player = new Player("Your name");
		player.setCurrent(c.getStartRoom());

		// Print room description and off you go!
		System.out.println(player.getCurrent().getDescription());
		commandLoop();
	}
}
