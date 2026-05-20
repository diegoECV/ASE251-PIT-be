# Compose helpers

From this folder you can start and stop the database and backend using the included scripts.

Start (DB then backend):

```bash
./start-compose.sh
```

Stop and remove DB volumes (backend then DB):

```bash
./stop-compose.sh
```

Notes:
- The scripts expect `docker` and `docker compose` to be installed and available in PATH.
- By default the compose files use `MSSQL_SA_PASSWORD` environment variable; if not set the compose files fall back to `Diego1416`.
- `stop-compose.sh` removes the SQL Server volume to leave the database empty.
