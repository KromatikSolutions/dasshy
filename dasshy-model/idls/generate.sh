#!/bin/sh


thrift -r -v -out ../src/main/java --gen java:beans,hashcode com.kromatik.dasshy.model.thrift
