package br.thullyo.event_manager.domain.event;

import java.util.UUID;

public record EventResponse(UUID id, String title, String description, String data, Boolean remote, String img_url) {
}
