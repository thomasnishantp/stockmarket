
package com.digitrader.dto;

import com.digitrader.dto.dhan.request.DhanRequestDataDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NSEResponseDTO {

    @JsonProperty("scrip_Code")
    private String scripCode;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("long_name")
    private String longName;

    @JsonProperty("meeting_date")
    private String date;

}
