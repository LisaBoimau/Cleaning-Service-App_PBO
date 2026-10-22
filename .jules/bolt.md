
## 2026-10-22 - Optimize Fallback Worker Selection in OrderService
**Learning:** Found an N+1/memory bottleneck in `OrderService.java` where selecting a fallback worker (highest rating) loaded all available workers into application memory and used Java streams to find the max rating.
**Action:** Replaced in-memory streaming with a database-level query `findFirstByStatusOrderByRatingDesc` in `PekerjaRepository` to push sorting and limiting down to the database, saving significant memory as the worker table grows.
