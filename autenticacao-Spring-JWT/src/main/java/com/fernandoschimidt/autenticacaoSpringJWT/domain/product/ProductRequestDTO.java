package com.fernandoschimidt.autenticacaoSpringJWT.domain.user.product;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public record ProductRequestDTO(
        @NotBlank
        String name,

        @NotNull
        Integer price
) {
}
