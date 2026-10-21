## 2026-10-21 - Pushing Sorting and Limits to the Database
**Learning:** Loading full result sets (like all 'available' workers) into memory just to find the max/top item using Java Streams scales poorly. As the database grows, this causes massive memory overhead and slower response times.
**Action:** Always prefer Spring Data JPA methods like `findFirstBy[Condition]OrderBy[Field][Asc/Desc]` for Top-N queries to ensure filtering, sorting, and limits are handled optimally by the database.
