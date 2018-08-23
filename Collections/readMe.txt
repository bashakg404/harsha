Collections.

Collections is wonderful framework provided by Java, which used for mainly to manipulate the data like add, delete, min, max, sort
contains, etc..
	
Collection frame work come up with heterogeneous technique unlike Arrays.

There are mainly 3 Types in collections
1. List
2. Set
3. Queue
4. Map

"Collection is an "interface" which can be used to represent a group of objects as a single entity. 
Whereas "Collections is an utility class" present in java.util package to define several utility methods for Collection objects.

Collection--------------------interface 
Collections------------------class

**List**
List interface allows duplicate values.
List interface is maintains the insertion order
List allows null elements, also it can allow many null objects.

ARRAYLIST

->If you want to access the elements frequently then we can use List interface. Also if you want to store the elements as you inserting 
means then also List is a way to go.

->ArrayList and Vector classes implements RandomAccess interface so that any random element we can access with the same speed. 
Hence ArrayList is the best choice of "retrival operation".

->Arraylist is not synchronized.

->If insertion/deletion operation is in the middle then Arraylist is worst choice,
 because it has to do lot of shifting operation to perform to provide the output. To overcome we have LINKEDLIST.
 
 LINKEDLIST
 
 ->If our insertion and deletion operation is in the middle then LinkedList is a best choice.
 
 ->Insertion order is preserved.
 
VECTOR

->Every method present in Vector is synchronized and hence it is Thread safe.

->By default vector object capacity is 10.Once its filled new vector object will be created ie, newcapacity=currentcapacity*2.(10*2=20)
 
FAIL FAST AND FAIL SAFE
Fail-Fast means any structural modification done during iteration will throw ConcurrentModificationException.
Fail-Safe means any structural modification done during iteration will not throw ConcurrentModificationException.

The below classes are Fail-Fast iterator

*ArrayList
*LinkedList
*vector
*HashSet
*EnumSet
*LinkedHashSet
*TreeSet
*HashMap
*Hashtable
*LinkedHashMap
*TreeMap
*IdentityHashMap

The below classes are Fail-Safe iterator

*CopyOnWriteArrayList
*CopyOnWriteArraySet
*ConcurrentSkipListSet
*ConcurrentHashMap
*ConcurrentSkipListMap

****HASH MAP DEMO****

-->Hash Map works on the principle of hashing.
-->Hashing is the process of indexing and retrieving the data in a data structure to provide faster way to finding the data using
   hash Key.
-->HashMap maintains an array of buckets. each buckets is linked list of a private static inner class called an entry class.
-->Hash map is used typically increase the performance of the large collection of data.

EXAMPLE: Imagine a set of buckets are lined up in the floor, Some one hands you a paper with the movie name on it. You take the movie 
name and calculate the hash code for each name of movie by calculating total no of characters in that name.

So now imagine that bucket represents the diff code number(Hashcode) and place the piece of paper into corresponding bucket according 
to its Hashacode value.

Here Movie LAGAAN has 6 letters so it will put into the bucket with the value 6.
Similarly, PK has 2 letters so it will put into the bucket with the value 2 and so on.

So after some values here is the table looks like
			Key 			Value(HashCode)
			LAGAAN			6
			PK				2
			FAN				3
			DANGAL			6
			BAHUBALI		8
			
SO now imagine someone comes up and shows you a name and says "please retrieve the the piece of paper that matches this name"
So you look at the name they show you, and run the same hashcode-generating algorithm. The hashcode tells you which bucket you should 
look to find the same.

EQUALS() METHOD:
In above example you might noticed that two diff names may result in the same value. Such situation is known as Hashing Collision.

For example LAGAAN and DANGAL have the same number of letters so hashcode will be identical for both the names. Thats fine.
But it means someone asks you for the LAGAAN piece of paper, you still have to search through the target bucket reading each name
until you find the LAGAAN rather than DANGAL.

The hash code tells you only about which to go into, but not how to locate the name once we are in the bucket. 
In such cases, EQUALS() method is used to locate the exact match.

HashMap provides put(key, value) for storing and get(key) method for retrieving Values from HashMap.

How Put() Method Works Internally?
-->Using hashCode() method, hash value will be calculated. Using that hash it will be ascertained, 
	in which bucket particular entry will be stored.
-->equals() method is used to find if such a key already exists in that bucket, 
	if no then a new node is created with the map entry and stored within the same bucket. A linked-list is used to store those nodes.
-->If equals() method returns true, which means that the key already exists in the bucket. 
	In that case, the new value will overwrite the old value for the matched key.

How Get() Method Works Internally?
-->Using the key again, hash value will be calculated to determine the bucket where that Entry object is stored. 
-->In case there are more than one Entry objects are stored within the same bucket as a linked-list, 
	equals() method will be used to find out the correct key.
-->As soon as the matching key is found, get() method will return the value object stored in the Entry object.
  
