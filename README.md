I have created an interface AdmissionApplication which is acting as a command. We have created a Course class which acts as a request. We have concrete command classes AcceptCourse and RejectCourse implementing AdmissionApplication interface which will do actual command processing. A class University is created which acts as an invoker object. It can take and process Adission Applications.
University object uses command pattern to identify which object will execute which command based on the type of command. AdmissionManagement, my main class, will use University class to mainnstrate command pattern.


I have created a Subject interface and concrete classes implementing the Subject interface. A factory class SubjectFactory is defined.
CourseManagement, my main class will use SubjectFactory to get a Subject object. It will pass course name information (Maths / Physics / Chemistry) to SubjectFactory to get the type of object it needs.

I have created an QuestionPaper interface and a concrete class CourseExam. WriteExam acts as an adapter which implements QuestionPaper. My main class AssignmentManagement uses WriteExam Adapter to complete CourseExam.


I have created a Student interface and concrete classes StudentOne, StudentTwo implementing the Student interface. A facade class StudentFacade is defined.
StudentFacade class uses the concrete classes to delegate user calls to these classes. StudentManagement, the main class, will use StudentFacade class to show the results.

Command Pattern:
University object uses command pattern to identify which object will execute which command based on the type of command. AdmissionManagement, our demo class, will use University class to demonstrate command pattern.
