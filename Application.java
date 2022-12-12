
package application;


public class Application {
    private int id;
    private static int latestId;
    private String name;
    private String description;
    private int size;
    

    public Application(int id, int latestId, String name,String description, int size) {
        this.id = latestId++;
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", name=" + name + ", description=" + description + ", size=" + size + '}';
    }
    
    
}

