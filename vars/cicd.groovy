def newdownload(repo){
git 'https://github.com/IntelliqDevops/${repo}'
}
def build(){
sh 'mvn package'
}
