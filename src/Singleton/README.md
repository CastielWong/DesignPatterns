
The classical way to implement Singleton is _lazy instantiazed_ since the unique instance would be only instantiazed when `getInstance()` is called.

There are three ways to avoid multiple instances caused by multi-threading:
- thread-safe: apply `sychronized` directly in `getInstance()`
- eagerly: create the instance immediately
- double-checked locking: use `volatile` and apply `synchronized` inside the method
