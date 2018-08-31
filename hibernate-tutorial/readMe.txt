HIBERNATE FLOW
-->Define the DB details in hibernate.cfg.xml file(DB Name, Username, Password)
-->Create the Table in DB
-->Create the Entity Class and map that class to database table using below annotations.
			@Entity
			@Table
			@Id
			@Column ...etc
-->Create the Class to perform CRUD operation
	In that class follow the below steps
	1.Create Session Factory [SessionFactory factory=new Configuration.configure(hbm.cfg.xml).addAnnotatedClass(Student)
										.buildSessionFactory]
	2.Create the Session [Session session=factory.getCurrentSession()]
	3.Create the object of the Entity class(Ex: Student)
	4.Begin the Transaction(session.beginTransaction)
	5.Save/Delete/Read/Create the session[session.save(studentobject name)]
	6.Commit the Transactions(session.gettransaction.commit())



@Entity--> It will ensure the following class will map to Database
@Table-->It will help us to map the data base table to POJO class
@Id-->It will tell hibernate this column is primary in the DB and generate Primary Key for us
		If you want to mention explicitly use the below Annotations in the POJO class
		@GeneratedValue(strategy=GenerationType.Identity)

		