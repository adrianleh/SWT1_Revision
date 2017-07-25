#!/bin/bash -e
mkdir -p _build
cd tex
for f in *.tex; do
    latexmk -outdir=../_build/ -interaction=nonstopmode -pdf $f
done


