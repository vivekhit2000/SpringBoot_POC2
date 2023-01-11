package com.elixr.poc.rest.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponse {
    private boolean success;
    private String errorMessage;
}
