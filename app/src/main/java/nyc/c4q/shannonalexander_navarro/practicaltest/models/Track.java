
package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("albumTrackCount")
    @Expose
    private int albumTrackCount;
    @SerializedName("hasAudioTrackTimeline")
    @Expose
    private int hasAudioTrackTimeline;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("beatsPerMinute")
    @Expose
    private int beatsPerMinute;
    @SerializedName("albumTrackNumber")
    @Expose
    private int albumTrackNumber;
    @SerializedName("albumName")
    @Expose
    private String albumName;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("albumArtist")
    @Expose
    private String albumArtist;
    @SerializedName("composer")
    @Expose
    private String composer;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("discNumber")
    @Expose
    private int discNumber;
    @SerializedName("discCount")
    @Expose
    private int discCount;

    /**
     * @return The albumTrackCount
     */
    public int getAlbumTrackCount() {
        return albumTrackCount;
    }

    /**
     * @param albumTrackCount The albumTrackCount
     */
    public void setAlbumTrackCount(int albumTrackCount) {
        this.albumTrackCount = albumTrackCount;
    }

    /**
     * @return The hasAudioTrackTimeline
     */
    public int getHasAudioTrackTimeline() {
        return hasAudioTrackTimeline;
    }

    /**
     * @param hasAudioTrackTimeline The hasAudioTrackTimeline
     */
    public void setHasAudioTrackTimeline(int hasAudioTrackTimeline) {
        this.hasAudioTrackTimeline = hasAudioTrackTimeline;
    }

    /**
     * @return The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * @param trackName The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * @return The beatsPerMinute
     */
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * @param beatsPerMinute The beatsPerMinute
     */
    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    /**
     * @return The albumTrackNumber
     */
    public int getAlbumTrackNumber() {
        return albumTrackNumber;
    }

    /**
     * @param albumTrackNumber The albumTrackNumber
     */
    public void setAlbumTrackNumber(int albumTrackNumber) {
        this.albumTrackNumber = albumTrackNumber;
    }

    /**
     * @return The albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * @param albumName The albumName
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * @return The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return The albumArtist
     */
    public String getAlbumArtist() {
        return albumArtist;
    }

    /**
     * @param albumArtist The albumArtist
     */
    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    /**
     * @return The composer
     */
    public String getComposer() {
        return composer;
    }

    /**
     * @param composer The composer
     */
    public void setComposer(String composer) {
        this.composer = composer;
    }

    /**
     * @return The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre The genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return The discNumber
     */
    public int getDiscNumber() {
        return discNumber;
    }

    /**
     * @param discNumber The discNumber
     */
    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * @return The discCount
     */
    public int getDiscCount() {
        return discCount;
    }

    /**
     * @param discCount The discCount
     */
    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }

}
