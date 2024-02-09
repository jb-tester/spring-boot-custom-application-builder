# Spring Boot hierarchical contexts

### Problems with context detecting:

**Expected:**
all beans included to context are detected;
the beans not included to context are not considered;
the beans defined by base context should be available for child components;
the beans defined in one of sibling configurations should not be available for another one.

**Actual:**

1) the parent configuration class (`BaseCofiguration`) is not included to context: not shown in the Spring view etc
2) the beans defined by this configuration are not detected and are not available for autowiring (see `FirstController#bean2`)
3) the beans from one web context are available for the sibling configuration (see `FirstController#secondCompo`)
4) the configuration class not added to context (`NotIncludedConfiguration`) is still detected as included.

https://youtrack.jetbrains.com/issue/IDEA-345682/Spring-Boot-correctly-detect-hierarchical-context-configured-via-SpringApplicationBuilder

### Problems with endpoints and HTTP Requests generation:

each controller mapping is shown twice, with different context paths (configured as `server.servlet.context-path` in app-specific properties files).
But these controllers are defined in the sibling configurations that use their own context-path only.
also on HTTP request generating for the mapping of one of sibling apps controller 2 request are generated
They use the different context path , but same port and endpoint.
But in this case only one mapping should be created.

https://youtrack.jetbrains.com/issue/IDEA-345686/Spring-Boot-with-multiple-sibling-configurations-treat-endpoints-correctly