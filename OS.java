
package os;

import application.Application;

public class OS {
    private int id;
    private static int latestId;
    private String name;
    private Application[] apps;
    private int storageSize;
    private int usedStorage;
    private int count;

    public OS(int id, String name, int storageSize) {
        this.id = latestId++;
        this.name = name;
        this.storageSize = storageSize;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Application[] getApps() {
        return apps;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public int getUsedStorage() {
        return usedStorage;
    }
    
    public boolean addApplication(Application newApplication){
        if ( newApplication.getSize() + usedStorage > storageSize ) return false;
        
        if (apps.length == count) {
        Application[] temp = new Application[apps.length * 2];

            for (int i = 0; i < count; i++) {
                temp[i] = apps[i];
            }
            apps = temp;
        }
        apps[count++] = newApplication;
        usedStorage += newApplication.getSize();
        return true;
    }
    
    public void removeApplication(int id){
        if (count <= 0) return;

        int tempCount = 0;
        Application[] temp = new Application[--count];
            for (int i = 0; i <= count; i++) {
               if (apps[i].getId() == id) {
                usedStorage -= apps[i].getSize();
                continue;
                }
            temp[tempCount++] = apps[i];
            }
        apps = temp;
    }
    
    public Application getApplicationIdByName(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equals(apps[i].getName())) return apps[i];
        }
    return null;
    }

    @Override
    public String toString() {
        return "OS{" + "id=" + id + ", name=" + name + ", apps=" + apps + ", storageSize=" + storageSize + ", usedStorage=" + usedStorage + ", count=" + count + '}';
    }
    
    
    
    
    
}
/*Instance variables
id: private int
latestId: private static int
name: private String
apps: private Application[]
storageSize private int
usedStorage private int
count private int
Constructor
The constructor should do these following task:

set id as latestId
increment latestId by 1
receive the name, and storageSize, the assign it to the instance variables

Methods
Getters of variables: id, name, apps, storageSize, and usedStorage
addApplication(newApp:Application):boolean:
this method should add a new element to the apps array and increase the usedStorage by the application size
return false if the new application size is bigger than the remaining storage, otherwise, return true at the end of the process
removeApplication(id:int): this method should remove a specific application from the apps array and free the storage size used by the application
getApplicationIdByName(name:String):Application: this method should find and return application id
toString():String*/