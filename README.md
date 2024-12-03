# De Zeus Advent of Code

| Wie?      | Waar? (Repository)                    | Taal? |
|-----------|---------------------------------------|------:|
| vincent   | https://github.com/Topvennie/AoC      |    Go |
| jnms      | https://github.com/Reavershark/aoc24  |     D |
| redfast00 | https://github.com/redfast00/aoc2024  |  Rust |
| chvp      | https://github.com/chvp/aoc2024       |   SQL |
| michiel   | https://github.com/milachae/aoc2024   |  Rust |
| francis   | https://github.com/fbegyn/aoc2024     |    Go |
| hannes    | https://github.com/hannes-dev/aoc2024 |  Uiua |


* repo clonen:

    ```sh
    git clone git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    git submodule init 2024 # just the current year
    git submodule update
    ```

* nieuwe persoon toevoegen:

    ```sh
    cd 2024
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
    cd 2024
    ./complete-benchmark
    ```
