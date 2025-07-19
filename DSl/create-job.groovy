def environment = 'DEV'

job("Sample_Job_${environment}") {
    description("This is a sample Job for ${environment} environment")

    parameters {
        stringParam('ENV', environment, 'Environment to deploy (e.g. DEV, QA, PROD)')
    }

    scm {
        git('https://github.com/example/repo.git')
    }

    steps {
        shell('''
            echo "Running in $ENV environment"
            echo "Deploying to ${ENV}"
        ''')
    }

}
