using System;
using System.Collections.Generic;

class Program
{
    static void AddTask(List<string> tasks)
    {
        Console.Write("Entrez une nouvelle tâche: ");
        string newTask = Console.ReadLine() ?? "";
        tasks.Add(newTask);
        Console.WriteLine("Tâche ajoutée à la liste.");
    }

    static void EndTask(List<string> tasks)
    {
        Console.Write("Entrez le numéro de la tâche terminée: ");
        int completedTaskIndex = int.Parse(Console.ReadLine() ?? "0") - 1;
        if (completedTaskIndex < 0 || completedTaskIndex >= tasks.Count)
        {
            Console.WriteLine("Le numéro de la tâche est invalide.");
        }
        else
        {
            tasks[completedTaskIndex] += " (terminée)";
            Console.WriteLine("Tâche marquée comme terminée.");
        }
    }

    static void DeleteTask(List<string> tasks)
    {
        Console.Write("Entrez le numéro de la tâche à supprimer: ");
        int taskIndexToRemove = int.Parse(Console.ReadLine() ?? "0") - 1;
        if (taskIndexToRemove < 0 || taskIndexToRemove >= tasks.Count)
        {
            Console.WriteLine("Le numéro de la tâche est invalide.");
        }
        else
        {
            tasks.RemoveAt(taskIndexToRemove);
            Console.WriteLine("Tâche supprimée de la liste.");
        }
    }

    static void DisplayTasks(List<string> tasks)
    {
        Console.WriteLine("Liste des tâches:");
        for (int i = 0; i < tasks.Count; i++)
        {
            Console.WriteLine($"{i + 1}. {tasks[i]}");
        }
    }

    static void Leave(string message = "Au revoir !")
    {
        Console.WriteLine(message);
    }

    static void HandleError(string message = "Choix invalide.")
    {
        Console.WriteLine(message);
    }

    static void Main(string[] args)
    {
        List<string> tasks = new List<string>();

        while (true)
        {
            Console.WriteLine(
                "Que souhaitez-vous faire ?\n1. Ajouter une tâche\n2. Marquer une tâche comme terminée\n3. Supprimer une tâche\n4. Afficher la liste des tâches\n5. Quitter"
            );

            string choice = Console.ReadLine() ?? "hello";

            switch (choice)
            {
                case "1":
                    AddTask(tasks);
                    break;
                case "2":
                    EndTask(tasks);
                    break;
                case "3":
                    DeleteTask(tasks);
                    break;
                case "4":
                    DisplayTasks(tasks);
                    break;
                case "5":
                    Leave();
                    return;
                default:
                    HandleError();
                    break;
            }

            Console.WriteLine();
        }
    }
}
