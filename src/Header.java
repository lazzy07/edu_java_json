import com.google.gson.annotations.SerializedName;

/**
 * Created by Lasantha Madushan on 2/28/2019.
 */
public class Header {
    @SerializedName("Content-Type")
    private String contentType;

    public Header(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "Header{" +
                "contentType='" + contentType + '\'' +
                '}';
    }
}
