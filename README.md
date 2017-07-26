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


