## 2023-10-29 - [Optimizing worker selection logic]
**Learning:** Found a common anti-pattern where an entire dataset is loaded into memory to perform sorting and filtering using Java Streams (`pekerjaRepository.findByStatus("available").stream().max(...)`). This could cause major memory pressure when the number of available workers grows.
**Action:** Replaced in-memory stream processing with database-level derived queries (`findTopByStatusOrderByRatingDesc`), limiting data transfer and memory footprint significantly.
