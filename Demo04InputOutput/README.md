Console I/O, using Scanner.

Scanner implements the Closeable interface. This allows you to use a try ... catch block to implement
close() for you. Note the special syntax in the try ... clause -- scanner.close() is invoked when
scanner goes out of scope.