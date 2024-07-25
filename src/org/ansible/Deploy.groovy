package org.ansible

def call(String playbook) {
    sh "ansible-playbook ${playbook} -i ansible/inventory.ini"
}
