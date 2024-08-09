package br.thullyo.event_manager.domain.event;

import java.util.UUID;

public record EventRequest(UUID id, String title, String description, String data, Boolean remote, String img_url) {
}
