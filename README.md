# De Zeus Advent of Code

| Wie?     | Waar? (Repository)                            |              Taal? |
|:---------|:---------------------------------------------:|-------------------:|
| chvp     | https://github.com/chvp/aoc2022               |            Haskell |
| hvdncamp | https://github.com/hvdncamp/adventofcode-2022 |                  C |
| mcbloch  | https://gitlab.com/mcbloch/aoc2022            | Clojure (Babashka) |
| fbegyn   | https://github.com/fbegyn/aoc2022             |            Go/Ruby |
| Mraedis  | https://github.com/Mraedis/AoC2022            |               Ruby |
| silvius  | https://github.com/ajuvercr/advent-of-code    |               Rust |


* repo clonen:

    ```sh
    git clone git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    git submodule init 2022 # just the current year
    git submodule update
    ```

* nieuwe persoon toevoegen:

    ```sh
    cd 2022
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
    cd 2022
    ./complete-benchmark
    ```
