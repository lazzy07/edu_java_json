import com.google.gson.Gson;
import com.sun.jndi.ldap.ext.StartTlsResponseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lasantha Madushan on 2/26/2019.
 */
public class Course {

    private String id;
    private String code;
    private String title;

    private List<Course> prerequisite = new ArrayList<>();


    public Course(String id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void addPrerequisite(Course c){
        this.prerequisite.add(c);

    }

    public static void main(String args[]){

        String jstring = "{\"id\":\"c003\",\"code\":\"cs201\",\"title\":\"data structures\",\"prerequisite\":[{\"id\":\"c001\",\"code\":\"cs100\",\"title\":\"computer applications\",\"prerequisite\":[]},{\"id\":\"c002\",\"code\":\"cs102\",\"title\":\"programming techniques\",\"prerequisite\":[{\"id\":\"c001\",\"code\":\"cs100\",\"title\":\"computer applications\",\"prerequisite\":[]}]}]}\n";

        Course cs100 = new Course("c001","cs100","computer applications");
        Course cs102 = new Course("c002","cs102","programming techniques");
        Course cs201 = new Course("c003","cs201","data structures");

        cs102.addPrerequisite(cs100);
        cs201.addPrerequisite(cs100);
        cs201.addPrerequisite(cs102);

        Gson gson = new Gson();
//        String json = gson.toJson(cs201);
//        System.out.println(json);

        Course c = gson.fromJson(jstring,Course.class);

        System.out.println(c.getId());
    }
}
