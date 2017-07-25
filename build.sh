#!/bin/bash -e
mkdir -p _build
cd tex
for f in *.tex; do
    latexmk -outdir=../_output/ -interaction=nonstopmode -pdf $f
done


