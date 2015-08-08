import java.util.ArrayList;

class Rooms {

    public static void build(Room[][] room, final int WIDTH, final int HEIGHT) {

        // Initialize rooms (a 2D array)
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room(i, "", "", null);
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("Torture Chamber");
        room[0][0].setDescription("Very Evil and Tortury");
        room[0][0].setItems("Fuzzy Handcuffs");
        room[0][0].setItems("Strange Sword");

        room[0][1].setNumber(2);
        room[0][1].setName("Long Hallway");
        room[0][1].setDescription("Very Long and Dark");
        room[0][1].setItems("Rat");
        room[0][1].setItems("Torch");

        room[1][0].setNumber(3);
        room[1][0].setName("Goblins Camp");
        room[1][0].setDescription("A room with 3 goblins and scattered treasures");
        room[1][0].setItems("28 gold");
        room[1][0].setItems("Diamond Jewl");

        room[1][1].setNumber(4);
        room[1][1].setName("Goblin's Cellar");
        room[1][1].setDescription("Even darker then the hallway!");
        room[1][1].setItems("Adolf Hitler");
        room[1][1].setItems("Scrumpeh");
    }

    public static void print(Room[][] room, int x, int y) {

        System.out.println(room[x][y].getDescription());
        System.out.println("You see: " + room[x][y].getItems());
        System.out.println();
    }

    // Remove item from room when added to inventory
    public static void removeItem(Room[][] room, int x, int y, String item) {

        room[x][y].deleteItem(item);
    }
}

class Room {

    private int number;
    private String name;
    private String description;
    public ArrayList<String> items = new ArrayList<>();

    public Room(int number, String name, String description,
                ArrayList<String> items) {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setItems(String item) {
        this.items.add(item);
    }

    public void deleteItem(String item) {
        this.items.remove(item);
    }

    public ArrayList<String> getItems() {
        return this.items;
    }
}
