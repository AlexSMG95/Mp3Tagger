package api.deezer.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DeezerSearchResponse {

    @SerializedName("data") private List<DataDto> data = null;
    @SerializedName("total") private Integer total;

    public List<DataDto> getData() {
        return data;
    }

    public void setData(List<DataDto> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}