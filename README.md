# MySql Data to JSON Object 

## Create Maven WebApp architecture
---

> mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=JspJSON -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

## Adding Dependency to the POM.xml file.
---

```
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
<dependency>
<groupId>com.google.code.gson</groupId>
<artifactId>gson</artifactId>
<version>2.8.0</version>
</dependency>
```

## JSON Convertor using GSON


```Java
package com.mycompany.app;
import com.google.gson.Gson;

public class JSONConverter {

	private static Gson gson = new Gson();
	
	public static String convert(Object object) {
		
		return gson.toJson(object);
	}
}
```

## Adding CDN for BootStrap and JQuery.
---
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.js"></script>

## Created DB in MySql and Connected with JDBC deiver

```java
 	Class.forName("com.mysql.jdbc.Driver");
 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
 ```

## converting object to json using Gson api.
```java
out.println(JSONConverter.convert(employee));
```	


