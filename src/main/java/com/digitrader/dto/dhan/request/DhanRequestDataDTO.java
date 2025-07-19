
package com.digitrader.dto.dhan.request;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DhanRequestDataDTO {

    @JsonProperty("sort")
    public String sort;
    @JsonProperty("sorder")
    public String sorder;
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("params")
    public List<DhanRequestParamDTO> params;
    @JsonProperty("fields")
    public List<String> fields;
    @JsonProperty("pgno")
    public Integer pgno;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSorder() {
        return sorder;
    }

    public void setSorder(String sorder) {
        this.sorder = sorder;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DhanRequestParamDTO> getParams() {
        return params;
    }

    public void setParams(List<DhanRequestParamDTO> params) {
        this.params = params;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public Integer getPgno() {
        return pgno;
    }

    public void setPgno(Integer pgno) {
        this.pgno = pgno;
    }
}
