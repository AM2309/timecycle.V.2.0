# Timecycle

```
As a user,
So that I can start my productive session,
I would like to start a productive session.
```
```
As a user,
So that I can choose the length of the session, 
I would like to set the number of sprints.
```
```
As a user, 
So that I can choose how long each cycle is, 
I would like to set the time for the cycle.
```
```
As a user,
So that I can have a break between sprints,
I would like to set the time for breaks.
```
```
As a user, 
So that I set a goal, for each cycle,
I would like to write goals for each cycle.
```
```
As a user, 
So that I know what I am doing,
I would like to be able to write my process for each cycle.
```
```
As a user,
So that I can aknowledge any blockers,
I would like to write down blockers for each cycle.
```
```
As a user,
So that I can track my energy and morale,
I would like to be able to note my energy and morale levels.
```
```
As a user,
So that I know how I have done in the cycle,
I would like to track if I have completed or not the cycle.
```
```
As a user,
So that I can record anything memorable,
I would like to write anything noteworthy.
```
```
As a user,
So that I can improve the next cycle,
I would like to write down improvement pointers.
```
```
As a user,
So that I can note down issues encountered,
I would like to be able to write down issues.
```
```
As a user,
So that I can record my progress,
I would like to save the sessions.
```
```
As a user,
So that I can share my progress,
I would like to be able to share my sessions with others.
```
```
As a user,
So that I can reflect on my work,
I would like to have a debrief page with:
  - What did I get done?
  - What issues I have encountered?
  - What went well?
  - Anything else?
```
```
As a user,
So that I have an overall goal,
I would like to have a page with:
  - What are my goals?
  - Is this concrete/measurable or subjective/ambiguous?
  - How will I know it is complete?
  - Anything else?
``` 
```
As a user,
So that I can time my cycles,
I would like to have a timer on the page.
```
```
As a user,
So that I can remove all distractions,
I would like to be able to have background noises.
```
## Mock-up 

![New Wireframe 1](https://user-images.githubusercontent.com/80968551/144890947-5564dc54-55b0-4413-964a-b6146674e070.png)

## Database
1. docker run --name postgres-db -e POSTGRES_PASSWORD=docker -p 5433:5432 -d postgres
2. docker exec -it postgres-db psql -U postgres 
3. CREATE DATABASE timecycle;
- some changes in the model and migration file will require RESET DATABASE timecycle;, followed by creating the database again.
