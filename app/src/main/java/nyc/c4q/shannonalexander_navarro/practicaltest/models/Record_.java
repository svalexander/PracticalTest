
package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Record_ {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("verified")
    @Expose
    private int verified;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("likeId")
    @Expose
    private int likeId;

    /**
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The verified
     */
    public int getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    public void setVerified(int verified) {
        this.verified = verified;
    }

    /**
     * @return The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     * @param vanityUrls The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     * @return The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return The userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return The user
     */
    public User_ getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    public void setUser(User_ user) {
        this.user = user;
    }

    /**
     * @return The likeId
     */
    public int getLikeId() {
        return likeId;
    }

    /**
     * @param likeId The likeId
     */
    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

}
