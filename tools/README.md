# Development Tools and Utilities

This folder contains helpful tools, scripts, and utilities to support your Java learning journey.

## 🛠️ Available Tools

### Setup Scripts
- **install-java.sh** - Automated Java installation for Linux/macOS
- **install-java.bat** - Automated Java installation for Windows
- **setup-ide.sh** - IDE configuration script
- **verify-installation.sh** - Verify Java installation

### Development Utilities
- **compile-all.sh** - Compile all Java files in a directory
- **run-examples.sh** - Run all example programs
- **format-code.sh** - Format Java code using standard conventions
- **check-style.sh** - Check code style and conventions

### Learning Aids
- **progress-tracker.md** - Track your learning progress
- **cheat-sheet.md** - Quick reference for Java syntax
- **debugging-guide.md** - Common debugging techniques
- **troubleshooting.md** - Solutions to common problems

## 🚀 Quick Start

### 1. Verify Java Installation
```bash
# Run the verification script
./tools/verify-installation.sh

# Or manually check
java -version
javac -version
```

### 2. Compile and Run Examples
```bash
# Compile all examples for a specific day
./tools/compile-all.sh Day\ 1/examples/

# Run all examples
./tools/run-examples.sh Day\ 1/examples/
```

### 3. Format Your Code
```bash
# Format all Java files in a directory
./tools/format-code.sh Day\ 1/
```

## 📋 Tool Descriptions

### Setup Scripts

#### install-java.sh / install-java.bat
Automatically downloads and installs the latest Java Development Kit (JDK).

**Features:**
- Detects operating system
- Downloads appropriate JDK version
- Sets up environment variables
- Verifies installation

**Usage:**
```bash
# Linux/macOS
chmod +x tools/install-java.sh
./tools/install-java.sh

# Windows
tools\install-java.bat
```

#### setup-ide.sh
Configures popular IDEs with Java development settings.

**Features:**
- IntelliJ IDEA configuration
- Eclipse workspace setup
- VS Code extension installation
- Code style preferences

**Usage:**
```bash
chmod +x tools/setup-ide.sh
./tools/setup-ide.sh
```

### Development Utilities

#### compile-all.sh
Compiles all Java files in a specified directory.

**Features:**
- Recursive compilation
- Error reporting
- Progress indication
- Output organization

**Usage:**
```bash
chmod +x tools/compile-all.sh
./tools/compile-all.sh path/to/java/files/
```

#### run-examples.sh
Executes all compiled Java programs in a directory.

**Features:**
- Automatic execution
- Output capture
- Error handling
- Progress tracking

**Usage:**
```bash
chmod +x tools/run-examples.sh
./tools/run-examples.sh path/to/compiled/classes/
```

#### format-code.sh
Formats Java code according to standard conventions.

**Features:**
- Consistent indentation
- Proper spacing
- Line length limits
- Import organization

**Usage:**
```bash
chmod +x tools/format-code.sh
./tools/format-code.sh path/to/java/files/
```

#### check-style.sh
Checks Java code for style violations and best practices.

**Features:**
- Naming convention checks
- Code complexity analysis
- Documentation requirements
- Best practice enforcement

**Usage:**
```bash
chmod +x tools/check-style.sh
./tools/check-style.sh path/to/java/files/
```

## 📚 Learning Aids

### progress-tracker.md
A markdown file to track your learning progress through the 21-day curriculum.

**Features:**
- Daily progress checkboxes
- Concept mastery tracking
- Project completion status
- Notes and reflections

### cheat-sheet.md
Quick reference for Java syntax and common patterns.

**Features:**
- Variable declarations
- Control structures
- Method definitions
- Class declarations
- Common operations

### debugging-guide.md
Comprehensive guide to debugging Java programs.

**Features:**
- Common error types
- Debugging techniques
- Tool usage
- Best practices

### troubleshooting.md
Solutions to common problems encountered during Java learning.

**Features:**
- Installation issues
- Compilation errors
- Runtime exceptions
- IDE problems

## 🔧 Configuration Files

### .editorconfig
Standardizes code formatting across different editors.

### .gitattributes
Configures Git behavior for Java files.

### .vscode/settings.json
VS Code configuration for Java development.

### .idea/codeStyles/
IntelliJ IDEA code style configuration.

## 📦 Dependencies

### Required Tools
- **Java Development Kit (JDK)** 17 or later
- **Git** for version control
- **Text Editor** or IDE

### Optional Tools
- **Maven** for project management
- **Gradle** for build automation
- **JUnit** for testing
- **Checkstyle** for code quality

## 🚀 Advanced Usage

### Custom Scripts
Create your own scripts for specific tasks:

```bash
#!/bin/bash
# Custom script example
echo "Starting Java learning session..."
cd "Day $1"
./tools/compile-all.sh examples/
./tools/run-examples.sh examples/
echo "Session complete!"
```

### Automation
Set up automated workflows:

```bash
# Daily learning routine
./tools/verify-installation.sh
./tools/compile-all.sh "Day $(date +%d)/"
./tools/run-examples.sh "Day $(date +%d)/"
./tools/format-code.sh "Day $(date +%d)/"
```

## 🆘 Troubleshooting

### Common Issues

#### Permission Denied
```bash
# Make scripts executable
chmod +x tools/*.sh
```

#### Java Not Found
```bash
# Check Java installation
which java
which javac

# Set JAVA_HOME if needed
export JAVA_HOME=/path/to/java
```

#### Script Errors
```bash
# Check script syntax
bash -n tools/script-name.sh

# Run with debug output
bash -x tools/script-name.sh
```

### Getting Help
1. Check the troubleshooting guide
2. Review script comments
3. Ask in GitHub Issues
4. Search online documentation

## 📈 Best Practices

### Using Tools Effectively
1. **Read the documentation** - Understand what each tool does
2. **Test in a safe environment** - Don't run scripts on important files
3. **Backup your work** - Use version control
4. **Customize as needed** - Modify scripts for your workflow
5. **Share improvements** - Contribute back to the community

### Development Workflow
1. **Verify environment** - Run verification scripts
2. **Format code** - Use formatting tools
3. **Check style** - Run style checks
4. **Test thoroughly** - Use testing tools
5. **Document changes** - Keep notes of modifications

---

**Happy coding!** 🚀

*These tools are designed to make your Java learning journey smoother and more efficient. Don't hesitate to customize them for your specific needs.*
