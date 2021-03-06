# facility-managment-system

Project 1:

Project 2:
We worked on configuring java beans managed by Spring container to match our facility management system design. The beans represent every object and data access object contained in our system. We instantiate a Spring IoC using ApplicationContext from a single XML file. I instantiated beans starting with the DAOss: facilityManager, maintenanceManager, and useManager. The attributes for them was id, class, and scope. The id is the unique identifier of the bean, the class attribute specifies the class of the bean to be constructed in the case where the container itself directly creates the bean by calling its constructor reflectively. The scope for each bean in this project is a prototype because it scopes a single bean definition to any number of object instances. Each bean contain a getter and setter method and an empty constructor. The daos also consist of a property containing the name and a collections list element. The beans representing the domain objects are very similar. All contain an id, class, prototype, and the corresponding properties. Some properties might be a list, a value, or reference to another bean.

Project 3: A couple of simple additions have been added to include the design patterns we wanted to implement for this project. The interface that needed to be changed was IFacilityInformation since it was the simplest interface to change. It has a single method that returns the available capacity as an integer. To demonstrate the adapter pattern, the target interface contains the same method, but returns it as a float instead. The adapter takes in the original method and converts the output to a float. Note: I used a composite pattern to build my facility object to include facility detail and facility location instead of using inheritance, so I only have one composite object as the extension point for the bridge pattern and only one object to visit and define a new method using the visitor pattern. We were having difficulty deciding how we wanted to extend functionality in this project, so we ultimately decided on trying to extend the functionality of our facility object. We chose to fill our facility with a certain kind of equipment depending on what kind of facility it is. For example, if it's predominantly an office space, then it has office equipment, if it's a production facility, it has equipment necessary for production. It's a very simplified example and I don't have refined facility classes and I keep the equipment that is contained in a facility very generic. I have an Equipment interface that has refined classes like Office Equipment and Production Equipment. Since I have a single concrete object, I instantiate a Facility class with the equipment that facility has in its parameter to extend functionality of my Facility object while decoupling it from the Equipment functionality. The visitor pattern is implemented on Facility as well. Ideally, the visitor would visit the facility fine-grained classes, but it'll only visit facility. Visitor implments IVisitor with one method called visitFacility with one parameter: Facility facility. It the new operation to be added to Facility simply prints out "Visiting facility object". Then an accept method is added to the Facility object with a visitor parameter that visits this facility instance. 

Class Assignment:
a)


1.
Entity: Facility, FacilityDetail, FacilityLocation, Maintenance, MaintRequest, Use

Value Object: Currently None.

Services: FacilityManager, UseManager, MaintenanceManager

2. Facility(Root Aggregate) -> Aggregates: FacilityDetail, FacilityLocation

3. Bounded Contexts: 
MaintenanceContext -> Facility, Maintenance, MaintenanceManager, MaintRequest
UseContext -> Facility, Use, UseManager
FacilityContext -> Facility, FacilityLocation, FacilityDetail, FacilityManager

b) Two possible entities that can be value objects are MaintRequest and FacilityLocation, if these two objects can be made more generic. 
