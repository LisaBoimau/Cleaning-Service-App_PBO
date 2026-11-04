## 2024-05-18 - [Database Offloading for Memory Efficiency]
**Learning:** Java Streams for aggregation and sorting over large datasets in memory cause critical performance bottlenecks (N+1-like memory issues), a notable codebase anti-pattern in `OrderService`.
**Action:** Use Spring Data JPA derived queries and custom `@Query` (like `findFirstByStatusOrderByRatingDesc` and `AVG()`) to offload these operations to the database instead of loading everything into memory.
