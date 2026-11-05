## 2024-03-24 - Database Aggregation over In-Memory Streams
**Learning:** Found classic anti-pattern where entire collections (like all available workers, or all orders for a worker) are loaded into memory just to perform simple sorting (highest rating) or aggregation (average rating) using Java Streams. This scales very poorly.
**Action:** Replace in-memory Java Stream operations (e.g., `.max()`, `.average()`) with Spring Data JPA derived queries (`findTopBy...OrderBy...Desc`) and JPQL aggregate functions (`SELECT AVG(...) FROM ...`) to offload the work to the database.
