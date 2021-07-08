def call(appname) {
echo "Application name :  ${appname}"
def proc = "argocd app get ${appname}".execute();
def outputStream = new StringBuffer();
proc.waitForProcessOutput(outputStream, System.err)
//proc.waitForProcessOutput(System.out, System.err)

}
