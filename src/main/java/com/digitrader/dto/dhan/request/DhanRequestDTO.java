
package com.digitrader.dto.dhan.request;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DhanRequestDTO {

    @JsonProperty("data")
    private DhanRequestDataDTO data;

}
