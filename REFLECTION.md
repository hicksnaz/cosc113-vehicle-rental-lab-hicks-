## Reflection

1. Why should the fields be private?

Private fields keep data safe: only the class can modify it directly. Other code has to go through getters and setters, which means validation rules (like no negative speed, only 2 or 4 doors, battery between 0 and 100) always work. This also means you can change how the class works inside without breaking other code that uses it.

2. What happens if the Car constructor does not call super(...)?

When you create a Car object, Java automatically adds a call to super() with no arguments. But Vehicle doesn't have a no-argument constructor—it only has Vehicle(String, int). This causes a compilation error. To fix this, Car needs to explicitly call super(brand, year) to match the parent class constructor.

3. What is the difference between this.type and super.type?

this.type is the variable declared in the current class (Car → "Car"); super.type is the hidden variable from the parent (Vehicle → "Vehicle"). Both exist in the object, and super.type lets the child reach the one it hides.
