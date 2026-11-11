## 2024-05-24 - Database Aggregation over Memory Filtering
**Learning:** The codebase was loading entire order collections into memory just to calculate averages (`OrderService.berikanRating`), and sorting all available workers in memory to find the highest-rated one (`OrderService.buatOrder`). This is highly inefficient on large datasets and breaks down quickly.
**Action:** Use Spring Data JPA's custom `@Query` with aggregation functions (e.g. `AVG()`) or derived queries (`findFirstBy...OrderBy...Desc`) to offload computation to the database instead of doing it in Java memory.
