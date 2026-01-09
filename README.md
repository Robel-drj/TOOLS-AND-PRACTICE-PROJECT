# SETP-PROJECT

# Simple calculator – SETP Assignment

Name................................id

1.Fiker Bilelegn...................ddu1600275

2.Sosina Yeshidenber.................ddu1600680

3.Miheret Girma...................ddu1600535

4.Yonaf Amsalu......................ddu1600762

5.Robel Dereje.......................rmd2085

This project is a simple calculatodeveloped as part of the
Software Engineering Tools and Practices (SETP) course.

The system was first designed using UML diagrams in ArgoUML and then
converted into Java source code. Git and GitHub were used for version
control and collaboration

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
