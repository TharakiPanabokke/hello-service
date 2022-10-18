# Hello Service (Java)

Simple Java 11 service for testing the build pipelines.

In order to check if it's running correctly, you can use these routes:
- /hello-world
  - It will output a "Hello World" message
- /hello
  - For this route, you'll need to setup a runtime environment variable named "greetings".
  - It will output the content of "greetings".