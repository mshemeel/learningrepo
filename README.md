# learningrepo

Sample problems for my personal learning

# Notes
# Serialization
1. Serialization -> converting an object to stream of bytes (can be stored as .ser file), 
2. Deserialization -> recreating object from the stream of bytes (create from .ser file)
3. Serializable -> marker interface : lets JVM knows that this object should be serialized
4. SerialVersionUID -> unique id to identify the object. SerialVersionUID is an ID that is stamped on an object when it gets serialized usually hashcode of an object.
5. If the SerialVersionUID is changed InvalidClassException occurs
6. The consequence of not specifying serialVersionUID is that when you add or modify any field in class then the already serialized class will not be able to recover because serialVersionUID generated for a new class and for the old serialized object will be different


# Serialization vs Externalization
1. Externalization provide readExternal() & writeExternal() which gives us flexibility to control java serialization mechanism instead of relying on Java's default serialization

