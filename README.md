# SETP-PROJECT

# Simple calculator – SETP Assignment

Name................................Id

1.Fiker Bililegn...................DDU1600275

2.Sosina Yeshidenber.................DDU1600680

3.Mihret Girma...................DDU1600535

4.Yonaf Amsalu......................DDU1600762

5.Robel Dereje.......................RMD2085

Project Overview
This project is a simple calculatodeveloped as part of the
Software Engineering Tools and Practices (SETP) course.

The system was first designed using UML diagrams in ArgoUML and then
converted into Java source code. Git and GitHub were used for version
control and collaboration

Objectives of the Project

Apply software engineering tools and practices
Practice UML-based system design
Gain experience with Git and GitHub
Implement calculator logic using Java
Work collaboratively using branches and merges

## Tools and Technologies Used

- ArgoUML – for UML class diagram design and Java code generation
- Java – programming language
- VS Code – code editor
- Git – version control system
- GitHub – remote repository and pull request management

---

## System Description

The system contains the following main functions:

- addition
- substraction
- multiplication
- division
- square root
- factorial opration
- absolute value opration
- average value calculation
- power operation
- percentage operation
- modulus operation
- logarithmic operation (log, ln)  
- trigonometric operations (sin, cos, tan)
- prime check
- GCD(greatest common divisor)
- LCM(least common factor)
---

## Git Commands Used

- git init – initialize a local Git repository
- git add – stage files for commit
- git commit – save changes to the repository
- git branch – create a new branch
- git checkout – switch between branches
- git merge – merge branches
- git push – upload local changes to GitHub
- git pull – fetch and merge changes from GitHub
---

## Acknowledgements

- Instructor and teaching assistants of the SETP course
- Open-source Git and GitHub documentation
- Java official documentation

## Branching and Merging Workflow
- **Master Branch:** Contains stable and fully tested code. Only completed features are merged here.
- **Feature Branches:** Each team member works on a separate branch for a specific feature, e.g., `feature/addition-method`.
- **Workflow:**
  1. Create a feature branch from `master`.
  2. Implement and test your feature.
  3. Commit changes with descriptive messages.
  4. Pull the latest `master` updates to avoid conflicts:
     ```bash
     git checkout master
     git pull origin master
     ```
  5. Merge your feature branch into `master` using:
     ```bash
     git checkout master
     git merge feature/your-feature
     git push origin master
     ```
- **Conflict Resolution:** If conflicts occur during merging, resolve them locally, test the code, and then push the merged changes.
---
## Input Validation and Error Handling

- The system validates all numeric inputs using exception handling.
- Invalid inputs (non-numeric values) are handled using `InputMismatchException`.
- The program prevents invalid operations such as:
- Division by zero
- Insufficient input count for operations
- Users are prompted repeatedly until valid input is provided.

 ## Design Considerations

- The calculator is menu-driven for ease of use.
- Each operation is implemented as a separate method to improve modularity.
- Static methods are used to simplify method access without object creation.
- Code readability and maintainability were prioritized.

  ## Limitations of the System
- All calculations are performed sequentially through menu selection.
- No graphical user interface (GUI) is implemented.

## Version Control Concepts Applied
- Commit history tracking
- Branching for feature development
- Pull Requests for code review
- Merging changes into the main branch
---

#Future Improvement
- Support for inverse trigonometric functions  
- Support for hyperbolic functions (sinh, cosh, tanh)  
- Allow chaining multiple operations in a single input
  
## License
This project is developed for academic purposes as part of the SETP course.
All rights are reserved to the project contributors.
