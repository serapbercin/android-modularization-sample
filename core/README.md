## Core Module

- The :core module is providing the sharable code across the application and expensive objects for the many features that require it.
- It holds common code like extensions, helpers.
- Core component lives on the application scope, this is why created core component as @Singleton Scope via Dagger2