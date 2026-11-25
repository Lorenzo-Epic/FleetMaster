# FleetMaster

**Group Members:**
- Jehan
- Reka
- JP
- Lorenzo


**Technologies:**
- Frontend: HTML, CSS, TypeScript (maybe React?)
- Backend: Java, Spring/Spring Boot
- Database: PostgreSQL
- Container: Docker
- Java Build System: Maven
- Java Build: 21
- Spring Boot Version: 4.2.0 (nice)

**Common Errors:**
- If IntelliJ cannot resolve Spring Boot dependencies and Maven reload fails, the issue may be incompatibility between IntelliJ and Maven 3.10.x. Fix: Go to Settings -> Build, Execution, Deployment -> Build Tools -> Maven, change Maven home path from Use Maven Wrapper to Bundled (Maven 3) (preferably 3.9.x), then reload all Maven projects.


## Running with Docker

From the repository root, start the application:

```bash
docker compose up --build
```

Open http://localhost:8081/welcome.

To stop and remove the containers, run from the repository root:

```bash
docker compose down
```

PostgreSQL 16 stores its data in the Docker named volume `postgres_data`, which
survives `docker compose down`. Adding `--volumes` deletes that database data.

## Secrets

In repository root, create a directory named `.secrets`.
In that directory, create a file 'postgres_password.txt'.
In that file, put a password for the database
