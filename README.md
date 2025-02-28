## Problem description:

Model the relationship between and interface Sport and the records Billiards and Tennis.

The Billiards interface should have one abstract method players, which should return an ArrayList of type String.

Billiards and Tennis should both implement the interface. They should both accept the parameter players. Billiards should accept an additional parameter variation of type String.

Add a method to Billiard called getNumBalls which takes no parameters and returns a String. The method should function as follows:
- If variation is "8-Ball" return a message stating it requires 15 numbered balls plus 1 cue ball.
- If variation is "9-Ball" return a message stating it requires 9 numbered balls plus 1 cue ball.
- Else return a message stating the variation was unrecognized.

Override the toString of both records. Billiards should return a message listing the variation and players. Tennis should return a message listing the players.

Write a Tester class where you will create two ArrayLists and add different number of players to each by name.

Instantiate a Billiard object and pass in a variation and one of the ArrayLists of player names.
Instantiate a Tennis object and pass in the other ArrayList of player names.

Print the results of the numBalls method and each toString.

Create an ArrayList of Sport objects and add your two Billiard and Tennis objects.

Finally, add a public static method inside your Tester class called countTotalPlayers that returns an int and accepts an ArrayList of Sport. The method should count and return the total number of players in your Billiards and Tennis objects. Print the results in main.

### Sample output:
<br>>8-Ball requires 15 numbered balls plus 1 cue ball.
<br>>Variation: [8-Ball] , Billiards players: [Dan, Dylan, Jason, Kaitlin]
<br>>Tennis players: [Venus, Serena]
<br>>Total players: 6