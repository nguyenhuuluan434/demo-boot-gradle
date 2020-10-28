[tutorial link](https://tomgregory.com/building-a-spring-boot-application-in-jenkins/)
[axion plugin release](https://github.com/allegro/axion-release-plugin)
```groovy
plugins {
    id 'pl.allegro.tech.build.axion-release' version '1.12.1'
}

project.version = scmVersion.version
```

```shell script
$ git tag
<empty list>

$ ./gradlew currentVersion
0.1.0-SNAPSHOT

$ ./gradlew release

$ git tag
release-0.1.0

$ ./gradlew cV
0.1.0

$ git add -A && git commit -m "Updates something" && ./gradlew release

$ git tag
release-0.1.0
release-0.1.1

$ ./gradlew cV
0.1.1
```
