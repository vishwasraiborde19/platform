minikube addons enable registry
minikube start --insecure-registry="localhost:29460" --driver=docker
kubectl port-forward --namespace kube-system service/registry 29460:80