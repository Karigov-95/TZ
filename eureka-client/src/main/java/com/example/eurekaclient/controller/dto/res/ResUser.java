package com.example.eurekaclient.controller.dto.res;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Valid
public class ResUser {

    @NotNull
    Long id;

    @NotBlank
    String name;

    Integer money;

    LocalDateTime created;

    LocalDateTime updated;
}
