# De Zeus Advent of Code

| Wie?           | Waar? (Repository)                                | Taal?      |
| :------------- | :-----------------------------------------------: | ---------: |
| chvp           | https://github.com/chvp/aoc2021                   | forth      |
| ninewise       | https://git.fuyu.moe/ninewise/adventofcode-2021   | lua        |
| robbe          | git@github.com:Robbe7730/adventofcode2021.git     | ?          |
| Flynn          | https://gitlab.com/mcbloch/aoc2021                | ?          |
| Silvius        | https://github.com/ajuvercr/aoc-2021              | C          |

* repo clonen:

    ```sh
    git clone --recursive git@github.com:ZeusWPI/Advent-of-Code-Aggregator.git
    ```

* nieuwe persoon toevoegen:

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
    cd "2021"
    ./complete-benchmark
    ```
