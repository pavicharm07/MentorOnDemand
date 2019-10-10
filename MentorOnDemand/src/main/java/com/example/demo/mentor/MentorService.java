package com.example.demo.mentor;

import java.util.List;

public interface MentorService {
  Mentor create( Mentor mentor);
  Mentor delete(int id);
  List< Mentor> findAll();
  Mentor findById(int id);
  Mentor update( Mentor mentor);
  List<Mentor> findByActive(Boolean active);
Mentor validatementor(String userName, String password);
}
