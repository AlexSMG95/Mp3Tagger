package Deezer;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RootDeezer {

    @SerializedName("data")
    @Expose
    private List<Data> data = null;
    @SerializedName("total")
    @Expose
    private Integer total;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}