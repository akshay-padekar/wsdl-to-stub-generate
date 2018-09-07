# wsdl-to-stub-generate
project to generate stubs from wsdl


# Generating Client Stubs
- Add below dependency to create stubs from wsdl file
<dependencies>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-core</artifactId>
			<version>3.1.4</version>
		</dependency>
</dependencies>

- Add below code in pom.xml to generate client stubs
<plugin>
				<groupId>org.apache.cxf</groupId>
				<artifactId>cxf-codegen-plugin</artifactId>
				<version>3.1.4</version>
				<executions>
					<execution>
						<id>generate-sources</id>
						<phase>generate-sources</phase>
						<configuration>
							<sourceRoot>${basedir}/src/main/java/</sourceRoot>
							<wsdlOptions>
								<wsdlOption>
									<wsdl>${basedir}/src/main/resources/wsdl/XM_V5.wsdl</wsdl>
									<wsdlLocation>classpath:wsdl/XM_V5.wsdl</wsdlLocation>
									<bindingFiles>
										<bindingFile>${basedir}/src/main/resources/wsdl/XMService_binding.xml</bindingFile>
									</bindingFiles>
								</wsdlOption>
							</wsdlOptions>
						</configuration>
						<goals>
							<goal>wsdl2java</goal>
						</goals>
					</execution>
				</executions>
			</plugin>

###### You might want to comment all the above code, or else it will keep on generating the client stubs.

# Connecting to web service
To connect to web service add below dependencies in pom.xml file
- <dependency>
	<groupId>javax.xml.bind</groupId>
	<artifactId>jaxb-api</artifactId>
	<version>2.0</version>
</dependency>

- <dependency>
	<groupId>org.apache.cxf</groupId>
	<artifactId>cxf-rt-ws-security</artifactId>
	<version>3.1.4</version>
</dependency>

- <dependency>
	<groupId>org.apache.cxf</groupId>
	<artifactId>cxf-rt-frontend-jaxws</artifactId>
	<version>3.1.4</version>
</dependency>

- <dependency>
	<groupId>org.apache.cxf</groupId>
	<artifactId>cxf-rt-transports-http</artifactId>
	<version>3.1.4</version>
</dependency>

# Java implementation to connect to web service
Refer to XMClient.java to connect to web service in this project
