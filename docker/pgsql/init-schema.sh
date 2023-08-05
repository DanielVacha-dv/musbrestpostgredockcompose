#!/bin/bash
echo " Init db start"
set -e;
##
PGPASSWORD="$POSTGRES_PASSWORD";

psql -U "${POSTGRES_USER}" <<EOSQL
    \c ${POSTGRES_USER};
    create schema ${POSTGRES_SCHEMA};
    alter schema ${POSTGRES_SCHEMA} owner to ${POSTGRES_USER};
EOSQL
echo " Init db end hopefully ok"