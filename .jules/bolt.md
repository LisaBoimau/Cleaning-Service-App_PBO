## 2024-03-20 - [Offload Collections to DB]
**Learning:** [Codebase Anti-pattern: Avoid loading entire collections into memory for filtering, sorting, or simple aggregations (e.g., using Java Streams on large lists like in OrderService). ]
**Action:** [Prefer offloading these operations to the database via Spring Data JPA derived queries or custom @Query with aggregate functions.]