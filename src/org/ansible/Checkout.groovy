package org.ansible

def call(String url, String creds, String branch) {
    checkout([$class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: url, credentialsId: creds]]
    ])
}
