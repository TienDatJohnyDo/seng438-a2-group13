**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#: 13     |  |
| -------------- | --- |
| Student Names: |     |
| Tien Dat Johny Do         |     |
| Tommy Dinh              |     |
| Stuart Johnstone               |     |
| Sina Tavakol Moghaddam              |     |

# 1 Introduction
To start, our group had little knowledge on unit testing, especially using the black box technique as well as we also have not used any mocking frameworks to help with unit testing. Our previous knowledge for unit testing was through the lectures. We understood Black-box testing as testing an SUT (system under test) without the knowledge of any of the source code, the only things are that we need to look at the inputs and outputs and this testing is solely on the methods/functional specifications and requirements. We have also touched upon the concepts of equivalent class testing, boundary value testing as well as partitions in black box testing lectures. We know briefly that the equivalent class testing includes classifying input values into  how they will exhibit certain behaviors on the SUT reducing the number of test cases made. Also boundary value testing was discussed as testing between the extreme ends between the input values such as minimum, above minimum, normal value, below maximum, and maximum as an example. As well, our previous knowledge on mocking framework was also very little. From class we touched upon how mock objects help in testing similarly to unit testing assertions, and are used when the unit/method at test has external dependencies.  In brief, our group had an introductory level of knowledge on unit testing, creating Junit test cases as well as testing some methods using JMock. Through this lab, our group hopes to be able to build unit tests using JUnit and JMock while applying black-box testing practices.

# 2 Detailed description of unit test strategy

Since this is a black box testing method, here are the steps we took for each method/function: 
1. Understanding requirements. We firstly looked at the Javadoc requirements for the method we wanted to test.
2. Equivalent Testing. We would identify valid and invalid inputs and expected outputs in order to check the SUT. 
3. Boundary Value testing. We would identify negative, 0, and positive inputs for most of our boundary Value testing checks for negative, positive and “0” boundary values.
4. Develop Test Cases. We would then develop test cases for the method with equivalent and boundary value testing and cover as much as we could for the method.
5. Compare with outcomes. We would look at the expected outcome and compare it with the program's outcome. 
6. Bug documentation. We would comment on the testing code file and describe the reasoning of the bug. 


In depth:
Firstly in step 1, we have to understand the requirements of each other method and how our group understood each method was going through the javadocs that was provided and reading the requirements of inputs, and outputs of each function. 


Secondly in step 2, we took a look back at how all our functions would behave given some inputs and we would analyze and categorize valid and invalid inputs depending on the parameters of each method. Making sure we have an equivalent partitioned test will ensure that we have good coverage of the function. 


Thirdly in step 3, we have boundary value testing. For this lab, there were no constraints for the values, it only specified the having a lower and upper bound as parameters for the method, so our group decided to make our boundary testing look at the negative numbers, “0”, and positive numbers. A combination of all of these boundaries are tested in our program. 


Fourthly in step 4, we develop some JUnit tests based on our equivalent and boundary value testing in order to cover the function in an efficient way. 


In step 5, we compared the oracle and the actual program output together to determine if the function was working or if the function had defects. We would look at the behavior of the outputs and compare it to what the method should actually do.


Finally step 6, we would document our bugs in Jira as in progress so that in theory a developer would pick up the bug and fix it. Since we did black box testing we just documented the bug we found in the method in Jira.


# 3 Test cases developed

### Legend:


“+” means a positive number


“-” means a negative number


*In description field, it explains the partition that was covered by the test case

## Mocking/Data Utilities Class : we have 34 Test outlined
| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| --- | --- | ---| --- | --- | ---- | ---- |
Data Utilities|calculateColumnTotal()| calculateColTotal_0x0()|0 rows 0 columns in our table|0.0|0.0|Pass |
Data Utilities |calculateColumnTotal() | calculateColTotal_1x1()|1 row 1 column in our table with the value of 1|1.0|1.0|Pass |
Data Utilities|calculateColumnTotal() |calculateColTotal_Null1x1 ()| 1 row 1 column in our table with the value of “null”| 0.0| 0.0 |Pass|
Data Utilities | calculateColumnTotal() |calculateColTotal_Null2x2 ()| 2 row table with 2 values 1 value of 1.5 and 1 value of “null”| 1.5| 2.5| Fail|
Data Utilities |calculateColumnTotal() |calculateColTotal_2x2Even()| 2 row table 2 columns with 1.5 & 3.5 values expecting an even number output| 5.0|5.0| Pass|
Data Utilities| calculateColumnTotal() |calculateColTotal_2x2Odd ()| 2 row table 2 columns with 1.0 & 3.5 values expecting an odd number output|4.5|4.5|Pass|
Data Utilities| calculateColumnTotal() |calculateColTotal_Zero2x2 ()| 2 row table 2 columns with 0 values for both inputs| 0.0| 0.0| Pass|
Data Utilities| calculateColumnTotal() |calculateColTotal_Negative2x2()|2 row table 2 columns with two negative values for inputs| -10.5| -10.5|Pass|
Data Utilities| calculateColumnTotal() |calculateColTotal_3xNull()| 3 rows and 3 columns for all values being “null”| 0.0|3.0|Fail|
Data Utilities |calculateColumnTotal() |calculateColTotal_InvalidException()| ThrowException Test for invalid parameter|Throw Exception|Throw Exception| Pass|



| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Data Utilities| calculateRowTotal()| calculateRowTotal_0x0 ()| 0 columns in our table| 0.0| 0.0|Pass|
Data Utilities| calculateRowTotal()| calculateRowTotal_1x1 ()|1 row 1 column in our table with the value of 1|1.0|0.0|Fail|
Data Utilities| calculateRowTotal()|calculateRowTotal_Null1x1()|1 row 1 column in our table with the value of “null”|0.0|0.0|Pass|
Data Utilities|calculateRowTotal()|calculateRowTotal_Null2x2()|2 row table with 2 values both being “null|0.0|0.0|Pass|
Data Utilities|calculateRowTotal()|calculateRowTotal_2x2Even()|2 row table 2 columns with 1.5 & 3.5 values expecting an even number output|5.0|1.5|Fail|
Data Utilities|calculateRowTotal()|calculateRowTotal_2x2Odd()|2 row table 2 columns with 1.0 & 3.5 values expecting an odd number output|4.5|1.0|Fail |
Data Utilities|calculateRowTotal()|calculateRowTotal_Zero2x2()|2 row table 2 columns with 0 values for both inputs|0.0|0.0|Pass|
Data Utilities|calculateRowTotal()|calculateRowTotal_Negative2x2()|2 row table 2 columns with two negative values for inputs|-10.5|-10.0|Fail|
Data Utilities|calculateRowTotal()|calculateRowTotal_3xNull()|3 rows and 3 columns for all values being “null”|0.0|0.0|Pass|
Data Utilities|calculateRowTotal()|calculateRowTotal_InvalidException ()|ThrowException Test for invalid parameter|Throw Exception|Throw Exception|Pass|


| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Data Utilities|createNumberArray()|createNumberArray_NoItems()|Array with no items|Array with no items|Array with no items|Pass|
Data Utilities|createNumberArray()|createNumberArray_1Item()|Array with 1 item|Expected element[0] to be 1|Array element[0] was null|Fail|
Data Utilities|createNumberArray()|createNumberArray_10Items()|Array with 10 items|Expected element[9] to be -1.0|Array element[9] is null|Fail|
Data Utilities|createNumberArray()|createNumberArray_Null()|Throws Illegal argument Exception|Illegal argument Exception|Illegal argument Exception|Pass|


| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Data Utilities|createNumber2DArray()|createNumberArray2D_NoItems()|2D Array with no items|2D Array with no items|2D Array with no items|Pass|
Data Utilities|createNumber2DArray()|createNumberArray2D_1Null()|2D Array with null values|2D Array is null|2D Array is null|Pass|
Data Utilities|createNumber2DArray()|createNumberArray2D_1Item()|2D Array with 1 Item|Expected element[][1.0] to be to have value 1.0|2D Array is null|Fail|
Data Utilities|createNumber2DArray()|createNumberArray2D_10X10Items()|2D Array 10 items by 10 items|2D array with all elements being 1.0 or -1.0 (alternating)|2D Array is null|Fail|
Data Utilities|createNumber2DArray()|createNumberArray2D_Null()|Throws Illegal argument Exception|Illegal argument Exception|Illegal argument Exception|Pass|


| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Data Utilities|getCumulativePercentage () |CummulativePercentagesTestOne()|1 row table with 1 value of 1|1.0|Infinity|Fail|
Data Utilities|getCumulativePercentage () |CummulativePercentagesTestTwo()|3 row tablewith 3 value(Javadoc example)|0.3125|0.454545|Fail|
Data Utilities|getCumulativePercentage () |CummulativePercentagesTestThree()|3 row tableWith 1 value of 0|Not a Number|Not a Number |Pass|
Data Utilities|getCumulativePercentage () |CummulativePercentagesTestFour()|2 row table with 2 values of negative integers|0.375|0.6|Fail |
Data Utilities|getCumulativePercentage () |CummulativePercentagesTestFive()|2 row table with 2 values 1 negative and 1 positive|0.375|-0.6|Fail|




## JUnit/Range Class : We have 31 Test outlined
| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Range|equals() |equalsOneTest()|Range(-15, 10)Testing “-” and “+”|True|True|Pass|
Range|equals()|equalsTwoTest()|Range(-5,-2)Testing “-” and “-”|True|True|Pass|
Range|equals()|equalsThreeTest()|Range(10,15)Testing “+” and “+”|True|True|Pass|
Range|equals()|equalsFourTest()|Range(0,0) Testing “0” and “0”|True|True|Pass|
Range|equals()|equalsFiveTest()|Range(0,15) Testing “0” and “+”|True|True|Pass|
Range|equals()|equalsSixTest()|Range(-15,0)Testing “-” and “0”|True|True|Pass|
Range|equals()|equalsSevenTest()|Testing range with itself|True|True| Pass|
Range|equals()|equalsFailTest()|Testing ranges that are different|False|False|Pass|


| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Range|getLength()|correctLengthShouldBeFifthteen()|Range(-5,10)Testing “-” and “+”|15|15|Pass|
Range|getLength()|rangeShouldBeFive()|Range(-10,-5)Testing “-” and “-”|5|5|Pass|
Range|getLength()|rangeShouldBeTen()|Range(0,10)Testing “0” and “+”|10|10|Pass|
Range|getLength()|rangeShouldBeEight()|Range(2,10)Testing “+” and “+”|8|8|Pass|
Range|getLength()|rangeShouldBeZero()|Range(0,0)Testing “0” and “0”|0|0|Pass|



| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Range|getLowerBound()|lowerBoundShouldBeMinusFive()|Range(-5,10) Testing “-” and “+”|-5.0|-5.0|Pass|
Range|getLowerBound()|lowerBoundShouldBeZero()|Range(0,10) Testing “0” and “+”|0.0|0.0|Pass|
Range|getLowerBound()|lowerBoundShouldBeTwo()|Range(2,10) Testing “+” and “+”|2.0|2.0|Pass|
Range|getLowerBound()|lowerBoundShouldBeMinusTen()|Range(-10, -5) Testing “-” and “-”|-10.0|-10.0|Pass|
Range|getLowerBound()|lowerBoundShouldBeZeroZero()|Range(0,0) Testing “0” and “0”|0.0|0.0|Pass|


| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Range|getUpperBound()|getUpperBoundOne()|Range(-15, 100)Testing “-” and “+”|100.0|-15.0|Fail|
Range|getUpperBound()|getUpperBoundTwo()|Range(-5,-2)Testing “-” and “-”|-2.0|-5.0|Fail|
Range|getUpperBound()|getUpperBoundThree()|Range(10,15)Testing “+” and “+”|15.0|10.0|Fail|
Range|getUpperBound()|getUpperBoundFour()|Range(0,0) Testing “0” and “0”|0.0|0.0|Pass|
Range|getUpperBound()|getUpperBoundFive()|Range(0,15) Testing “0” and “+”|15.0|0.0|Fail|
Range|getUpperBound()|getUpperBoundSix()|Range(-15,0)Testing “-” and “0”|0.0|-15.0|Fail|

| Class     | Method  | Test Case | Description | Expected Output | Actual Output | Pass/Fail |
| -------- | --- | ---| --- | --- | ---- | ---- |
Range|toString()|toStringOne()|Range(-15, 10)Testing “-” and “+”|Range[-15.0,10.0]|Range[-2.5,10.0]|Fail|
Range|toString()|toStringTwo()|Range(-5,-2)Testing “-” and “-”|Range[-5.0,-2.0]|Range[-3.5,-2.0]|Fail|
Range|toString()|toStringOThree()|Range(10,15)Testing “+” and “+”|Range[-10.0,15.0]|Range[-12.5,15.0]|Fail
Range|toString()|toStringFour()|Range(0,0) Testing “0” and “0”|Range[0.0,0.0]|Range[0.0,0.0]|Pass|
Range|toString()|toStringFive()|Range(0,15) Testing “0” and “+”|Range[0.0,15.0]|Range[7.5,15.0]|Fail|
Range|toString()|toStringSix()|Range(-15,0)Testing “-” and “0”|Range[-15.0,0.0]|Range[-7.5,0.0]|Fail|


## Mocking benefits and drawbacks
Benefits of using mocking would be that we can use mocking on units that have external dependencies such as getting data from a database, we may simulate this by using a mocking object. Mocking helps test very efficiently any functionality between objects and the SUT. As well it. A few drawbacks our group found are that getting some wrong outcomes(false positives) if you don’t quite understand how the mocking object works with the expected results. As well, if the unit undergoing mocking has an error, it will not catch it. Overall our group found that mocking was quite efficient for the unit test we implemented and helped us understand how mocking can help with our black box testing.



# 4 How the team work/effort was divided and managed

First things first (corny ahh opening) Our team of four divided the work by each assigning ourselves one function from the Range class and one function from the DataUtilities class. Each group member will come up with test cases for their assigned functions until all assigned functions are completed. Once all group members have completed their assigned functions, our team came together to discuss bugs/problems we found while trying to write test cases for our functions. After tackling the problems our team members found, we decided to go into pair testing in order to finish off the last two functions. One pair took on the last function from DataUtilities class while the other pair picked another function to test from the Range class. Once both functions’ testings were complete, the group came together to discuss the new findings from these functions. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

The first difficulty that our team faced was the lack of knowledge of how to use JUnit especially with Eclipse, since this is an IDE that our team is not very familiar with. Following section 2.1 from the assignment handout really allowed our team to pick up the unfamiliarized IDE quickly and set up the IDE properly so that it is ready for testing. The assignment handout also had very clear and precise instructions for creating test cases. The simple JUnit test code provided in section 2.1.3 gave our group a strong starting point and clear direction for how the JUnit test cases should look. Eventually, our group became comfortable working in Eclipse as well as using JUnit. 

One of the greater difficulties encountered by our team was the inexperience with mocking. Nobody in our team has had any previous experience with mocking so the idea and implementations are brand new to the team. Using the assignment handout to our advantage, section 2.2.2 was able to get our team started by giving us an example of a mock test using the JMock mocking framework. Further research about mocking was also done by each individual on their own time in order to help understand how JMock works. Through this challenge, our team was able to learn how to properly create mocking tests through the JMock framework. 

The third difficulty was deciding which team member got what functions due to the difficulty of some methods. Since our experience with unit testing was introductory, splitting up the task really depended on the comfortability of our knowledge of unit testing and Junit. It would not be fair to give a group member a hard function to test alone, in result we would all work together if needed to write the test cases. Lesson learned through this challenge is to work collaboratively on the methods in order to incorporate everyone's ideas and come together and solve the problem at hand faster.

Lastly, some group members ran JUnit 5 while others were running JUnit 4. This made compatibility an issue when trying to create an entire test suite for submission. The group member in charge of gathering all test cases was running JUnit 4, which made it difficult when trying to use functions that other group members used when running JUnit 5. There was no backwards compatibility for these functions, specifically assertThrows(), therefore some research had to be done in order to find out how to run different JUnit 5 functionalities in JUnit 4. The lesson learned was to communicate with the team on what specifics and standards before starting an assignment, therefore everyone is on the same page and there are no issues with compatibility.


# 6 Comments/feedback on the lab itself

Our group found this lab a great introduction to JUnit and mocking testing using a  black-box testing approach. The lab document had well laid out instructions in order to show our group how to unit test in a step-by-step manner. In conclusion, the lab was well detailed helping our group tackle the assignment and develop our skills in unit testing.
