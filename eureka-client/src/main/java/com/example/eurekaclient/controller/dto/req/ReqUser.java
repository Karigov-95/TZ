package com.example.eurekaclient.controller.dto.req;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
@Valid
public class ReqUser {

    @NotNull
    Long id;

    @NotBlank
    String name;

    Integer money;
}
