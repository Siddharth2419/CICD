job('third-seed-job') {
    description('This is the third seed job created using Job DSL')
    steps {
        shell('echo "Running Third Seed Job"')
    }
}

job('fourth-seed-job') {
    description('This is the fourth seed job created using Job DSL')
    steps {
        shell('echo "Running Fourth Seed Job"')
    }
}
