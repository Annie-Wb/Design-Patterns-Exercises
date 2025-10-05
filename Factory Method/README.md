# Problem: 

Create shapes without exposing concrete classes.

# Structure: 

| Role               | Java Class               |
| ------------------ | ------------------------ |
| Object interface   | `Shape`                    |
| Concrete Objects   | `Circle`, `Square`           |
| Factory interface  | `ShapeFactory`             |
| Concrete Factories | `CircleShape`, `SquareShape` |


# Tips: 

- Define `Shape` interface.
- Factory returns Shape.
