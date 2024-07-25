package org.ansible

def call(String playbook) {
    sh "ansible-lint ${playbook} -f plain > ansible-lint-report.txt"
}
