def call(appname) {
echo "Application name :  ${appname}"
def proc = "/home/linuxbrew/.linuxbrew/bin/argocd app get ${appname}".execute();
def outputStream = new StringBuffer();
proc.waitForProcessOutput(outputStream, System.err)
//proc.waitForProcessOutput(System.out, System.err)
echo "Output : ${outputStream}"
echo "Error : ${System.err}"
}
