
package com.digitrader.dto.dhan.response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "remarks",
    "tot_rec",
    "tot_pg",
    "last_resp_time",
    "data"
})
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DhanResponseDTO {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("tot_rec")
    private Integer totRec;
    @JsonProperty("tot_pg")
    private Integer totPg;
    @JsonProperty("last_resp_time")
    private String lastRespTime;
    @JsonProperty("data")
    private List<DhanResponseDatumDTO> data = new ArrayList<DhanResponseDatumDTO>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public DhanResponseDTO withCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public DhanResponseDTO withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    @JsonProperty("tot_rec")
    public Integer getTotRec() {
        return totRec;
    }

    @JsonProperty("tot_rec")
    public void setTotRec(Integer totRec) {
        this.totRec = totRec;
    }

    public DhanResponseDTO withTotRec(Integer totRec) {
        this.totRec = totRec;
        return this;
    }

    @JsonProperty("tot_pg")
    public Integer getTotPg() {
        return totPg;
    }

    @JsonProperty("tot_pg")
    public void setTotPg(Integer totPg) {
        this.totPg = totPg;
    }

    public DhanResponseDTO withTotPg(Integer totPg) {
        this.totPg = totPg;
        return this;
    }

    @JsonProperty("last_resp_time")
    public String getLastRespTime() {
        return lastRespTime;
    }

    @JsonProperty("last_resp_time")
    public void setLastRespTime(String lastRespTime) {
        this.lastRespTime = lastRespTime;
    }

    public DhanResponseDTO withLastRespTime(String lastRespTime) {
        this.lastRespTime = lastRespTime;
        return this;
    }

    @JsonProperty("data")
    public List<DhanResponseDatumDTO> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<DhanResponseDatumDTO> data) {
        this.data = data;
    }

    public DhanResponseDTO withData(List<DhanResponseDatumDTO> data) {
        this.data = data;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DhanResponseDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DhanResponseDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("remarks");
        sb.append('=');
        sb.append(((this.remarks == null)?"<null>":this.remarks));
        sb.append(',');
        sb.append("totRec");
        sb.append('=');
        sb.append(((this.totRec == null)?"<null>":this.totRec));
        sb.append(',');
        sb.append("totPg");
        sb.append('=');
        sb.append(((this.totPg == null)?"<null>":this.totPg));
        sb.append(',');
        sb.append("lastRespTime");
        sb.append('=');
        sb.append(((this.lastRespTime == null)?"<null>":this.lastRespTime));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.totRec == null)? 0 :this.totRec.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.totPg == null)? 0 :this.totPg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lastRespTime == null)? 0 :this.lastRespTime.hashCode()));
        result = ((result* 31)+((this.remarks == null)? 0 :this.remarks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DhanResponseDTO) == false) {
            return false;
        }
        DhanResponseDTO rhs = ((DhanResponseDTO) other);
        return ((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.totRec == rhs.totRec)||((this.totRec!= null)&&this.totRec.equals(rhs.totRec))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.totPg == rhs.totPg)||((this.totPg!= null)&&this.totPg.equals(rhs.totPg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lastRespTime == rhs.lastRespTime)||((this.lastRespTime!= null)&&this.lastRespTime.equals(rhs.lastRespTime))))&&((this.remarks == rhs.remarks)||((this.remarks!= null)&&this.remarks.equals(rhs.remarks))));
    }

}
