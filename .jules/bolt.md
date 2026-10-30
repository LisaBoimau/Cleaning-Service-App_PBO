
## 2024-05-24 - Avoid Memory Aggregation using Java Streams
**Learning:** Found an anti-pattern in the codebase where Java Streams were being used to sort, filter, and aggregate large collections (like `Order` and `Pekerja` lists) in memory. This would cause memory issues and N+1 problems on scale.
**Action:** Always offload these operations to the database via Spring Data JPA derived queries (e.g. `findFirstByStatusOrderByRatingDesc`) or custom `@Query` with aggregate functions (`AVG`).
