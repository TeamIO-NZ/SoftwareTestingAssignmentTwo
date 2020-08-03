#Software Testing Assignment 2 




##Checkable task list

|Task|Status|James|Joe|
|:---|:---:|:---:|:---:|
|Create Repo|[x]|[x]|[x]|
|Collect requirements from Sim Discussion|[ ]|[ ]|[ ]|
|Put requirements in Readme.md|[ ]|[ ]|[ ]|
|User Acceptance Test Spreadsheet|[ ]|[ ]|[ ]|
|Traceability Matrix|[ ]|[ ]|[ ]|
|Test plans (at least 2)|[ ]|[ ]|[ ]|
|Code Program|[ ]|[ ]|[ ]|
|Implement Unit Tests|[ ]|[ ]|[ ]|
|Explain away not included Methods|[ ]|[ ]|[ ]|
|500-1000 word report per test run|[ ]|[ ]|[ ]|
|Screenshots of tests in action|[ ]|[ ]|[ ]|
|Executive Summary|[ ]|[ ]|[ ]|
|Ensure Contribution gap < 20%|[ ]|[ ]|[ ]|
##Requirements

//work on this section

##Instructions
**Intro**

Create Github page
Create report showing a simulated discussion with the customer/product owner to collect accurate and complete requirements.                             
Write up the final requirements in the readme below    
- Each requirement must have a key code as suggested by the initial requirements(Not sure wht this is)
- Your final requirements may differ from the original by numbers and nature 
Create Enhancement issues for each requirement
- Use bugs and stuff as well

**User Acceptance Testing**

Design User Acceptance Test cases matching the agreed requirements

Test cases must cover
- Equivalent classes of input values and edge cases
- The tests should include expected errors
  - If a feature is supposed to alert users on errors under certain circumstances, you need to have tests for this
- List your User Acceptance test in an Excel/Google sheet and link it here in some way
  - You can organise these how you want but you'll need to add a traceability matrix showing the mapping of test cases to requirements to your report
- Produce at lease 2 test plans as per the IEEE829 test plan referenced in appendix B (Investigate this)
- You choose how to dispatch said tests. 
  - Some topics might not make sense for this project. Just put N/A for these
- Proceed with a test run and write up your findings.
  - Your findings are likely to find defects
  - Track these on github as issues and give them a severity
  - Do not attempt to fix code unless you find critical issues that making your tests pointless
  - In this case, Report a second test run
  
 **Unit testing**
 
 Done using JUnit 4 or 5
- Implement unit tests for every public method and constructor
  - If a method or constructor is not covered explain why
- Test cases must at least cover equivalent classes input values and edge cases
- If a method is supposed to fail with exceptions under certain conditions your tests should show this.

**Deliverables**

1 Report per student<br>
This report must contain:

*Black box testing*

 - Spreadsheet with User Acceptance level tests
 - User Acceptance Test plans
   - At least 2 UA test plans as per the IEEE829 test plan referencing the associated test cases or suites
 - User Acceptance tests Traceability Matrix
    - This checks all the requirements are covered
 - Test runs findings
    - Report 500/1000 words per run on your test findings
    - This includes discoveries, difficulties, what could have been better, observations etc
 
 *White box testing*
 - Evidence of the tests
   - Screenshots of the tests in action
   - A reasonable amount of these tests should be passing for the test run to make sense
   - It is not required for tests to reach 100% each run
     - Unit test plans are not required (Don't know what these are anyways)
 
 *General*
 - Github Repo
   - Must show requirements and bug tracking
   - The code should contain the actual software and the tests
   - Your report should also contain an executive summary and a link to the Repo
   - Upload to EIT Online
   
 *Code*<br>
 Appendix A<br>

 Your Customer/Project Owner wants you to implement a console-based blackjack game with 2 dice. The human
 player plays against the computer.
 
 Note: We should expand these requirements because they suck
 
 1: The human players starts.<br>
 2: At start, the player gets 2 random numbers.<br>
 3: The random number are summed up.<br>
 4: The player can then choose to hold or roll again the dice.<br>
 5: If they choose to roll again, numbers are added to the previous sum.<br>
 6: If the player holds, it is the computer’s turn.<br>
 7: The closest to 21 without going over is the winner.<br>

*Test Plan Standard IEEE 829*<br>
 Appendix B<br>
 [Look here for PDF](https://eitonline.eit.ac.nz/pluginfile.php/2763438/mod_resource/content/0/ITPR6.598%20Software%20Testing%20-%20Assign%202%202020.pdf)
 