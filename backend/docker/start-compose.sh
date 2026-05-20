#!/usr/bin/env bash
set -euo pipefail

# Starts the DB service first, then the backend service (builds backend image).
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

echo "Starting SQL Server (db)..."
docker compose -f "$DIR/docker-compose-db.yml" up -d

echo "Waiting for DB to initialize (5s)..."
sleep 5

echo "Starting backend (be)..."
docker compose -f "$DIR/docker-compose-be.yml" up -d --build

echo "Services started."
