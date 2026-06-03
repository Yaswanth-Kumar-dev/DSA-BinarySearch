<div align="center">

<!-- ═══════════════════════════════════════════════════════════ -->
<!--                    HERO BANNER                             -->
<!-- ═══════════════════════════════════════════════════════════ -->

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:1a1a2e,50:16213e,100:0f3460&height=200&section=header&text=DSA-BinarySearch&fontSize=52&fontColor=e94560&animation=fadeIn&fontAlignY=38&desc=Mastering%20Binary%20Search%20on%20Index,%20Value,%20and%20Answer%20Space&descAlignY=60&descSize=18&descColor=a8b2d8" width="100%"/>

<br/>

<!-- Badges Row 1 -->
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com)
[![DSA](https://img.shields.io/badge/DSA-Binary%20Search-e94560?style=for-the-badge&logo=databricks&logoColor=white)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch)
[![Algorithms](https://img.shields.io/badge/Algorithms-O(log%20n)-00d4aa?style=for-the-badge&logo=statuspage&logoColor=white)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch)

<!-- Badges Row 2 -->
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Yaswanth-Kumar-dev)
[![Problem Solving](https://img.shields.io/badge/Problem%20Solving-Elite%20Level-6c63ff?style=for-the-badge&logo=target&logoColor=white)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch)
[![Binary Search](https://img.shields.io/badge/Binary%20Search-12%20Problems-e94560?style=for-the-badge&logo=searchengin&logoColor=white)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/)

<br/>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&pause=1000&color=E94560&center=true&vCenter=true&width=600&lines=Binary+Search+%7C+Interview+Mastery;O(log+n)+%7C+Search+Space+Reduction;Index+%7C+Value+%7C+Answer+Space;12+LeetCode+Problems+%7C+Java+Solutions" alt="Typing SVG" />

</div>

<br/>

---

<!-- ═══════════════════════════════════════════════════════════ -->
<!--                   TABLE OF CONTENTS                        -->
<!-- ═══════════════════════════════════════════════════════════ -->

<details>
<summary><b>📋 Table of Contents</b></summary>

- [📖 About Repository](#-about-repository)
- [🎯 Why Binary Search Matters](#-why-binary-search-matters)
- [🗂️ Binary Search Patterns](#️-binary-search-patterns)
- [📊 Problem Tracker](#-problem-tracker)
- [⚡ Complexity Analysis](#-complexity-analysis)
- [📁 Folder Structure](#-folder-structure)
- [💡 Key Learnings](#-key-learnings)
- [🗺️ DSA Roadmap](#️-dsa-roadmap)
- [🎤 Interview Readiness](#-interview-readiness)
- [✨ Repository Highlights](#-repository-highlights)
- [🚀 How To Run](#-how-to-run)
- [🏆 Bonus: LinkedIn Announcement](#-bonus-linkedin-announcement)

</details>

---

## 📖 About Repository

<div align="center">

> **DSA-BinarySearch** is a meticulously curated, interview-focused collection of Binary Search problems solved in Java. Every solution is crafted with production-quality code standards, comprehensive inline documentation, and optimal time-space complexity — designed to make you unstoppable in technical interviews.

</div>

This repository is your **one-stop destination** for mastering Binary Search across its three fundamental paradigms: searching on a **sorted index**, searching on a **value space**, and searching on an **answer space**. Each solution follows clean code principles with clear variable naming, boundary handling, and edge-case awareness — exactly what top-tier companies like Google, Amazon, Microsoft, and Meta expect.

**Built for:** Recruiters evaluating technical depth · Hiring Managers assessing problem-solving · Software Engineers sharpening skills · LeetCode learners seeking patterns · Interview candidates preparing systematically.

---

## 🎯 Why Binary Search Matters

Binary Search is one of the **most powerful and frequently tested** algorithmic paradigms in technical interviews. It transforms brute-force O(n) solutions into elegant O(log n) solutions by intelligently eliminating half the search space at every step.

### 🔍 Three Dimensions of Binary Search

<div align="center">

| Dimension | Core Idea | When to Use | Example |
|:---------:|:---------:|:-----------:|:-------:|
| 🗂️ **Binary Search on Index** | Search within array indices of a sorted/rotated array | Array is sorted or partially sorted | Binary Search, Search in Rotated Array |
| 📊 **Binary Search on Value** | The answer lies within a range of values, not indices | Min/Max value problems, sorted answer space | Find Minimum in Rotated Array, Median |
| 🎯 **Binary Search on Answer** | Binary search on the result itself, not the input | Optimization problems: minimize max, maximize min | Koko Bananas, Ship Packages, Split Array |

</div>

### 💎 The Unifying Principle

> *"Binary Search works whenever you can define a **monotonic predicate** — a condition that is false for all values below a threshold and true for all values above it (or vice versa). Once you identify that predicate, you can binary search on it."*

---

## 🗂️ Binary Search Patterns

<div align="center">

### 🔷 Pattern 1 — Search on Sorted Index

> Classic binary search applied directly to sorted or structured arrays

| Problem | Key Insight | Difficulty |
|:--------|:------------|:----------:|
| 🔎 Binary Search | Textbook left/right pointer halving | 🟢 Easy |
| 📐 Search a 2D Matrix | Treat 2D matrix as flattened 1D sorted array | 🟡 Medium |
| 🔢 Find First & Last Position | Two binary searches: leftmost and rightmost bound | 🟡 Medium |
| 🏔️ Find Peak Element | Binary search on unsorted — compare mid with neighbor | 🟡 Medium |

---

### 🔶 Pattern 2 — Search on Rotated Arrays

> Handle the break point in an otherwise sorted structure

| Problem | Key Insight | Difficulty |
|:--------|:------------|:----------:|
| 🔄 Search in Rotated Sorted Array | Determine which half is sorted, target accordingly | 🟡 Medium |
| 📉 Find Minimum in Rotated Sorted Array | Minimum is always in the unsorted half | 🟡 Medium |

---

### 🔴 Pattern 3 — Binary Search on Answer Space

> Binary search on the result, validate with a greedy check function

| Problem | Answer Space | Check Function |
|:--------|:------------|:---------------|
| 🐒 Koko Eating Bananas | `[1, max(piles)]` | Can Koko finish in ≤ h hours? |
| 🚢 Capacity To Ship Packages | `[max(weights), sum(weights)]` | Can we ship all in ≤ D days? |
| ✂️ Split Array Largest Sum | `[max(arr), sum(arr)]` | Can we split into ≤ m subarrays? |
| 🔮 Successful Pairs of Spells & Potions | Per spell: find first potion ≥ threshold | Is (spell × potion) ≥ success? |

---

### 🟣 Pattern 4 — Binary Search + Advanced Techniques

> Combine binary search with math, sorting, or divide & conquer

| Problem | Technique | Difficulty |
|:--------|:----------|:----------:|
| ⚖️ Median of Two Sorted Arrays | Partition-based binary search on smaller array | 🔴 Hard |
| 📏 Find K-th Smallest Pair Distance | Binary search on distance + sliding window count | 🔴 Hard |

</div>

---

## 📊 Problem Tracker

<div align="center">

| # | Problem | Pattern | Difficulty | Status |
|:-:|:--------|:--------|:----------:|:------:|
| 01 | [🔎 Binary Search](https://leetcode.com/problems/binary-search/) | Index Search | 🟢 Easy | ✅ Solved |
| 02 | [🔄 Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Rotated Array | 🟡 Medium | ✅ Solved |
| 03 | [📉 Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Rotated Array | 🟡 Medium | ✅ Solved |
| 04 | [⚖️ Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Advanced BS | 🔴 Hard | ✅ Solved |
| 05 | [📐 Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Index Search | 🟡 Medium | ✅ Solved |
| 06 | [🔢 Find First and Last Position of Element](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Index Search | 🟡 Medium | ✅ Solved |
| 07 | [🚢 Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Answer Space | 🟡 Medium | ✅ Solved |
| 08 | [🐒 Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Answer Space | 🟡 Medium | ✅ Solved |
| 09 | [✂️ Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | Answer Space | 🔴 Hard | ✅ Solved |
| 10 | [🏔️ Find Peak Element](https://leetcode.com/problems/find-peak-element/) | Index Search | 🟡 Medium | ✅ Solved |
| 11 | [🔮 Successful Pairs of Spells and Potions](https://leetcode.com/problems/successful-pairs-of-spells-and-potions/) | Answer Space | 🟡 Medium | ✅ Solved |
| 12 | [📏 Find K-th Smallest Pair Distance](https://leetcode.com/problems/find-k-th-smallest-pair-distance/) | Advanced BS | 🔴 Hard | ✅ Solved |

</div>

<div align="center">

**12 / 12 Problems Solved** &nbsp;|&nbsp; **Progress: 100%** &nbsp;|&nbsp; 🟢 Easy: 1 &nbsp;|&nbsp; 🟡 Medium: 8 &nbsp;|&nbsp; 🔴 Hard: 3

![Progress](https://progress-bar.xyz/100/?title=Binary%20Search%20Complete&width=500&color=e94560)

</div>

---

## ⚡ Complexity Analysis

<div align="center">

| Problem | Time Complexity | Space Complexity | Strategy |
|:--------|:--------------:|:---------------:|:---------|
| Binary Search | **O(log n)** | O(1) | Classic halving |
| Search in Rotated Sorted Array | **O(log n)** | O(1) | Identify sorted half |
| Find Minimum in Rotated Sorted Array | **O(log n)** | O(1) | Track unsorted half |
| Median of Two Sorted Arrays | **O(log(min(m,n)))** | O(1) | Partition-based |
| Search a 2D Matrix | **O(log(m×n))** | O(1) | Flatten index |
| Find First and Last Position | **O(log n)** | O(1) | Two binary searches |
| Capacity To Ship Packages | **O(n log(sum))** | O(1) | BS on answer |
| Koko Eating Bananas | **O(n log(max))** | O(1) | BS on answer |
| Split Array Largest Sum | **O(n log(sum))** | O(1) | BS on answer |
| Find Peak Element | **O(log n)** | O(1) | Compare neighbors |
| Successful Pairs Spells & Potions | **O((n+m) log m)** | O(m) | Sort + BS |
| Find K-th Smallest Pair Distance | **O(n log n + n log W)** | O(1) | BS + sliding window |

</div>

> 💡 **Key Takeaway:** Binary Search consistently delivers **O(log n)** time complexity — the hallmark of an efficient solution and a signal to interviewers that you recognize the search space structure.

---

## 📁 Folder Structure

```
DSA-BinarySearch/
│
├── 📄 README.md
│
├── 🟢 BinarySearch.java                          # LC #704 — Classic binary search
├── 🟡 SearchInRotatedSortedArray.java             # LC #33  — Rotated array search
├── 🟡 FindMinimumInRotatedSortedArray.java        # LC #153 — Min in rotated array
├── 🔴 MedianOfTwoSortedArrays.java               # LC #4   — Partition-based median
├── 🟡 SearchA2DMatrix.java                       # LC #74  — 2D matrix flattening
├── 🟡 FindFirstAndLastPosition.java               # LC #34  — Boundary positions
├── 🟡 CapacityToShipPackagesWithinDDays.java     # LC #1011 — Minimum ship capacity
├── 🟡 KokoEatingBananas.java                     # LC #875 — Min eating speed
├── 🔴 SplitArrayLargestSum.java                  # LC #410 — Minimize largest sum
├── 🟡 FindPeakElement.java                       # LC #162 — Peak detection
├── 🟡 SuccessfulPairsOfSpellsAndPotions.java     # LC #2300 — Sorted BS pairing
└── 🔴 FindKthSmallestPairDistance.java           # LC #719 — Distance + count BS
```

---

## 💡 Key Learnings

### 1. 🧩 Pattern Recognition
The most critical skill in Binary Search is recognizing **when** to apply it. Not every problem that mentions "search" or "find" is a binary search problem. The tell-tale sign is **monotonicity** — if you can define a condition where everything to the left is false and everything to the right is true (or vice versa), you have a binary search opportunity.

### 2. ✂️ Search Space Reduction
Binary Search is fundamentally about **intelligent elimination**. At each step, you gather information (is the target in the left half or right half?) and discard the impossible half. The art lies in correctly identifying which half to discard — and this requires understanding the invariant your algorithm maintains.

### 3. 🎯 Answer Space Binary Search
This is the paradigm that unlocks the most interview problems. Instead of searching for a value in an array, you define the **range of possible answers** and binary search over it. The key is writing a clean `canAchieve(mid)` function that checks whether the candidate answer is feasible. This separates senior engineers from juniors.

### 4. ⚡ Time Complexity Optimization
Binary Search is the go-to optimization when you see O(n) solutions for problems with a linear structure. The pattern is: if increasing/decreasing a value changes the answer monotonically, you can binary search on it. This insight alone solves an entire category of "minimize the maximum" / "maximize the minimum" problems.

### 5. 🎤 Interview Strategies
- **Always state your search space** before coding: "I'll binary search over `[lo, hi]`"
- **Define your invariant** explicitly: "At the end, `lo` will be the smallest valid answer"
- **Handle boundaries carefully**: off-by-one errors are the most common bug
- **Verify with examples**: trace through `lo=0, hi=1` and `lo=hi` cases

---

## 🗺️ DSA Roadmap

<div align="center">

| Status | Topic | Progress |
|:------:|:------|:--------:|
| ✅ | **Arrays & Hashing** | ![100%](https://progress-bar.xyz/100/?width=120&color=00d4aa&title=Done) |
| ✅ | **Two Pointers & Sliding Window** | ![100%](https://progress-bar.xyz/100/?width=120&color=00d4aa&title=Done) |
| ✅ | **Binary Search** | ![100%](https://progress-bar.xyz/100/?width=120&color=e94560&title=Done) |
| ⬜ | **Stack** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Next) |
| ⬜ | **Linked List** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |
| ⬜ | **Trees** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |
| ⬜ | **Heap / Priority Queue** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |
| ⬜ | **Backtracking** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |
| ⬜ | **Graphs** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |
| ⬜ | **Dynamic Programming** | ![0%](https://progress-bar.xyz/0/?width=120&color=6c63ff&title=Planned) |

**Overall DSA Journey:** 3 / 10 Topics Complete &nbsp;|&nbsp; **30% Complete**

</div>

---

## 🎤 Interview Readiness

Mastering Binary Search develops four pillars of interview excellence:

**Optimization Thinking** — Binary Search trains your mind to always ask: *"Can I reduce this from O(n) to O(log n)?"* This instinct for optimization is what distinguishes strong engineers in interviews at FAANG and top-tier companies.

**Problem Decomposition** — Every Binary Search on Answer problem requires decomposing the solution into two clean pieces: (1) defining the search space, and (2) writing an independent validator. This structured decomposition skill transfers to system design, API design, and everyday engineering work.

**Search Space Reduction** — The core insight of binary search — eliminating impossible candidates — is a mental model applicable far beyond algorithms. It appears in debugging (binary search through commits), system troubleshooting, and decision-making under uncertainty.

**Interview Performance** — Binary Search problems are beloved by interviewers because they test multiple skills simultaneously: recognizing the pattern, handling edge cases, writing clean loop invariants, and communicating the solution clearly. Mastering 12 diverse Binary Search problems — across Easy, Medium, and Hard — means you can handle virtually any BS variant thrown at you.

---

## ✨ Repository Highlights

<div align="center">

|  | Feature | Detail |
|:-:|:--------|:-------|
| 🧹 | **Clean Code** | Meaningful variable names, single-responsibility methods, clear comments |
| ☕ | **Java Solutions** | Modern Java with optimal use of language features |
| 🎯 | **Optimal Approaches** | Every solution targets the best known time complexity |
| 🎤 | **Interview Focused** | Solutions structured to be explained clearly in 20-minute interviews |
| 🗂️ | **Well Structured** | One file per problem, logically named, easy to navigate |
| 📚 | **Pattern-Based** | Problems grouped and documented by underlying technique |
| 🔍 | **Edge Case Aware** | All solutions handle empty arrays, single elements, and overflow |

</div>

---

## 🚀 How To Run

### Prerequisites
- Java 11+ installed
- IntelliJ IDEA (recommended) or any Java IDE
- Git installed

### Clone the Repository

```bash
git clone https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch.git
cd DSA-BinarySearch
```

### Run Any Solution

**Option 1 — IntelliJ IDEA (Recommended)**
```
1. Open IntelliJ IDEA
2. File → Open → Select the DSA-BinarySearch folder
3. Navigate to any .java file
4. Click the ▶ Run button next to the main() method
```

**Option 2 — Command Line**
```bash
# Compile a specific file
javac BinarySearch.java

# Run it
java BinarySearch
```

**Option 3 — Run all solutions**
```bash
# Compile all Java files
javac *.java

# Run any specific solution
java KokoEatingBananas
java MedianOfTwoSortedArrays
java SplitArrayLargestSum
```

---

## 🏆 Bonus: LinkedIn Announcement

> **Copy-ready post for your LinkedIn profile:**

---

🚀 **Just published: DSA-BinarySearch — My Binary Search Mastery Repository!**

After weeks of deep practice, I've open-sourced my curated collection of **12 Binary Search LeetCode problems** solved in Java — covering all three paradigms:

🔷 **Binary Search on Index** — Classic sorted array search
🔶 **Binary Search on Value** — Rotated arrays & structural problems
🔴 **Binary Search on Answer** — Optimization problems (Koko, Ship Packages, Split Array)
🟣 **Advanced Techniques** — Median of Two Sorted Arrays, K-th Smallest Pair Distance

Every solution features:
✅ Optimal O(log n) time complexity
✅ Clean, interview-ready Java code
✅ Detailed pattern explanations
✅ Complexity analysis table

This is part of my structured DSA journey — **3 topics complete, 7 more to go!**

🔗 GitHub: [DSA-BinarySearch](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch)

If this helps you in your interview prep, drop a ⭐ on GitHub — it means the world!

#Java #DSA #BinarySearch #LeetCode #Algorithms #InterviewPrep #OpenSource #SoftwareEngineering #Coding #ProblemSolving

---

## 🔗 Connect & Collaborate

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-Yaswanth--Kumar--dev-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Yaswanth-Kumar-dev)
[![LeetCode](https://img.shields.io/badge/LeetCode-Profile-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com)

**⭐ Star this repo if it helped you crack Binary Search problems!**

*Pull requests welcome — if you have a cleaner solution or a new approach, let's discuss!*

</div>

---

<!-- ═══════════════════════════════════════════════════════════ -->
<!--                      FOOTER                               -->
<!-- ═══════════════════════════════════════════════════════════ -->

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f3460,50:16213e,100:1a1a2e&height=120&section=footer&fontSize=18&fontColor=e94560&animation=fadeIn" width="100%"/>

<div align="center">

<sub>

> *"Every logarithm conquered today becomes an interview problem solved tomorrow."*

**Made with ❤️ by [Yaswanth Kumar Peetla](https://github.com/Yaswanth-Kumar-dev) · Java · DSA · Binary Search**

[![MIT License](https://img.shields.io/badge/License-MIT-e94560?style=flat-square)](LICENSE)
[![Stars](https://img.shields.io/github/stars/Yaswanth-Kumar-dev/DSA-BinarySearch?style=flat-square&color=e94560)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch/stargazers)
[![Forks](https://img.shields.io/github/forks/Yaswanth-Kumar-dev/DSA-BinarySearch?style=flat-square&color=00d4aa)](https://github.com/Yaswanth-Kumar-dev/DSA-BinarySearch/network/members)

</sub>

</div>
