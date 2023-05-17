# learningrepo

Sample problems for my personal learning

# Notes
# Serialization
> Serialization -> converting an object to stream of bytes (can be stored as .ser file), 
> Deserialization -> recreating object from the stream of bytes (create from .ser file)
> Serializable -> marker interface : lets JVM knows that this object should be serialized
> SerialVersionUID -> unique id to identify the object. SerialVersionUID is an ID that is stamped on an object when it gets serialized usually hashcode of an object.
> If the SerialVersionUID is changed InvalidClassException occurs
> The consequence of not specifying serialVersionUID is that when you add or modify any field in class then the already serialized class will not be able to recover because serialVersionUID generated for a new class and for the old serialized object will be different


# Serialization vs Externalization
> Externalization provide readExternal() & writeExternal() which gives us flexibility to control java serialization mechanism instead of relying on Java's default serialization

