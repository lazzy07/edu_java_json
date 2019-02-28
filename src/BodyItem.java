import com.google.gson.Gson;

/**
 * Created by Lasantha Madushan on 2/28/2019.
 */
public class BodyItem {
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BodyItem(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
