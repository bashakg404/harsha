Section 65**Spring REST Curd DB Real Time Project--Exception Handling

->When we make request to get a data we may get Bad data some time so exception is useful to handle these bad data in better way
-->We can use Controller Advice kind of pre process and post processand it will come to controller. In Controller we will check
whether the required data, if its null then through exception, and the exception will go back to the controller Advice where we
can handle these exception. And send back the response in JSON

Dev Process

-->Create the class CustomerErrorResponse in rest package
-->Create CustomExceptionClass and in superclass section select RuntimeException and Check constructor from superclass
-->Now update REST Service to throw an exception if not found. Go To CustomerRestController class.
-->If customer is null through an exception.
-->Now add Exception handler method ie New class CustomerRestExceptionHandler 

use the below annotations 
@ControllerAdvice
@ExceptionHandler
