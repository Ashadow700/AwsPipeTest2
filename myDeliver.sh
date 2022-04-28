CONTAINER_NAME="my-java-container"

OLD="$(docker ps --all --quiet --filter=name="$CONTAINER_NAME")"
if [ -n "$OLD" ]; then
  echo 'removing old'
  docker stop $OLD
fi

echo 'running my deliver'
docker run -i --rm --name $CONTAINER_NAME --detach -p 8070:8070 jenkins-dev:AwsPipeTest2
