package api.deezer.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SearchResponse {

    @SerializedName("data") private List<SearchDataDto> data = null;
    @SerializedName("total") private Integer total;

    public List<SearchDataDto> getData() {
        return data;
    }

    public void setData(List<SearchDataDto> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}