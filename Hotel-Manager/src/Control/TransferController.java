/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.RoomController.FILE_PATH;
import Model.Room;
import Model.Transfer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Schork
 */
public class TransferController {

    public static final String FILE_PATH = "d:/Hotel-manager-files/transfers.txt";
    ArrayList<Transfer> transfers = new ArrayList<>();

    public ArrayList<Transfer> getAllTransfers() {
        readTransfersFromFile();
        return this.transfers;
    }

    private boolean readTransfersFromFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                transfers.clear();
                while (line != null) {

                    String[] StringifiedTransfer = line.split(";");
                    Transfer transfer = new Transfer();

                    transfer.setCode(Integer.parseInt(StringifiedTransfer[0]));
                    transfer.setDate((StringifiedTransfer[1]));
                    transfer.setDescription(StringifiedTransfer[2]);
                    transfer.setTypeIn(Boolean.parseBoolean(StringifiedTransfer[3]));
                    transfer.setValue(Float.parseFloat(StringifiedTransfer[4]));

                    this.transfers.add(transfer);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public float getTotalTransferEntries() {
        readTransfersFromFile();
        float amount = 0;
        for (Transfer transfer : transfers) {
            if (transfer.isTypeIn()) {
                amount = amount + transfer.getValue();
            }else{
                amount = amount - transfer.getValue();
            }
        }
        return amount;
    }

    public boolean transferExistsInFile(int transferNumber) {
        readTransfersFromFile();
        for (Transfer transfer : this.transfers) {
            if (transfer.getCode() == transferNumber) {
                return true;
            }
        }
        return false;
    }

    private boolean saveTransfersToFile() {
        try {
            FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("");

            for (Transfer transfer : this.transfers) {
                bufferedWriter.write(transfer.toFileString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String createNewTransfer(Transfer transfer) {
        readTransfersFromFile();
        try {
            if (transferExistsInFile(transfer.getCode())) {
                String message = "Já existe um quarto com esse número cadastrado!";
                System.out.println(message);
                return message;
            }

            this.transfers.add(transfer);

            if (this.saveTransfersToFile()) {
                String message = "Cadastro efetuado com sucesso!";
                System.out.println(message);
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String message = "Não foi possível cadastar um novo quarto";
            System.out.println(message);
            return message;
        }
        String message = "Erro inesperado!";
        System.out.println(message);
        return message;
    }

}
