#!/bin/sh

msg=$(mvn test)

jq -M -c -n --arg out "$msg" '{$out}'

