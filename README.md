# De Zeus Advent of Code

| Wie? | Waar? (Repository)              | Taal? |
|:-----|:-------------------------------:|------:|
| chvp | https://github.com/chvp/aoc2023 |     C |
| mcbloch | https://github.com/mcbloch/AoC2023 | V |
| timpy | https://github.com/timodw/aoc_2023 | Rust |
| robbe | https://github.com/Robbe7730/adventofcode2023 | Zig |
| francis. | https://github.com/FKD13/AoC2023 | bash |
| vincent | https://github.com/Topvennie/AoC2023 | Go |


* repo clonen:

    ```sh
    git clone git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    git submodule init 2023 # just the current year
    git submodule update
    ```

* nieuwe persoon toevoegen:

    ```sh
    cd 2023
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
    cd 2023
    ./complete-benchmark
    ```
