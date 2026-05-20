#!/usr/bin/env bash
set -euo pipefail

# Stops backend first, then DB; removes DB volumes to clean data.
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

echo "Stopping backend (be)..."
docker compose -f "$DIR/docker-compose-be.yml" down

echo "Stopping DB and removing volumes (db)..."
docker compose -f "$DIR/docker-compose-db.yml" down -v

echo "Services stopped and DB volumes removed."
