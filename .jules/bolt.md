## 2024-11-06 - [Offloading memory-intensive Java Streams to DB queries]
**Learning:** [The codebase originally used in-memory Java stream `.average()` and `.max()` over `findAll()` or equivalent large list retrieves in `OrderService` which creates a huge overhead.]
**Action:** [Use derived queries like `findFirstByStatusOrderByRatingDesc` or `@Query("SELECT AVG(o.nilaiRating) FROM Order o WHERE o.pekerja.id = :pekerjaId AND o.nilaiRating > 0")` to push processing to the database layer directly.]
