package br.thullyo.event_manager.repositories;

import br.thullyo.event_manager.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
