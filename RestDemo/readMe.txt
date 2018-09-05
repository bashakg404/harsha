spring-core: this is the core module of the Spring framework; it should be used in any Spring-based application.

spring-web, spring-webmvc: these are the web modules which allow you to create either REST resources or standard controllers.

jackson-databind: this library provides implicit conversion between JSON and POJO classes. 
When this library is imported into pom.xml, 
you don't have to worry about converting JSON requests into POJO or POJO responses into JSON; 
this is fully handled implicitly by this library. 
In case you're interested in XML data type, then use jackson-xml-databind.


Following are the common annotations used by our controller:

@RestController: this annotation marks the class as a Resource, 
it defines implicitly both @Controller and @ResponseBody MVC annotations, 
when annotating a class with @RestController, 
it's not necessary to write @ResponseBody beside the POJO classes returned from your methods.

@RequestMapping: this annotation defines the url of the resource in addition to the method type: GET/POST, 
in our example we expose the payment service as POST which is accessed through /payment/pay.

@RequestParam: this annotation represents a specific request parameter, 
in our example, we map a request parameter called key to an argument key of type String.

@RequestBody: this annotation represents the body of the request, in our example, 
we map the body of the request to a POJO class of type PaymentRequest(Jackson handles the JSON/POJO conversion).

As noticed the response is represented as BaseResponse and there is no need to annotate it, 
Jackson converts it implicitly to JSON.

Basically, we need to create two classes:

ApplicationInitializer: this is an initializer class which is loaded at the startup of the application, 
it defines the configuration class of the application along with the context url.

ApplicationConfiguration: this is the configuration class of the application, 
it is basically used to instruct the servlet container to load REST resources from a specific package.

***WEB SERVICES****
--> Web service is technology to communicate one programming language with other.

--> Its protocol based communication and its language independent.

--> It has two types	1.SOAP(Simple Object Access Protocol)
						2.REST(Representational state transfer)
						
--> There are three major web service components available.
				1.SOAP(Simple Object Access Protocol)
				2.WSDL(Web service description language)
				3.UDDI(Universal Description, Discovery and Integration)

 ***SIMPLE OBJECT ACCESS PROTOCOL***
 
SOAP stands for Simple Object Access Protocol. It is a XML-based protocol for accessing web services.

SOAP is a W3C recommendation for communication between two applications.

SOAP is XML based protocol. It is platform independent and language independent. 
By using SOAP, you will be able to interact with other programming language applications.

Advantages
--> It will define its own security as WS Security
--> Language and Platform Independent

DisAdvantages
-->Slow SOAP uses XML format that must be parsed to be read. 
It defines many standards that must be followed while developing the SOAP applications. 
So it is slow and consumes more bandwidth and resource.

-->WSDL dependent: SOAP uses WSDL and doesn't have any other mechanism to discover the service.

***RESTful Web Services***

REST stands for REpresentational State Transfer.

REST is an architectural style not a protocol.

Fast: RESTful Web Services are fast because there is no strict specification like SOAP. 
It consumes less bandwidth and resource.

Language and Platform independent: RESTful web services can be written in any programming language and executed in any platform.


Can use SOAP: RESTful web services can use SOAP web services as the implementation.

Permits different data format: RESTful web service permits different data format such as Plain Text, HTML, XML and JSON.

-->Enlisted below are some common HTTP methods along with their functions that are supported by RESTful web services.

    GET: Read-only access to the resource.
    PUT: Creation of new resource.
    DELETE: Removal of a resource.
    POST: Update of an existing resource.
    OPTIONS: Get supported operations on the resource.
    HEAD: Returns HTTP header only, nobody.
