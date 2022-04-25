# ser316-spring2022-B-olipunov-lab5
YouTube:
GitHub:

I chose Option B, where code uses Design Patterns being Intertwined 

Place holder for lab 5

Short Summary of Design Patterns.

Decorator:
Classes: Player, PlayerType, Hunter, Paladin, Rouge, Warlock, Elf, Human, Troll, Undead
1). Responsible for adding classes to player base.
2). Responsible for adding race type to the Player Type base.
3). Responsible for adding enemies their types, and their race.

Singleton:
Class: Battle, Shop, Money
1). Responsible for Battle class randomly generating enemy on every floor.
3). Responsible for Shop Class.
4). Responsible for Money Class.

Mediator:
1). Defines battle object that dictates how player and enemy interact.
2). Responsible for randomly generating enemy on every floor.
3). Responsible for keeping track of lvl to present with enemy, mid enemy, or boss.
4). Responsible for generating a small change of dropping a golden chest.

I will implement Facade design pattern to help with interface to a complex program. This will be a Section between the user and the complex algorithmic code.

Then, I will impement Factory or an Abstract Factory to create objects that are similar in nature and that need a multipy of in the program. Like enemy units.

Lastly, I will implement Singleton pattern to implement the player who will go through the game. Its perfect for this case, we only need a single player for our RPG game.

There are many more interesting design patters that look very appealing. I might also use decorator for enemies, choosing their classes/attacks. 
