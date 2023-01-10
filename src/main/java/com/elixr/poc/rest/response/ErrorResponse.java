package com.elixr.poc.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Abstract class inherited by all user response classes
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ErrorResponse {
    protected boolean success;

}
