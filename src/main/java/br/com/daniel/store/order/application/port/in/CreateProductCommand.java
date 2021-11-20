package br.com.daniel.store.order.application.port.in;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Value
@EqualsAndHashCode(callSuper = false)
public class CreateProductCommand {

    @NotBlank
    private String productDescription;

    @Positive
    private Double price;

}
