# WAR Card Game in Java

My Java implementation of the classic card game **WAR**. This was my first Java project and a perfect introduction to the language, OOP, data structures, etc... . I did not use any AI to code this as I wanted to properly learn the language + it's a million times more fun to code without it and I recommend you to do the same.

TODO: tests, GUI?

---

## 🎯 **Project Overview**

WAR is a simple card game played between two players. The game begins by splitting a shuffled deck into two equal parts. Players reveal the top card of their decks each round, and the higher card wins the round, collecting the cards played. If two cards tie in value, a "WAR" occurs where both players place one card face down and then play their next card. The player who collects all the cards wins!

---

## 📂 **Code Structure**

- **`Main`**: Entry point of the application. Initializes the game and drives gameplay.
- **`Card`**: Represents a single playing card with suit and rank.
- **`Deck`**: Manages a collection of cards with operations like shuffle, split, and draw.
- **`Game`**: Handles the core gameplay, including rounds, wars, and determining the winner.

---

## 🖥️ **How to Run**

1. **Prerequisites**: Ensure you have the Java Development Kit (JDK) installed.
2. **Clone the Repository**:
   ```bash
   git clone https://github.com/arthur-wronski/WAR.git
   cd war-card-game-java
   ```
3. **Compile the Code**:
   ```bash
   javac Main.java
   ```
4. **Run the Game**:
   ```bash
   java Main
   ```

---

## 📘 **Learn Java with WAR**

This project is an ideal introduction to Java for beginners, as it covers:

- **Data Structures**: Lists and collections for managing cards.
- **Control Flow**: Loops, conditionals, and recursion for game mechanics.
- **OOP**: Practical examples of classes, methods, and encapsulation.

---

## 🎥 **Future Plans**

I plan to make a YouTube video introducing Java and giving a thorough follow-through of my implementation of the War card game as I thought it was super helpful
