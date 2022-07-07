DROP TABLE IF EXISTS sprints;
CREATE TABLE sprints (
  id bigserial PRIMARY KEY,
  name varchar(600),
  goals varchar(600),
  measurement varchar(600),
  success varchar(600),
  other varchar(600),
  cycle_amount integer,
  cycle_time integer,
  break_time integer
);