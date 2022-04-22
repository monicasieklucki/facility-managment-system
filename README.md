# facility-managment-system

Project 1:

Project 2:
We worked on configuring java beans managed by Spring container to match our facility management system design. The beans represent every object and data access object contained in our system. We instantiate a Spring IoC using ApplicationContext from a single XML file. I instantiated beans starting with the DAOss: facilityManager, maintenanceManager, and useManager. The attributes for them was id, class, and scope. The id is the unique identifier of the bean, the class attribute specifies the class of the bean to be constructed in the case where the container itself directly creates the bean by calling its constructor reflectively. The scope for each bean in this project is a prototype because it scopes a single bean definition to any number of object instances. Each bean contain a getter and setter method and an empty constructor. The daos also consist of a property containing the name and a collections list element. The beans representing the domain objects are very similar. All contain an id, class, prototype, and the corresponding properties. Some properties might be a list, a value, or reference to another bean.
