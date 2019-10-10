package com.example.demo.calender;

import java.util.List;

public interface CalenderService {
  Calender create(Calender calender);
  Calender delete(int id);
  List<Calender> findAll();
  Calender findById(int id);
  Calender update(Calender calender);
}
