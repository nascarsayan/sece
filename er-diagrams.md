<details>
<summary>Understanding ER Diagrams</summary>

---

- ER (Entity-Relationship) Diagrams are visual representations used in database design to illustrate the logical structure and relationships between entities in a system.
  
- ER Diagrams help in conceptualizing and designing databases by providing a clear overview of entities, their attributes, and the relationships between them.

- **Components of ER Diagrams:**
  - **Entities:** Represent real-world objects or concepts, such as people, places, or things, with attributes describing them.
  - **Relationships:** Show connections and interactions between entities, defining how they are related to each other.
  - **Attributes:** Characteristics or properties of entities that provide further details about them.

- ER Diagrams serve as a blueprint for database implementation, aiding in better understanding, communication, and maintenance of the database structure.

- ER Diagrams use symbols and notations to depict entities, attributes, and relationships, making it easier to visualize database designs.

</details>

---

<details>
<summary>Entities in ER Diagrams</summary>

---

# Entities in ER Diagrams

- Entities represent real-world objects, concepts, or things within a system that are identifiable and distinguishable.
  
- Entities can include various elements such as Students, Books, Employees, Customers, etc.
  
- Entities are typically depicted as rectangles in ER Diagrams.
  - Each entity has attributes that describe its properties or characteristics.
  - Entities are identified uniquely by their primary keys in a database.
  
- Entities form the core components of a database schema, defining the structure of data storage.

- Entities facilitate organizing and categorizing information in the database system.

</details>

---

<details>
<summary>Attributes in ER Diagrams</summary>

---


# Attributes in ER Diagrams

- Attributes are properties or characteristics that describe entities in a database.
  
- **Types of Attributes:**
  - *Simple Attributes:* Represent single atomic values (e.g., Name, Age).
  - *Composite Attributes:* Composed of multiple smaller attributes (e.g., Address: Street, City, Zip Code).
  - *Derived Attributes:* Calculated or derived from other attributes (e.g., Age can be derived from Date of Birth).
  
- **Examples of Attributes:**
  - Attributes could be Name, ID, ISBN, Title, Author, Quantity, etc.

- Attributes are usually depicted as ovals connected to respective entities.
  
- Attributes provide details and specific information about entities, defining their characteristics.
  
- Attributes help in organizing and storing data efficiently within the database.

</details>

---

<details>
<summary>Relationships in ER Diagrams</summary>

---


#### Relationships in ER Diagrams

- Relationships establish connections and associations between entities in a database system.
  
- **Types of Relationships:**
  - *One-to-One (1:1):* Each entity in the relationship is associated with only one entity in the other side.
  - *One-to-Many (1:M):* One entity in a relationship is associated with multiple entities in the other side.
  - *Many-to-Many (M:N):* Entities on both sides can be associated with multiple entities on the other side.

- Example: A Student borrows many Books; a Book can be borrowed by many Students.

- Relationships are typically depicted as diamonds connected to related entities.
  
- Relationships define how entities interact and relate to each other in a database schema.
  
- Relationships establish the logical connections between entities, shaping the database structure.

</details>

---

<details>
<summary>Example</summary>


If the Diagram below does not load use [this](https://mermaid.ink/img/pako:eNp9UkFugzAQ_Irlc_IBbhDSFqUCSmilSEjVBrbBCtiVMQcE_L2GlEIDxKf17DIzzLqmsUiQGhSlzeAiIY840cfyvAOpb3V_F-Lq2MRxQ-IfRjhkKkPyYQa7FzMYYbNUqZBz3Dla7hz1y3PGYlBM8BOC7ETG5lsJXDFVjWgb8Vvhv1uvzs4MHc-dWp3QLTjuu0WK0oUcH3qxQSGxzXB_J6sV989ecJpq7vTsRchqQXBozfX-GLuwP5doJ6k_HVbVhtZ_vpV0VijnoS2ykqbZbpv6zrFBzpgJfilCMRltu9FmbsYgrBi2kFjVfJfrH6ZQTBeEClhW0A3NUebAEv2M-z-NqEoxx4gaukxAXiMa8VbPQanEseIxNZQscUPL70RH-fvwqfEFWYHtDwNY5EM) image link.


```mermaid
erDiagram
    BOOK {
        BookID INT PK
        Title VARCHAR
        Author VARCHAR
        ISBN VARCHAR
        PublicationYear INT
        Quantity INT
    }

    PUBLICATION {
        PublicationID INT PK
        PublisherName VARCHAR
        PublicationDate DATE
    }

    CATEGORY {
        CategoryID INT PK
        CategoryName VARCHAR
    }

    BOOK_CATEGORY {
        BookID INT FK
        CategoryID INT FK
    }

    BOOK_PUBLICATION {
        BookID INT FK
        PublicationID INT FK
    }

    BOOK ||--|{ BOOK_CATEGORY : belongsTo
    BOOK }|--|| BOOK_PUBLICATION : isPublishedBy
    PUBLICATION }|--|| BOOK_PUBLICATION : hasPublicationDetails
```

</details>

<!-- https://www.mermaidchart.com/app/projects/21030e5e-873f-4377-bb62-3dae3e10870f/diagrams/b2b98989-b71a-43ac-b539-a27454399c7e/version/v0.1/edit -->

