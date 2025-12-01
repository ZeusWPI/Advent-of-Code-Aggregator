{
  description = "Zeus AoC 2025";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem(system:
      let
        pkgs = import nixpkgs { inherit system; };
      in
      {
        devShell = pkgs.mkShell {
          name = "Advent of Code 2024";
          packages = [
            pkgs.hyperfine
            pkgs.postgresql_14
            pkgs.ldc
            pkgs.go
            pkgs.dub
            pkgs.zig
          ];

        };
      }
    );
}
