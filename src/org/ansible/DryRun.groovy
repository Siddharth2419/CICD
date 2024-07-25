package org.ansible

def call(String playbook) {
    sh "ansible-playbook --check ${playbook}"
}
