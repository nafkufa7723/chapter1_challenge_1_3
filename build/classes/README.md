** Challenge 1.3: The Dungeon Game
** Description

This project is a text-based dungeon adventure game. The player starts with 100 health points and must survive 5 rooms.

Each room contains a random event:

Trap — health decreases by 20.

Healing Potion — health increases by 15 (cannot exceed 100).

Monster — player must guess a number (1–5) to defeat it.

The game uses for loops, switch statements, do-while loops, and Random numbers to simulate adventure and chance. If the player’s health reaches 0, the game ends immediately; surviving all rooms results in victory.
** Example Input / Output
**  Example Run 1: Player Wins
Entering room 1...
You found a healing potion! You gain 15 health.
Health exceeded 100 -> capped to 100.

Entering room 2...
A monster appears! Guess a number (1-5) to defeat it!
Enter your guess: 3
Wrong! Try again.
Enter your guess: 1
You defeated the monster!

Entering room 3...
A trap sprung! You lost 20 health!
Health is now 80.

Entering room 4...
You found a healing potion! You gain 15 health.
Health is now 95.

Entering room 5...
A monster appears! Guess a number (1-5) to defeat it!
Enter your guess: 2
You defeated the monster!

You cleared the dungeon! Victorious with 95 health!
** Example Run 2: Player loses
Entering room 1...
A trap sprung! You lost 20 health!
Health is now 80.

Entering room 2...
A trap sprung! You lost 20 health!
Health is now 60.

Entering room 3...
A trap sprung! You lost 20 health!
Health is now 40.

Entering room 4...
A trap sprung! You lost 20 health!
Health is now 20.

Entering room 5...
A trap sprung! You lost 20 health!
Health is now 0.

You have been defeated in room 5.
** Reflection
** What I Learned:

Using for loops to navigate multiple rooms.

Handling random events using switch statements.

Repeating actions with do-while loops for monster guessing.

Controlling game flow with break statements when health ≤ 0.

Combining Random and Scanner for interactive gameplay.

** What Was Difficult:

Ensuring health never exceeds 100 after healing.

Designing the guessing loop to repeat until the correct number is chosen.

Properly handling early game termination when health drops to 0.
