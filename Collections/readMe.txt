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


