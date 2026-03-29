def newDownload(repo)
{
   git 'https://github.com/IntelliqDevops/${repo}'
}

def newBuild()
{
   sh "mvn package"
}
