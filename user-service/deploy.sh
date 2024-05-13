echo "running user service"

REPO_NAME_SPACE="vishwasraiborde19"
IMAGE_NAME="user-ms"
TAG_VERSION="latest"

mvn clean install -DskipTests=true

echo  "build push" $IMAGE_NAME
docker build -t $IMAGE_NAME .

echo  "image tag" $IMAGE_NAME:$TAG_VERSION $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION
docker image tag $IMAGE_NAME:$TAG_VERSION $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION

echo  "image push" $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION
docker image push $REPO_NAME_SPACE/$IMAGE_NAME:$TAG_VERSION

kubectl apply -f deploy/kube/user-deployment.yaml
kubectl apply -f deploy/kube/user-service.yaml

#minikube service task-ms-svc -n platform --url
