package br.com.daniel.store.order.application.port.in;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Value
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class PlaceOrderCommand {

    @NotEmpty
    private List<String> productIds;
    @NotEmpty
    private String customerName;
    @Email
    private String customerEmail;
    @NotNull
    private String customerGovId;


}
