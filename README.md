# Docker Installation Instructions

1. Install Docker Desktop and start it (wait until it says "running").

2. Open a terminal in the project folder (FleetMaster).

3. Start the app:
       docker compose up --build

4. Open the dashboard in your browser:
       http://localhost:8081

5. Stop the app (in a second terminal, or after Ctrl+C):
       docker compose down
       or simply stopping it in the app

> Notes
> - Keep "--build" so your latest code changes are included.
> - The database lives in the "db" folder on your PC, so it is kept
  after "docker compose down".
> - To run docker again use docker compose up, if you stopped it via the desktop app you can restart the container there