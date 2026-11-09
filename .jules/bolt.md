## 2026-11-09 - [N+1 Stream Operations in OrderService]
**Learning:** Loading entire collections into memory for simple aggregations causes significant overhead.
**Action:** Offload these operations to the database using custom @Query.
