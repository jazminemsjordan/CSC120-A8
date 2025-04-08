Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?
- What worked, what didn't, what advice would you give someone taking this course in the future?

This assignment was honestly really fun! I liked the freedom of being able to choose which methods I wanted to overload. It gave me some creativity to try and decide what would be the most useful. I avoided overloading the constructor in most cases so I could have as much variety as possible.

House: I overloaded the constructor so a house can be made with just the building data, with some basic assumptions for hasDiningHall and hasElevator (new houses do not have dining halls, but are all accessible with elevators). I also overloaded the moveIn() method so it runs without a specific student in mind to create a new first year to move into the house.

Library: I overloaded the containsTitle() method to automatically call printCollection() if a title isn't specified as a parameter, and returning false (because we can't have a title that wasn't named). I also overloaded addTitle() to add a placeholder book when called without a parameter (also with a false return value, because the library doesn't actually have the fake title).

Cafe: This was my favorite to do. I overloaded both special cafe methods, sellCoffee() and restockCoffee(). If you call sellCoffee with no parameters, it defaults to an eight ounce cup with two sugar packets and two creams. The restock method has two additional options. You can call it with all three parameters as expected, or you can call it with just one, the number of cups, which will populate the other values based on the default coffee size. So restocking four cups wil bring thirty-two ounces of coffee, eight sugar packets, and eight creams. You can also restock with no parameters, which restocks the default values of 64, 16, 16, and 8. 