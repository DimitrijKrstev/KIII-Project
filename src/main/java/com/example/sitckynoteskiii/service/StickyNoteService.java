package com.example.sitckynoteskiii.service;
import com.example.sitckynoteskiii.model.StickyNote;

import java.util.List;

public interface StickyNoteService{
    public StickyNote findByID(Long stickyNoteId);
    public List<StickyNote> findAll();
    public StickyNote createNote(String title, String description);
    public void deleteStickyNote(Long stickyNoteId);
}
