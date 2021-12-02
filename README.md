# De Zeus Advent of Code

| Wie?           | Waar? (Repository)                                 | Taal?       |
| :------------- | :------------------------------------------------: | ---------:  |
| chvp           | https://github.com/chvp/aoc2021                    | forth       |
| ninewise       | https://git.fuyu.moe/ninewise/adventofcode-2021    | lua         |
| robbe          | git@github.com:Robbe7730/adventofcode2021.git      | ?           |
| Flynn          | https://gitlab.com/mcbloch/aoc2021                 | Cpp         |
| Silvius        | https://github.com/ajuvercr/aoc-2021               | C           |
| rien           | https://github.com/rien/adventofcode2021           | C (no std)  |
| iasoon         | https://github.com/iasoon/aoc2021                  | pony        |
| Bond-009       | https://github.com/Bond-009/advent-of-code-2021    | Rust        |
| Timpy          | https://github.com/timodw/aoc_2021                 | Python/Numpy|
| Swambino       | https://github.com/AWerbrouck/AoC                  | py & haskell|
| Francis.       | https://github.com/FKD13/AoC2021.git               | Prolog      |
| Lox            | https://github.com/Silox/2021-advent-of-code.git   | Ruby        |
| beardhatcode   | https://github.com/beardhatcode/aoc-2021           | Rust        |
| redfast00      | https://github.com/redfast00/aoc2021               | Python      |
| Jasper 2.0     | https://github.com/JasperJanin/advent-of-code-2021 | Kotlin      |
| jaspervdj      | https://github.com/jaspervdj/advent-of-code        | Haskell     |


* repo clonen:

    ```sh
    git clone git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    git submodule init 2021 # just the current year
    git submodule update
    ```

* nieuwe persoon toevoegen:

    ```sh
    cd 2021
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
    cd 2021
    ./complete-benchmark
    ```
