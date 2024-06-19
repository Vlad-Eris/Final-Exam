
public class Act {
	
	private static int count = 0;
	int ID = 0;

    public Act() {
        this.ID = ++count;
    }

    public int getId() {
        return ID;
    }
}
