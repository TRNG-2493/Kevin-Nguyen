Exercise 10-28
Aiden and Kevin

Exercise 1

1. Reworded: "Users should be able to reset their password by clicking a reset password button on the log in page and using an email."
What do you mean by easily?, Can users reuse an old password when resetting?

2. 
a) Functional
b) Non-Functional
c) Functional

3.
a) QC
b) QA
c) QA
d) QC

4.
a) Verification
b) Validation
c) Verification

5. Developer misreading the specs: Error
Code calculating wrong price: Defect
Customer invoice with too little price: Failure

Exercise 2
1.
a) Pesticide paradox
b) Defects cluster together
c) Absence of errors fallacy

2.
a) Manual
b) Automated
c) Manual

3.
Positive:
aiden@email.com, password
kevin@email.com, passwordpassword

Negative:
aiden@email.com, passwor
kevin@email.com, passwordpassword1
(no email), password

4. 
Valid: 0-12, 13-59, 60+
Invalid: Negative numbers

Test values: 10, 40, 70, -5

Exercise 3

1. Lower: 5, 6, 7; Higher: 19, 20, 21
Expected result for each in order: Failed, passed, passed, passed, passed, failed

2. 
                     R1  R2  R3  R4
Conditions
Salary over $30,000  T   T   F   F
Good credit score    T   F   T   F
Actions
Approved             T
Manual review            T   T
Rejected                         T

3. 
Valid:
Draft > Submission
Submitted > Approved
Submitted > Rejected
Rejected > Draft

Inavlid:
Submitted > Draft

4. 
Main flow:
User inputs credentials
User selects the account to withdraw from
User selects the ammount to withdraw
User retrieves cash
User withdraws card

Exceptions:
User inputs credentials
> Credentials rejected


User inputs credentials
User selects the account to withdraw from
User selects the ammount to withdraw
> Not enough money in account

5.
Too few digits
Too many digits
Non numeric characters
Phone number that doesn't exist
Negative number