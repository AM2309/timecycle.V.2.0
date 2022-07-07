DROP TABLE IF EXISTS retros;

CREATE TABLE retros (
  sprints_id bigint NOT NULL references sprints (id),
  achievement varchar(600),
  issues varchar(600),
  went_well varchar(600),
  anything_else varchar(600)
);