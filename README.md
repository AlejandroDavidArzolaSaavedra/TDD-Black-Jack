<h1 align="center">Blackjack Game 🎲</h1>
<p align="center">
   <img width="600px" src="https://github.com/AlejandroDavidArzolaSaavedra/TDD-Black-Jack/assets/90756437/69e92576-aaae-4a2f-ac7c-656edb4b1bd9"/>
</p>

## Overview 📚

This project is a simple implementation of a Blackjack game in Java, following a Test-Driven Development (TDD) approach. The game consists of a set of classes representing cards, players, and the game logic itself.

## Project Structure 📂

The project structure follows Maven conventions and consists of the following main components:

- **`src/main/java/alejandro/arzola/saavedra/david/blackjack`**: Contains the source code for the Blackjack game.
- **`src/test/java/alejandro/arzola/saavedra/david/blackjack`**: Contains the test cases for the Blackjack game.

## How to Build 🛠️

This project uses Maven as a build tool. To build the project, you can use the following Maven command:

```bash
mvn clean install
```

This will compile the source code, run the tests, and package the application into a JAR file.

## How to Run ▶️

As the project is a library for a Blackjack game, there is no standalone application. You can, however, use the classes provided in the `src/test/java` directory to create your own Blackjack game scenarios.

## Testing 🧪

The project includes a set of JUnit tests located in the `src/test/java` directory. These tests cover various aspects of the Blackjack game logic, including determining winners, calculating the sum of bets, and handling special card combinations.

To run the tests, you can use the following Maven command:

```bash
mvn test
```

## Classes Overview 🃏

- **`Blackjack`**: Represents the main Blackjack game logic, including methods for determining winners, checking for Blackjack, and calculating the sum of bets.
- **`Card`**: An abstract class representing a generic playing card.
- **`Ace`**: A class representing an Ace card with methods to get its value.
- **`Croupier`**: Placeholder class for the Croupier, which could be extended in the future.
- **`FigureCard`**: A class representing a face card (Jack, Queen, King) with methods to get its value.
- **`PipCard`**: A class representing a pip card (numbered card) with methods to get its value.
- **`Player`**: Represents a player in the Blackjack game, including their name, bet, and methods to add cards to their bet.

## Sample Tests 🎮

The `BlackjackTest` class in the `src/test/java` directory contains sample tests for various scenarios, including determining winners based on card values and checking for special combinations like Blackjack.


## Getting Started

1. Clone this repository:

   ```bash
     git clone https://github.com/AlejandroDavidArzolaSaavedra/TDD-Black-Jack.git
   ```

2. Explore the dataset folders to understand the structure.

3. Use the data to train and test your models and contribute to this project.

# 🤝 Contributions
<img align="left" width="200" height="180" src="https://github.com/AlejandroDavidArzolaSaavedra/CNN-CT-BRAIN/assets/90756437/3bf833fa-828e-467c-89b8-0ea4a077d3ea"></a>
If you wish to contribute to this project, feel free to do so. You can open issues or send pull requests to improve the code or add new features. 

Your collaboration is welcome! 🚀


