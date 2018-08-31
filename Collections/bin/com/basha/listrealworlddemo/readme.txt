**There are several ways in order to sort a list collection by multiple attributes (keys) of its elements type. 
For example, sorting a list of employees by their job title, then by age, and then by salary. In this article, 
we are going to discuss the two common ways which are easy to understand and implement. 
That are, using a chained comparator, and using a CompareToBuilder class of the Apache Commons Lang library.**

--> The key points here are this comparator takes a list of comparators passed via its constructor; 
	and the compare() method iterates over this comparators list to compare two Employee objects by each individual comparator. 
	Now, we create separate comparators for each field by which we want to sort: job title, age and salary.
	
	
https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example