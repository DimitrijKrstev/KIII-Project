package com.example.sitckynoteskiii.repository;

import com.example.sitckynoteskiii.model.StickyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StickyNoteRepository extends JpaRepository<StickyNote, Long> {
}
