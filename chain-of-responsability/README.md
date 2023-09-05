# Filteing acess

this examples shows how a request contaning user data passes a sequential chain of handlers that perform various things such as **authentication, authorization, and validation**.

This example is a bit different from the canonical version of the pattern given by barios authors. Most of the pattern examples are built on th notion of looking for ther rigth handler, launching it and exiting the chain after that. But here we execute every handler until there's one that can's handler a request. Be aware that this stail is the Chain of responsibility pattern, even though the flow is a bit different.


