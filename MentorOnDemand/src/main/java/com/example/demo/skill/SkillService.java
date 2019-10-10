package com.example.demo.skill;

import java.util.List;

public interface SkillService {
  Skill create(Skill skill);
  Skill delete(int id);
  List<Skill> findAll();
  Skill findById(int id);
  Skill update(Skill skill);
List <Skill> findskillByTrainingId(Integer trainingid);
}
