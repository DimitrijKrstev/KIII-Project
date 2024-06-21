package com.example.sitckynoteskiii.service.implementation;

import com.example.sitckynoteskiii.model.StickyNote;
import com.example.sitckynoteskiii.repository.StickyNoteRepository;
import com.example.sitckynoteskiii.service.StickyNoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class StickyNoteServiceImplementation implements StickyNoteService {
    StickyNoteRepository stickyNoteRepository;

    @Override
    public StickyNote findByID(Long stickyNoteId) {
        return stickyNoteRepository.findById(stickyNoteId).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<StickyNote> findAll() {
        return stickyNoteRepository.findAll();
    }

    @Override
    public StickyNote createNote(String title, String description) {
        return stickyNoteRepository.save(StickyNote.builder().title(title).description(description).likes(0).build());
    }

    @Override
    public void deleteStickyNote(Long stickyNoteId) {
        stickyNoteRepository.delete(findByID(stickyNoteId));
    }
}
