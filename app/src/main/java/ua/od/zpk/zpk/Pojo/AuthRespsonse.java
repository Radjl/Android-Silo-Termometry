package ua.od.zpk.zpk.Pojo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class AuthRespsonse {

    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("UserSID")
    @Expose
    private String userSID;
    @SerializedName("Credentials")
    @Expose
    private Credentials credentials;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserSID() {
        return userSID;
    }

    public void setUserSID(String userSID) {
        this.userSID = userSID;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

}
