# ser316-spring2022-B-olipunov-lab5
YouTube:
GitHub: https://github.com/olipunov/ser316-spring2022-B-olipunov-lab5.git

CheckStyle: 0 issues
SpotBugs: 0 issues
Jacoco: Over 90% (70% is minimum requirement for this assignment) coverage excluding main

I chose Option B, where code uses Design Patterns being Intertwined 

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
5). Battle is a tick base.

I  implemented Decorator design pattern to help with adding on class benefits to the player and then adding type banefits to player as well. Enemies use the same structure when they are generated.

Then, I  implemented Singleton to represent Battle , SHop , and Money. Each of those classes are required to have a single instance. This was a perfect solution for my needs. 
It's perfect for this case, we only need a single shop, shingle battle, and single money class for our RPG game.

Lastly, I will implement Mediator pattern to implement the interactions between two or more classes. Such as when player and enmy fight, or when player and shop instance interact, it also is responsible for 
logic in those instances, such as what happens when lvl this lvl and player join in Battle. 


Requerement Fulfield.
Completed Requirements:
You must be able to choose a class for your character (or have it assigned randomly),
each class has a different subset of skills or magic. A class would constitute something
along the lines of ’fighter’, ’mage’, ’thief’, get creative with it!
You should be able to choose a type for your character (or have it assigned randomly),
each race should have one passive skill that gets better after leveling up or that gives
them advantage over another. rate A type would constitute something like, ’orc’,
’elf’, ’dwarf’, ’human’. Perhaps orcs are stronger naturally, perhaps elves are the
most nimble and can dodge better, maybe humans have less HP but gain exp at a
faster, get creative with it!
You should encounter a randomly generated ’small’ enemy every floor, a ’medium’
enemy every 5 floors, and a ’BOSS’ every 10 floors.
All enemies should get harder for each floor you travel to, for example, an enemy on
floor 2 should be much, much weaker than an enemy on floor 48!
After each battle you should have a small chance to find a chest that
Your character should have at minimum:
– Stats: Attack, Health, Mana/Other Resource such as cooldown, Defense, and
speed. Others can be added.
– Should have at least 1 skill or magic power they can use
– Physical attacks should have a chance to critically strike (double damage)
– All attacks should have a chance to fail/miss
– Attacks should deal a min damage of 1
Attacks and item usage should happen in a turn based fashion, the participant
with the highest speed should go first.
If you lose to a regular enemy you go back to the first floor.
If you lose to a boss you lose the game.
Enemies get harder each lvl.
The combat in the game is turn base.
The end goal of the game is to beat the final boss (lvl 100).
The shop should sell 3 random objects.
After each floor win you go up to the next floor
You gain experience from wining battles
Fighting is a tick base.
