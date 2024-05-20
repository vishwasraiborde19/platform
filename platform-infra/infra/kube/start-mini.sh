minikube delete
minikube start
minikube addons enable registry
minikube start --insecure-registry="localhost:24505" --driver=docker
kubectl port-forward --namespace kube-system service/registry 24505:80