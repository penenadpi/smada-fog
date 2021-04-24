param numServers;
param numContainers;
set Servers:=1..numServers;
set Containers:=1..numContainers;
param Capacity {i in Servers};       
param Demand {j in Containers}; 
param Speed {i in Servers, j in Containers};
param ServerLocation {i in Servers};
param ContainerEnvironment {j in Containers};
param CpuSpeed {i in Servers};
param Version {j in Containers};
param Architecture {i in Servers};
param Energy{i in Servers};
param CpuDemand {j in Containers};

# Variable declaration
var Allocation {i in Servers, j in Containers} >= 0 binary;
# objective function
maximize ExecutionSpeed:
	 sum{i in Servers, j in Containers}Allocation[i,j]*(CpuDemand[j]/CpuSpeed[i]);   
# constraints
subject to memorylimit {i in Servers}:
	sum{j in Containers}Allocation[i,j]*Demand[j] <= Capacity[i];
# constraints
subject to alloc {j in Containers}:
	sum{i in Servers}Allocation[i,j]=1;
# constraints	
subject to executionenv {i in Servers}:
	sum{j in Containers}abs((Architecture[i]-Version[j]))*abs((ServerLocation[i]-ContainerEnvironment[j]))*Allocation[i,j] = 0;
