package chargily.epay.java;

import br.com.fluentvalidator.context.ValidationResult;

public class InvoiceException extends RuntimeException {


    protected InvoiceException(ValidationResult validationResult) {
        super(validationResult.toString());
    }
}
