#rm build/libs/*.jar
rm build
./gradlew build

copytoproject(){
  mkdir "project"
  cp build/libs/*.jar project
}

# shellcheck disable=SC2144
if [ -e build/libs/*.jar ];
then
copytoproject
else
  echo compilation error
fi



