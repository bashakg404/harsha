In this project first create Spring Hello world Program
===========================================================
Section 1, 2 & 3(ProjectName::emusicstoreDemoPractice)
***************************************
Create Maven Project as Hello Spring World

-->Update the dependecies from this link
https://mvnrepository.com/artifact/org.springframework/spring-webmvc

-->Create a Home Controller in Controller package

	@Controller-->It means that perticular class is a controller
	@RequestMapping("/")-->For mapping the url pattern

===========================
Creating Landing Page

-->First created folder My Music Shop and downloaded the bootstrap and js css files and pasted in My Music Shop Folder
-->Open Project structure and enable web application and spring
-->Copy js and css file and paste it in web application files
-->Create .jsp file and copy the js file content and paste it in .jsp

================
Now create new package called Model
Then write class which defines all the product related stuffs in music store and initiate those with getters and setters

->Then Create one more package called DAO(Data access object). For time being intiate the product details by using set method. 

->Come back to controller class and establish request mapping for Product list
Then define a product dao instance in the controller class

->Create productList.jsp in view folder and mention the data

->Create two more dummy products in product class

->Go to controller class call all the products

->Go to product list Jsp file and write for each code to access all 3 dummy products

->Go to home.jsp file anf provide the url pattern for product list then it will access from main page 

->Product list jsp file contains all the info about products and header and footer. So we will create to jsp files
  header and footer jsp. in product list jsp file we can use include method to send the request to header and footer.

->Next we can create the detailed product list by crating detailedProduct jsp file.

->Next we will go to bootstrap website and click on CSS to check the image 

->Map the new jsp file in Home controller using @RequestMapping
============================
Lect 16:
->Display a real product details to the ViewProduct page using Bootstrap.

->First add the required icon details from bootstrap page and paste the details in product list jsp.

->Next when click the icon for product displpay it should go to the details page using product id. So first add product id in the list product page

->Use the spring url tag name space to generate the connection when we click the details using froduct id.

->So when we click product details icon it will pick the details by product id at Run Time.

->GO to Home Controller class and change the viewProduct mathod by passing the product id as parameter.

->Create new instance of product they have data accessing object in Home Controller Class and DAO as well.(Method is getProductById).

->To display all the content in one page we modify viewProduct page

->So summury is we used a spring tag in productList jsp file to generate the url which is having dynamic parameter attached to the url( <td><a href="<spring:url value="/productList/viewProduct/${product.productId}" />"). That dynamic parameter(productId) will passed http request to Home Controller[@RequestMapping("/productList/viewProduct/{productId}")]

->@PathVariable will grab the content of the dynamic parameter and put in to variable of this(productid)

***********************************
SECTION 4
(ProjectName::emusicstoreDemoPracticeSect4)

-> Load the Spring Core, orm and Hibernate core, jpa dependencies from mvn repository

-> Load the mysql connector dependency

->Create applicationContext.xml file to define the beans

->Definne the listeners in web.xml file to pass the request

->Define the properties in applicationContext.xml like jdbc url, username, password, sessionfactory, hibernateDialect and transactionManager

->Define tx annotatione driven in dipatcher servlet xml file to take care of the transaction

->Go to the Model class ie Product class and make the class level changes using @Entity and @ID

->Delete the ProductDAO class bcz we dont need hard code date and create interface in the same package

->Implement all the related methods and run it

->The spring will create the table called Product and with the 0 columns

->admin jsp page and map that page in Home Controller using Request mapping

->Create productinventory jsp page and its same ad listProduct jsp page(copy,paste) and map that page into home controller using requesst mapping

->Create add product jsp page to add the new product from admin page

->Map the product jsp page in Home controller by using Requestmapping

******In video 22 ending i was not able to add the product once i submit the product i was getting the below exception --org.springframework.web.util.NestedServletException: Request processing failed; nested exception is org.hibernate.id.IdentifierGenerationException: Unknown integral data type for ids : java.lang.String---********

This is because you are trying String to be database key but in entity class you are using below annotations
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

So replaced with the below 

@Id @GeneratedValue(generator="system-uuid")
@GenericGenerator(name="system-uuid", strategy = "uuid")

It started Working:)

But in DB product id is not in sequese:(

**Lecture-23**

->Lets add delete product function in Product inventory Page.

->In Product DAO impl we already have delete function defined(deleteProduct), we just need to connect it up to the Home controller and then to JSP page

->Go to Home controller add new mapping

**Lecture-24**

->Then add dependency for image uploading in pom.xml

->Create productImage field and setters and getters in Product class and make it as Transient(make the product image as transient bcz when we persist the POJO we dont want file to be part of the process)

->So once we created the fields addProduct page will appear with uplaod picture option. 

->Then implement the function in Home Controller.

-> Implement the bean in applicationContext.xml

->Create the field Path in the Home Controller. Actually our Add Product mapping is responsible for addproduct with image. So write code for that using httpservlet request

->Uploaded images are not saving in my project but in the video its saving. Implement the functionality like when we delete the project it should delete the image from project file.

**Lecture-25**

->In this we are changing GUI parts to makesure it looks better in browser.

->Add edit optin in ProductInventory beside delete option.

->Then Go to Home Controller add edit product functionality by adding new request mapping.

->Edit product is new method so define new method in productDao class and the Dao impl class.

**Lecture-26

->once back end is completed for editProduct(Dao impl, Home Controller), create editProduct.jsp file.

->Copy addProduct code and paste it in editProduct and make a necessary changes. And make sure that change the path to editProduct. 

->But in my project image editing is not happening.

**Lecture-27**

->Change the home.jsp file to look it in betterway.

->This lecture is very important as we are doing front end page layout changing to look our website colourful:)

**Lecture-28**

->This lecture is about validation

->add hibernate validator and javax validatorr into pom.xml

->Go to product class and add some annotations, then go to addproduct jsp page.

->@Valid: Spring will check whether the Product model filed is valid or not based on the product model annotations in the product class

-> So final this lecture is used to print the error messages while addidng product details, if user enter invalid details.

Note:**In section for under validation, in my project its not working properly so i have not included in my project

*************************************************************************************************************************SECTION-5
================
Lecture-30

-> In this lesson we will covering security part, say for example if we click Admin its going to Product inventory page directly, so this not checking whether you are guest or Admin so this not secure. So we are going to use Spring security to check the user identity.

->So first thing we need to add dependencies in Pom.xml. Make sure sprng security(core, web, config) dependencies placed  after spring context. Because spring context is supreme security need to be initialized first.

->Then go to web.xml define filter(filtername, filterclass) and filterchain(filtername, urlpattern)

->So basically above filters will configure supreme filter proxy. And filtername and filtermapping name should be same

->Then we need to go to applicationContext.xml define security configuration http part and security authentication

->Then we need to add login page for security and add header footer from previous jsp file.

Lecture-31  

->So once login jsp is completed come back to Home controller and for understanding purpose we create one more homecontroller class bcz now the home controller class is pretty much big.

->So new controller name will be AdminController and mark is as @Controller using annotation above the class. So this class will be registerred in the Spring container

->Cut the path definiton from HomeController and paste it in AdminController(private Path path;)

->Create one more class as LoginController and enter the admin using requestmapping and check the validation.

->Then we need to add the username and password in DB

->





