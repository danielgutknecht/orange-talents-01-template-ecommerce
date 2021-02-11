package br.com.zup.ecommerce.provider.gateway;

import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class PaymentGatewayProvider {

	private final Set<Gateway> gateways;

	public PaymentGatewayProvider() {
		gateways = new HashSet<>();

		gateways.add(new PaypalGateway());
		gateways.add(new PagseguroGateway());
	}

	public Optional<Gateway> findByType(GatewayType type) {
		return gateways.stream().filter(gateway -> gateway.getType().equals(type)).findAny();
	}
}
