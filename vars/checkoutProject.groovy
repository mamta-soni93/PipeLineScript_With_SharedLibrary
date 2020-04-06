def call(String branchSpecifier,String projectName,String credentialsId) {
  echo "In shared library"
  git branch: "${branchSpecifier}", url: "https://github.com/mamta-soni93/${projectName}.git", credentialsId: "${credentialsId}"

}