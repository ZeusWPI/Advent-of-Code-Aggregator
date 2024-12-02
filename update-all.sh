#!/usr/bin/env bash
git pull
git submodule init 2024
git submodule update
git submodule foreach git fetch origin
git submodule foreach git reset --hard origin/HEAD
