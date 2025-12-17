package com.navidam.api.n8n;

public record N8nWebhookRequest(
        String to,
        String subject,
        String html,
        MidiPayload midi
) {
    public record MidiPayload(
            String filename,
            String contentType,
            String base64
    ) {
    }
}
