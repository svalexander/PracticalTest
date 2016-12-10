
package nyc.c4q.shannonalexander_navarro.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_ {

    @SerializedName("private")
    @Expose
    private int _private;

    /**
     * @return The _private
     */
    public int getPrivate() {
        return _private;
    }

    /**
     * @param _private The private
     */
    public void setPrivate(int _private) {
        this._private = _private;
    }

}
