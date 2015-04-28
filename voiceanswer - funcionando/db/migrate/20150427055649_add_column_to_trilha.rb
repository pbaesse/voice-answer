class AddColumnToTrilha < ActiveRecord::Migration
  def change
    add_column :trilhas, :turma_id, :integer
  end
end
