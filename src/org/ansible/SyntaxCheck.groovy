package org.ansible

def call(String playbook) {
    sh "ansible-playbook --syntax-check ${playbook}"
}
