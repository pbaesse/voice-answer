json.array!(@turmas) do |turma|
  json.extract! turma, :id, :codigo, :nTurma
  json.url turma_url(turma, format: :json)
end
