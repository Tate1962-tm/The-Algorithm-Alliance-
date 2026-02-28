# The-Algorithm-Alliance-
**CS3354 OOP Project**
MEMBER(S)
**TATENDA MACHIRORI** 

DETAILS

# Task Tracker

Hi! This is my Task Tracker project for CS3354 Module 2 — Encapsulation.  
I built a simple to-do list application in Java that lets you add tasks, mark them as completed, list what's still pending, and delete tasks when they're no longer needed. I also added a couple of extra methods that I thought would be useful.

## Classes

### Task.java
This class represents one single to-do item.

**What it stores (private instance variables):**
- `private String description` — the text of the task (e.g., "Finish Module 2 slides")
- `private boolean completed` — starts as `false`, becomes `true` when done

**Public methods I made available:**
- `Task(String description)` — constructor to create a new task
- `getDescription()` — returns the task text
- `isCompleted()` — tells you if it's finished
- `markCompleted()` — changes the status to completed

I kept everything else private so the details are hidden (encapsulation!).

### TaskTracker.java
This is the main class that manages all my tasks. It acts like the "to-do list manager."

**What it stores (private instance variable):**
- `private List<Task> tasks` — an ArrayList that holds all the Task objects

**Public methods:**
- `TaskTracker()` — constructor (starts with an empty list)
- `addTask(String description)` — creates a new Task and adds it to the list
- `markTaskCompleted(String description)` — finds the task with that exact description and marks it done
- `getPendingTasks()` — returns a List<String> of all unfinished task descriptions
- `deleteTask(String description)` — removes the matching task if it exists
- Extra ones I added because they seemed helpful:
  - `getCompletedTasks()` — returns descriptions of finished tasks
  - `getTaskCount()` — tells you how many tasks are in the list total

## Why I Designed It This Way
- I split it into two classes so each one has one clear job: `Task` handles a single item, `TaskTracker` handles the whole collection.
- Everything important is private — you can only interact through the public methods, which follows the encapsulation ideas from the M2-2 slides and the GitHub examples (like Employee + PayrollSystem).
- Using a separate `Task` class makes it easier to add features later (like due dates or priorities) without messing up the tracker.

If I had more time, I might add task IDs, sorting, or saving to a file — but this covers everything the assignment asked for.

Feel free to check out the code! I tested it with a few sample tasks in my IDE to make sure add/mark/delete/list all work as expected.
