
package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repost {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("verified")
    @Expose
    private int verified;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("flags|platform_lo")
    @Expose
    private int flagsPlatformLo;
    @SerializedName("repostId")
    @Expose
    private int repostId;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("profileBackground")
    @Expose
    private String profileBackground;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("postId")
    @Expose
    private int postId;
    @SerializedName("ipAddress")
    @Expose
    private int ipAddress;
    @SerializedName("flags|platform_hi")
    @Expose
    private int flagsPlatformHi;
    @SerializedName("sourceType")
    @Expose
    private int sourceType;
    @SerializedName("sourceId")
    @Expose
    private int sourceId;

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
     * @return The flagsPlatformLo
     */
    public int getFlagsPlatformLo() {
        return flagsPlatformLo;
    }

    /**
     * @param flagsPlatformLo The flags|platform_lo
     */
    public void setFlagsPlatformLo(int flagsPlatformLo) {
        this.flagsPlatformLo = flagsPlatformLo;
    }

    /**
     * @return The repostId
     */
    public int getRepostId() {
        return repostId;
    }

    /**
     * @param repostId The repostId
     */
    public void setRepostId(int repostId) {
        this.repostId = repostId;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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
     * @return The profileBackground
     */
    public String getProfileBackground() {
        return profileBackground;
    }

    /**
     * @param profileBackground The profileBackground
     */
    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
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
     * @return The user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * @param postId The postId
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     * @return The ipAddress
     */
    public int getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress The ipAddress
     */
    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return The flagsPlatformHi
     */
    public int getFlagsPlatformHi() {
        return flagsPlatformHi;
    }

    /**
     * @param flagsPlatformHi The flags|platform_hi
     */
    public void setFlagsPlatformHi(int flagsPlatformHi) {
        this.flagsPlatformHi = flagsPlatformHi;
    }

    /**
     * @return The sourceType
     */
    public int getSourceType() {
        return sourceType;
    }

    /**
     * @param sourceType The sourceType
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * @return The sourceId
     */
    public int getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId The sourceId
     */
    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

}
