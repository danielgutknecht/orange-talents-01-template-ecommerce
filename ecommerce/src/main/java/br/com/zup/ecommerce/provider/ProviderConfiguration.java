package br.com.zup.ecommerce.provider;

import br.com.zup.ecommerce.provider.email.FakeMailProvider;
import br.com.zup.ecommerce.provider.email.MailProvider;
import br.com.zup.ecommerce.provider.file.CloudImageUpload;
import br.com.zup.ecommerce.provider.file.FakeImageProvider;
import br.com.zup.ecommerce.provider.file.UploadImageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

public class ProviderConfiguration {

	@Profile("dev")
	@Bean
	public UploadImageProvider devImageProvider() {
		return new FakeImageProvider();
	}

	@Profile("prod")
	@Bean
	public UploadImageProvider prodImageProvider() {
		return new CloudImageUpload();
	}

	@Bean
	public MailProvider mailProvider() {
		return new FakeMailProvider();
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
