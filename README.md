# Online-Auction

Implement a solution to the following problem using the latest released version of Java. Your project should include unit tests using the open source JUnit framework. The program should include object-oriented API and should not include a user interface of any kind. There is no need to provide any form of data persistence. For the purposes of this exercise you can assume that the API will only be called in a single-threaded environment.

We are looking for clean, well-factored code that has accompanying JUnit tests.

Here are the requirements:

Consider a new and different computerized auction site where a seller can offer an item up for sale and people can bid against each other to buy the item. The company building this site has asked you to come up with the algorithm to automatically determine the winning bid after all bidders have entered their information on the site. Your API will be integrated into the site by other developers working on the project.

The site will allow each bidder to enter three parameters:

Starting bid - The first and lowest bid the buyer is willing to offer for the item.

Max bid - This maximum amount the bidder is willing to pay for the item.

Auto-increment amount - A dollar amount that the computer algorithm will add to the bidder's current bid each time the bidder is in a losing position relative to the other bidders. The algorithm should never let the current bid exceed the Max bid. The algorithm should only allow increments of the exact auto-increment amount.

Here is the data to use for your testing. In each case the algorithm should determine the winning bidder and the amount of the winning bid. The bidders are listed in the order they entered their information on the site. If there is a tie between two or more bidders, the first person that entered their information wins. The amount of the winner's bid should be the lowest amount possible (given all the previous rules) that will win the auction.


		Auction One -
Record player	Auction Two -
Snow shoes	Auction Three -
Piano
				
Bidder: Linda				
	Starting bid	$170	$30	$20,000
	Max bid	$240	$70	$65,000
	Auto-increment amount	$3	$4	$2,000
				
Bidder: Dave				
	Starting bid	$160	$30	$10,000
	Max bid	$243	$70	$70,000
	Auto-increment amount	$7	$3	$15,000
				
Bidder: Eric				
	Starting bid	$190	$40	$22,000
	Max bid	$240	$90	$70,000
	Auto-increment amount	$4	$2	$8,000

Finally, when completing this assignment please keep the following values in mind:
1.	Self-documenting code
2.	Immutability
3.	Readability
4.	Simplicity
