package com.navidam.api.n8n;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class N8nClient {

    private final RestClient restClient;
    private final String webhookUrl;

    public N8nClient(
            RestClient.Builder builder,
            @Value("${navidam.n8n.webhook-url}") String webhookUrl
    ) {
        this.webhookUrl = webhookUrl;
        this.restClient = builder.build();
    }

    public void sendPostal(N8nWebhookRequest payload) {
        restClient.post()
                .uri(webhookUrl)
                .contentType(MediaType.APPLICATION_JSON)
                .body(payload)
                .retrieve()
                .toBodilessEntity();
    }
}