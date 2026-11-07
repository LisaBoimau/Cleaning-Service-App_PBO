## 2024-05-24 - Database Aggregation over Application Streams
**Learning:** Using Java Streams to sort or aggregate large collections (like finding max rating or average rating) is an anti-pattern. Entire collections are loaded into memory, causing severe performance bottlenecks.
**Action:** Always prefer offloading sorting and aggregation to the database using Spring Data JPA derived queries (e.g., `findFirstBy...OrderBy...`) or custom `@Query` with aggregate functions.
