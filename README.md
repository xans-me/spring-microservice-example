## Overview

Pattern : Services-Registration Pattern with Eureka & Netflix Hystrix Discovery Client

## Hierarchical

1. service-registry
2. cloud-config-server
3. cloud-gateway (API Gateway)
4. All Other Services (hystrix-dashboard, user-service, department-service)

## Overview Microservices 
![image](https://user-images.githubusercontent.com/23119469/153823793-20a67bc3-5452-4e3c-9de0-2e2f53b4e119.png)

## POD structure name

`podname-{replica-index}.{serviceName}.default.svc.cluster.local`
