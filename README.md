# De Zeus Advent of Code

| Wie?           | Waar? (Repository)                                | Taal?      |
| :------------- | :-----------------------------------------------: | ---------: |
| Lukas          | https://github.com/lvrossem/Advent-of-Code-2020   | Rust       |
| Flynn          | https://gitlab.com/mcbloch/aoc2020                | Elixir     |
| Rien           | https://github.com/rien/adventofcode2020          | Elixir     |
| Robbe          | https://github.com/Robbe7730/advent_of_code_2020  | Rust       |
| Francis        | https://github.com/fbegyn/aoc2020                 | Go         |
| Timo           | https://github.com/timodw/AoC20                   | Rust       |
| Kobe           | https://github.com/SchrodingersCat00/aoc2020      | Haskell    |
| Jasper         | https://github.com/jaspervdj/advent-of-code       | Haskell    |
| Lorin          | https://github.com/werthen/AoC-2020               | TensorFlow |
| Felix          | https://github.com/ninewise/adventofcode-2020     | Shell      |
| Francis.       | https://github.com/FKD13/AoC2020                  | Erlang     |
| Mel            | https://gitlab.com/Melsarion/adventofcode2020     | Elixir     |
| Poef           | https://github.com/Iepoev/AoC20                   | Elixir     |
| Lode           | https://gitlab.com/Bond_009/advent-of-code-2020   | C          |
| JP             | https://github.com/Jan-PieterBaert/advent-of-code | Rust       |
| Niko           | https://github.com/niknetniko/AdventOfCode        | Elixir     |
| Silvius        | https://github.com/ajuvercr/aoc_2020              | Haskell    |
| Bram           | https://github.com/bravdwal/aoc2020               | Perl       |
| redfast00      | https://github.com/redfast00/aoc2020              | Python     |
| Charlotte      | https://github.com/charvp/aoc2020                 | Nix        |
| Arthur/Swomp   | https://github.com/AWerbrouck/AOC2020             | Java       |


* repo clonen:

    ```sh
    git clone --recursive git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    ```

* nieuwe toevoegen:

    ```sh
    git submodule add <link zoals in tabel> <naam zoals in tabel>
    git commit -m 'hey guys ik heb een repo toegevoegd'
    ```

* uw lokale kopie updaten:

    ```sh
    git pull # duh
    git submodule update
    ```

* van alle submodules de nieuwste versie binnenhalen (zelfs als mensen *force push*en):

    ```sh
    git submodule foreach git fetch origin
    git submodule foreach git reset --hard origin/HEAD > /dev/null 2>&1
    git add * # oh no
    git commit -m 'update submodules'
    ```

* benchmarks uitvoeren:

    ```sh
    git submodule foreach ../benchmark <day> <part>
    ```
