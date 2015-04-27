json.array!(@turmas) do |turma|
  json.extract! turma, :id, :nome, :codigo
  json.url turma_url(turma, format: :json)
end
