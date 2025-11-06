# ♻️ Java Design Patterns – Builder (Nivel2)

## 📄 Description
**Exercise:**  
In this project, we applied the **Builder design pattern** to simulate a **pizza creation system** where a chef constructs different pizzas (Hawaiian, Four Cheese, Veggie) step by step.  
The goal was to **separate the construction process from the representation**, allowing the same sequence of steps to create various pizza types.

---

## ⚙️ Functionalities

**Main features implemented:**
- Build pizzas step by step (size, dough, toppings).  
- Use a **Director (PizzaChef)** to manage the construction process.  
- Create multiple pizza types using distinct builders:
  - **HawaiianPizzaBuilder**
  - **FourCheesePizzaBuilder**
  - **VeggiePizzaBuilder**
- Promote **modularity and flexibility** in object creation.

**Class Responsibilities:**
1. **Pizza.java** – The product with properties: size, dough, toppings.  
2. **PizzaBuilder.java** – Interface defining pizza-building steps.  
3. **Concrete Builders** – Implement specific pizza recipes.  
4. **PizzaChef.java** – The director controlling the construction order.  
5. **Main.java** – Demonstrates the pizza creation process.

---

## 💻 Technologies Used
- **Java JDK 24 (OpenJDK)**  
- **IntelliJ IDEA 2025.1**  
- **Git & GitHub**  
- **Concepts:** Builder Pattern, OOP, Abstraction, Encapsulation

---

## 📋 Requirements
- Java JDK 24+  
- IntelliJ IDEA 2025.1+  
- Basic understanding of:
  - Object-Oriented Programming  
  - Creational Design Patterns (Builder)

---

## 🛠️ Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yvangabrieli/S3.01.Patterns_2
```
