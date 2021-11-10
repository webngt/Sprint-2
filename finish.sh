#!/bin/sh

msg=$(mvn test)

jq -M -c -n --arg mvn_out "$msg" '{$mvn_out}'

