val sparkVersion by project

application {
    mainClassName = "com.sumo.experiments.MLJobKt"
}

dependencies {
    compile(project(":shared"))

    compile("org.apache.spark:spark-mllib_2.11:$sparkVersion")
}
