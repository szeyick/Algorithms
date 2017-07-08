## Hash Functions

A hash function takes an input (like a string) and outputs a hash, a unique representation of the input. Because the hash is unique, it can be used as a "secret" reference to something.

This concept is used for hash maps. We can use the hash value as the "key" to have a constant time lookup for a particular item. The key will refer to a particular array index.