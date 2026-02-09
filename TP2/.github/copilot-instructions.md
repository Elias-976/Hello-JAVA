Project-specific Copilot instructions
====================================

These instructions help an AI coding agent become productive in this small Java teaching repository.

Quick context
- **Purpose:** A collection of small Java examples demonstrating primitives, casting, methods, and a deliberate bug for debugging practice.
- **Key files:** [Main.java](Main.java), [Methodes.java](Methodes.java), [debogueur.java](debogueur.java)

What to know before editing
- There is no build system (no Maven/Gradle). Use `javac` and `java` from the workspace root. Example: `javac *.java` then `java Main`.
- The repo contains multiple classes named `Main` ([Main.java](Main.java) and [debogueur.java](debogueur.java)). Avoid compiling both at once into the same package if you intend to run a specific `Main` — rename or compile/run a single file: `javac Main.java` then `java Main`.
- The code is educational: many methods are `static` utilities (see `Methodes` class). Follow existing style: short, imperative method names (`carre`, `estPair`, `afficherParite`).

Patterns and gotchas
- Primitive casting and overflow: the examples intentionally cast between `int`, `byte`, and `double`. Watch for overflow (see `Main.java` and `Methodes.ajout`).
- Print-based debugging is the project's default. The file [debogueur.java](debogueur.java) contains an intentionally wrong average calculation: `return somme / t.length;` (integer division) — prefer producing a `double` result.
- Methods return primitive types and print messages directly; prefer preserving side-effect style when modifying examples unless adding unit tests.

Developer workflows (commands)
- Compile all examples: `javac *.java`
- Compile-and-run a specific example: `javac debogueur.java && java debogueur` or `javac Methodes.java && java Methodes` (rename `Main` classes if conflicts occur).
- Run with debugging prints: add `System.out.println(...)` near suspect calculations (consistent with project convention).

How Copilot/agents should contribute
- Keep changes minimal and stylistically consistent: short methods, `static` helpers, and direct `System.out` output.
- When fixing bugs, add a short comment and a unit test only if the test harness is added by the author — otherwise modify the example and update the printed output.
- Do not introduce external build tools or frameworks without explicit instruction from the maintainer.

Files to reference when implementing changes
- [Methodes.java](Methodes.java) — shows utility methods and common idioms.
- [Main.java](Main.java) — demonstrates casting and overflow examples.
- [debogueur.java](debogueur.java) — contains the deliberate bug and a simple array-processing pattern.

Request for clarification
- If you need a preferred canonical `Main` to keep, ask whether to (A) rename `debogueur.java` to `Debogueur.java` and change its class, or (B) remove/merge duplicate `Main` classes.

If anything here is unclear or you want a different tone (more strict linting, add tests, adopt Maven), tell me which direction to take.
