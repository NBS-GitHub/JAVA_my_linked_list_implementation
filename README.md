# JAVA_my_linked_list_implementation

This singly liked list contains the methods:
- insert(int data);               <- inserts data at the last index
- insertAtStart(int data);        <- inserts data at the 0th index
- insertAt(int index, int data);  <- inserts data at the chosen index
- deleteAt(int index);            <- deletes data from the chosen index
- show();                         <- prints the list

Each element of the list is an instance of Node class. Each Node has two properties:
- data <- storing the actual value,
- next <- reference to the next Node.
