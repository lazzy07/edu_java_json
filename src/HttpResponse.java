import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lasantha Madushan on 2/28/2019.
 */
public class HttpResponse {
    private String url;
    private String method;
    private String output;

    private Header header;
    private Arguments arguments;

//    private HashMap<String, String> header = new HashMap<>();
//    private HashMap<String, String> arguments = new HashMap<>();
    public List<BodyItem> body = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public String getOutput() {
        return output;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public HttpResponse(String url, String method, String output) {
        this.url = url;
        this.method = method;
        this.output = output;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", output='" + output + '\'' +
                ", header=" + header +
                ", arguments=" + arguments +
                ", body=" + body +
                '}';
    }

    public static void main(String args[]){
        String jsonString = "{\"arguments\":{\"number\":10},\"url\":\"http://wtev.com\",\"method\":\"POST\",\"header\":{\"Content-Type\":\"application/json\"},\"body\":[{\"id\":0,\"name\":\"name 0\",\"description\":\"desc 0\"},{\"id\":1,\"name\":\"name 1\",\"description\":\"desc 1\"}]}";

        Gson g = new Gson();
        HttpResponse res = g.fromJson(jsonString, HttpResponse.class);

        System.out.println(res.toString());
    }
}
