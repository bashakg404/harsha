Hibernate Advanced Mapping[OneToOne Mapping]
-->When you want to get the details from table which are mapped by using one of the below mapping
	1.OneToOne
	2.OneToMany
	3.ManyToMany

-->So using Foreign Key we can communicate with the other table.

-->To Achieve OneToOne mapping we need have 2 tables where one of the column shud match in both the table ie Foreign Key

@OneToOne(mappedBy=tablename)-->This annotation will map the two given table using the given classes
@JoinColumn-->Using this we will establish one to one relationship. So hibernate will join the table using the foreign key relationship

Entity LifeCycle
These are set of states hibernate can go through in your application

DETACHED--> If entity is Detached, It means its not associated with the Session.
Merge-->If the instance is Detached from session, merge will reattach to session.
PERSIST-->It means the transitions instances to managed state.
REMOVE-->Transitions managed entity to be removed.


@CascadeType
This annotation is responsible for the database table modification, means if you make CascadeType.All that means all the operations 
we are applying to entity class that will also applied to related entity class.
In this example if you make changes in Instructor table that will make changes in Instructor Details table as well. 
Remember By default no operations are Cascaded.

**Transaction Management**
--> Any application which needs to be achieve Transaction Management succefully need to obey the below ACID properties
	A--> Atomicity==> It will ensure either all the operations can be done or all operations can be undone.
	C--> Consistancy==> After the transactions completed successfully the data in the Data source should be reliable data.
	I--> Isolation==> If two transactions are going on the same data, one will not disturb another
	D--> Durability==> After a transaction is completed, 
	the data in the datastore will be permanent until another transaction is going to be performed on that data
