
package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loops {

    @SerializedName("count")
    @Expose
    private Double count;
    @SerializedName("velocity")
    @Expose
    private Double velocity;
    @SerializedName("onFire")
    @Expose
    private int onFire;

    /**
     * @return The count
     */
    public Double getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * @return The velocity
     */
    public Double getVelocity() {
        return velocity;
    }

    /**
     * @param velocity The velocity
     */
    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    /**
     * @return The onFire
     */
    public int getOnFire() {
        return onFire;
    }

    /**
     * @param onFire The onFire
     */
    public void setOnFire(int onFire) {
        this.onFire = onFire;
    }

}
