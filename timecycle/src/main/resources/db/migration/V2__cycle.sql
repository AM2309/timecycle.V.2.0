DROP TABLE IF EXISTS cycles;
CREATE TABLE cycles (
  id bigserial PRIMARY KEY,
  goal varchar(600),
  process varchar(600),
  blockers varchar(600),
  energy varchar(600),
  morale varchar(600),
  completion_level varchar(600),
  observations varchar(600),
  issues varchar(600),
  improvements varchar(600),
  -- constraint fk_sprint_id foreign key(sprint_id) references sprints(id)
  sprint_id bigint NOT NULL references sprints (id)
  
);