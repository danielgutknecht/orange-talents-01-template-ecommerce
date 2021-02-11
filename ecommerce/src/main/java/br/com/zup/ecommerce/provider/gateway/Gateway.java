package br.com.zup.ecommerce.provider.gateway;

import java.net.URI;
import br.com.zup.ecommerce.entities.PaymentStatus;
import br.com.zup.ecommerce.entities.Purchase;

public interface Gateway {

	GatewayType getType();

	URI getRedirectUri(Purchase purchase, URI currentUri);

	PaymentStatus getPaymentStatus(Object status);

}
