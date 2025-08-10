# Spring Framework Guide

This repository contains **examples and explanations** for:
- **Spring Core**
- **Spring MVC**
- **Spring Boot**

It is designed for **beginners** to quickly understand the fundamentals and build working projects step-by-step.

---

## 1️⃣ Spring Core
Spring Core is the **foundation** of the Spring Framework.  
It provides **IoC (Inversion of Control)** and **DI (Dependency Injection)** features to manage Java objects in a clean and decoupled way.

### 🔹 Key Concepts
- **Bean** → An object managed by Spring’s IoC container.
- **IoC Container** → Creates, manages, and injects beans into your application.
- **Dependency Injection** → Automatically provides required dependencies to classes via constructor or setter methods.
- **ApplicationContext** → An advanced IoC container that offers more features compared to `BeanFactory`.

---

## 2️⃣ Spring MVC
Spring MVC is a **web framework** built on Spring Core, following the **Model-View-Controller** design pattern.

### 🔹 Key Concepts
- **Controller** → Handles incoming HTTP requests and returns a response (view or data).
- **Model** → Contains the application data that will be displayed in the view.
- **View** → The presentation layer (JSP, Thymeleaf, etc.) responsible for rendering data.
- **DispatcherServlet** → Acts as the **front controller**, routing all incoming requests to the appropriate controller.

---

## 3️⃣ Spring Boot
Spring Boot simplifies the process of building Spring applications by **removing boilerplate code** and offering **production-ready features** out of the box.

### 🔹 Key Features
- **No XML configuration required** — Everything can be set up with annotations and properties.
- **Embedded Tomcat/Jetty** — Run your application without installing a separate server.
- **Starter dependencies** — Bundled dependencies for common use cases (`spring-boot-starter-web`, etc.).
- **Rapid development** — Opinionated defaults so you can focus on coding, not configuration.
- **Production-ready** — Includes built-in monitoring, health checks, and metrics.

---

## 🛠 Technologies Used
- Java 17+ (LTS recommended)
- Spring Framework 6+
- Spring Boot 3+
- Maven
- Tomcat / Embedded Server

---
