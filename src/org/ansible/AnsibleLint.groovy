package org.ansible

def call() {
    sh 'ansible-lint -v'
}
