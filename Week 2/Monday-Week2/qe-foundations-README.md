**Main Branch Repo link:** https://github.com/KevinKhangNguyen/qe-foundations.git

**Self-check:**

kevin@MSI UCRT64 ~/Projects_Revature/qe-foundations (main)
$ python check_exercise.py --submit
Week 2 / Monday self-check - Project 1: qe-foundations kickoff
Repository root: C:\Users\kevin\Projects_Revature\qe-foundations

== A. Environment (virtual environment + Python)
  [PASS] Python >= 3.9 (found 3.15.0)
  [PASS] this check is running INSIDE a virtual environment
  [PASS] .venv folder exists in the repo root
  [PASS] the active venv is THIS repo's .venv

== B. Repository structure (Project 1 milestone)
  [PASS] README.md exists
  [PASS] .gitignore exists
  [PASS] requirements.txt exists
  [PASS] requirements-dev.txt exists
  [PASS] qe_foundations/__init__.py exists
  [PASS] qe_foundations/utils/__init__.py exists
  [PASS] qe_foundations/utils/strings.py exists
  [PASS] qe_foundations/utils/numbers.py exists
  [PASS] qe_foundations/utils/dates.py exists
  [PASS] qe_foundations/utils/data_gen.py exists
  [PASS] tests/ exists and holds a placeholder file
  [PASS] data/ exists and holds a placeholder file
  [PASS] docs/ exists and holds a placeholder file
  [PASS] legacy_helpers.py has been removed from the repo root
  [PASS] .gitignore ignores .venv/
  [PASS] .gitignore ignores __pycache__/
  [PASS] .gitignore ignores *.pyc
  [PASS] README names the project (QE Foundations)
  [PASS] README documents creating a venv (python -m venv)
  [PASS] README shows activation for PowerShell AND bash
  [PASS] README documents pip install -r requirements.txt
  [PASS] README states the Project 1 milestone (Monday)

== C. Dependencies (requirements files)
  [PASS] requirements.txt is plain UTF-8 text
  [PASS] requirements.txt lists requests
  [PASS] requests has a version specifier
  [PASS] requirements.txt contains runtime deps only (no pytest)
  [PASS] requirements-dev.txt is plain UTF-8 text
  [PASS] requirements-dev.txt includes '-r requirements.txt'
  [PASS] requirements-dev.txt lists pytest
  [PASS] requests is installed in this environment (version 2.34.2)

== D. The qe_foundations package and the utils library
  [PASS] import qe_foundations works
  [PASS] importing qe_foundations prints nothing
  [PASS] qe_foundations.__version__ is defined
  [PASS] import qe_foundations.utils works
  [PASS] importing qe_foundations.utils prints nothing
  [PASS] import qe_foundations.utils.strings works
  [PASS] import qe_foundations.utils.numbers works
  [PASS] import qe_foundations.utils.dates works
  [PASS] import qe_foundations.utils.data_gen works
  [PASS] utils re-exports the full public API from __init__.py
  [PASS] utils/__init__.py defines __all__ with every public name
  [PASS] behaviour: slugify
  [PASS] behaviour: normalize_whitespace
  [PASS] behaviour: is_valid_email
  [PASS] behaviour: mask_email (valid)
  [PASS] behaviour: mask_email (invalid is returned unchanged)
  [PASS] behaviour: is_positive_int
  [PASS] behaviour: clamp
  [PASS] behaviour: percent
  [PASS] behaviour: add_days
  [PASS] behaviour: days_between
  [PASS] behaviour: is_weekend
  [PASS] behaviour: timestamp_for_filename
  [PASS] behaviour: make_users (same seed -> same data)
  [PASS] behaviour: make_users (different seeds differ)
  [PASS] behaviour: make_users (record shape)
  [PASS] python smoke_utils.py exits with code 0

== E. Git
  [PASS] the repo root is a Git repository
  [PASS] at least 3 commits (found 11)
  [PASS] no .venv/ or __pycache__ files are tracked
  [PASS] requirements.txt is committed
  [PASS] qe_foundations/__init__.py is committed
  [PASS] qe_foundations/utils/__init__.py is committed
  [PASS] working tree is clean (everything committed)
  [PASS] remote 'origin' is configured
  [PASS] all commits are pushed to origin

RESULT: 66/66 required checks passed, 0 warning(s).
All required checks passed.
(.venv)