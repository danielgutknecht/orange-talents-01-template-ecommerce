package br.com.zup.ecommerce.provider.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import br.com.zup.ecommerce.entities.PaymentStatus;
import br.com.zup.ecommerce.entities.Purchase;
import java.net.URI;
import java.text.MessageFormat;

public class PaypalGateway implements Gateway {

	@Override
	public GatewayType getType() {
		return GatewayType.PAYPAL;
	}

	@Override
	public URI getRedirectUri(Purchase purchase, URI actualUri) {
		return URI.create(MessageFormat.format("http://paypal.com/{0}?redirectUrl={1}", purchase.getId(),
				actualUri.getRawPath()));
	}

	@Override
	public PaymentStatus getPaymentStatus(Object status) {
		if (!(status instanceof Integer)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid status format.");
		}

		Integer response = (Integer) status;
		return response == 1 ? PaymentStatus.SUCCESSFUL : PaymentStatus.FAIL;
	}

}
