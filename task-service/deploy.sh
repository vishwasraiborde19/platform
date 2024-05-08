echo "running task service"

REPO_NAME_SPACE="vishwasraiborde19"
IMAGE_NAME="task-ms"
TAG_VERSION="latest"

mvn clean install -DskipTests=true

echo  "build push" $IMAGE_NAME
docker build -t $IMAGE_NAME .

echo  "image tag" $IMAGE_NAME:$TAG_VERSION $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION
docker image tag $IMAGE_NAME:$TAG_VERSION $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION

echo  "image push" $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION
docker image push $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION

kubectl apply -f deploy/kube/task-deployment.yaml
kubectl apply -f deploy/kube/task-service.yaml

minikube service task-ms-svc --url

$SHELL